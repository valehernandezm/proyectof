/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.ArrayList;
import java.time.*;
import java.util.Calendar;

/**
 *Clase de la tienda
 * @author sljim
 */
public class Tienda {
    
//-------------------------------------------- 
// Atributos
//--------------------------------------------

/**
 * Nombre que tiene el supermercado
 */    
private String NombreTienda;

/**
 * Calendario de la tienda
 */
private Calendar Fecha;

/**
 * 
 */
private ArrayList<Proveedor> Proveedores;

/**
 * 
 */
private ArrayList<Empleado> Empleados;

/**
 * 
 */
private ArrayList<Factura> Facturas;

/**
 * 
 */
private ArrayList<Producto> Canasta;


//-------------------------------------------- 
// Constructor
//--------------------------------------------    
    
/**
 * Constructor para la Tienda
 * @param NombreTienda EL nombre del supermercado
 */
public Tienda(String NombreTienda)
{
    this.NombreTienda=NombreTienda;
    Proveedores = new ArrayList<>();
    Empleados = new ArrayList<>();
    Facturas = new ArrayList<>();
    Canasta = new ArrayList<>();
    
}    
    
//-------------------------------------------- 
// Metodos
//--------------------------------------------

    /**
     * 
     */
     public ArrayList<Producto> darCanasta()
     {
         return Canasta;
     }

    /**
     * 
     * @return 
     */
    public String getNombreTienda() {
        return NombreTienda;
    }

    /**
     * 
     * @param NombreNuevo 
     */
    public void setNombreTienda(String NombreNuevo)
    {
        NombreTienda=NombreNuevo;
    }
    
    /**
     * 
     * @return 
     */
    public ArrayList<Proveedor> getProveedores() {
        return Proveedores;
    }

    /**
     * 
     * @return 
     */
    public ArrayList<Empleado> getEmpleados() {
        return Empleados;
    }

    /**
     * 
     * @return 
     */
    public ArrayList<Factura> getFacturas() {
        return Facturas;
    }
    
    /**
     * 
     */
    public void agregarEmpleado( )
    {
        
    }
    
    /**
     * 
     */
    public void agregarProveedor( String pNombre, int pTelefono, Double Deuda)
    {
        Proveedores.add( new Proveedor(pNombre, pTelefono , Deuda));
    }
    
    /**
     * 
     */
    public Proveedor buscarProveedor( String pNombre )
    {
        Proveedor buscado = null;
        
        for( Proveedor p : Proveedores)
        {
            if(p.getNombreP().equals(pNombre))
            {
                buscado = p;
            }
        }
        
        return buscado;
        
    }
    
    /**
     * 
     */
    public void agregarProducto( String pNombreProveedor ,String pNombreProducto, int pID, Double pCosto, Double pPrecio, int pCantidad )
    {
        Proveedor p = buscarProveedor(pNombreProveedor);
        Producto nuevo = new Producto( pPrecio,pNombreProducto, pID, pCosto,pCantidad);
        
        if(p.buscarProducto(pID) == null)
        {
            p.agregarProducto(nuevo);
        }
        else
        {
            Producto encontrado = p.buscarProducto(pID);
            encontrado.setCantidad(encontrado.getCantidad() + pCantidad);
        }
    }
    
    /**
     * 
     */
    public boolean quitarProducto(String pNombre, int pID)
    {
       boolean exito = false;
       Proveedor p = buscarProveedor(pNombre);
       
       if(p != null)
       {
           exito = p.eliminarProducto(pID);
       }
        
       return exito;
    }
    
        /**
     * 
     */
    public ArrayList<Producto> darTodosLosProductos( )
    {
        
        ArrayList<Producto> lista = new ArrayList<>();
        
        for(Proveedor p : Proveedores)
        {
            lista.addAll(p.darProducto());
        }
        
        return lista;
        
    }
    
    /**
     * 
     * @param pID
     * @param pCantidad 
     */
    public boolean vender( int pID, int pCantidad)
    {
        
        Boolean exito = false;
        
        for(Proveedor p : Proveedores)
        {
            Producto producto = p.buscarProducto(pID);
            
            if(producto != null)
            {
                if(producto.getID() == pID && producto.getCantidad() >= pCantidad)
                {
                producto.setCantidad(producto.getCantidad()- pCantidad);
                Canasta.add( new Producto(producto.getPrecio(), producto.getNombre(), producto.getID(),producto.getCosto(), pCantidad));
                exito = true;
                }
            }
        }
        return exito;
    }
    
    /**
     * 
     */
    public void cancelarVenta( )
    {
        Canasta.clear( );
    }
    
    /**
     * 
     */
    public Factura generarFactura( Double pRecibido, String pNombre, ArrayList<Producto> Canasta )
    {
        Factura nueva = new Factura( Fecha , pRecibido,Facturas.size(), Canasta);
        Facturas.add( nueva );
        
        cancelarVenta();
        
        return nueva;
    }
        
    /**
     * 
     * @return 
     */
    public double calcularCostosTotales( )
    {
       
        double gasto = 0;
        
        for(Producto p : darTodosLosProductos())
        {
            gasto += p.getCosto()*p.getCantidad();
        }
        
        return gasto;
    }

    /**
     * 
     * @return 
     */
    public double calcularGananciasTotales( )
    {
        double ganancia = 0;
        
        for(Factura p : Facturas)
        {
            ganancia += p.getTotal();
        }
        
        return ganancia;
    }

    
}
