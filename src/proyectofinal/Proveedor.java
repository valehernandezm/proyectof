/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.ArrayList;

/**
 *  Clase proveedor que extiende la clase identidad
 * @author sljim
 */
public class Proveedor{
    
//-------------------------------------------- 
// Atributos
//--------------------------------------------
    
/**
 * Lista con todos los productos que se le compran al proveedor 
 */
private ArrayList<Producto> Productos;
 private String nombreP;
 private int ID;
 private double costo;
 private double precio;

    public Proveedor(String nombreP, int ID, double precio) {
        this.nombreP = nombreP;
        this.ID = ID;
        this.precio = precio;
    }
         
    
//-------------------------------------------- 
// Constructor
//--------------------------------------------    

/**
 * Constructos para el proveedor 
 * @param Nombre Nombre del proveedor
 * @param ID Telefono del proveedor
 * @param Costo Dinero que se le debe al proveedor
 * @param Productos Lista de productos que le compro al proveedor, se usará más adelante para hacer pedidos
 */

//-------------------------------------------- 
// Metodos
//--------------------------------------------

/**
 * 
 */
public ArrayList<Producto> darProducto( )
{
    return Productos;
}

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

/**
 * Cambia el nombre del proveedor
 * @param NombreNuevo el nuevo nombre del proveedor
 */
public void cambiarNombre( String NombreNuevo )
{
    setNombreP(NombreNuevo);
}

/**
 * Cambia el telefono del proveedor
 * @param TelefonoNuevo el nuevo telefono del proveedor
 */
public void cambiaTelefono(int TelefonoNuevo)
{
    setID(TelefonoNuevo);
}

/**
 * Método para pagar la deuda con el proveedor
 * @param pPago Valor que se va a abonar a la deuda
 * @return Deuda restante
 */
public Double pagarDeuda(Double pPago)
{
    setCosto((getCosto()-pPago));
    return getCosto();
}

/**
 * Método para agregar a la deuda con el proveedor
 * @param ValorEndeudar dinero que va a agregar a la deuda
 * @return Valor final de la deuda
 */
public Double endeudarse(Double ValorEndeudar)
{
    setCosto((getCosto()+ValorEndeudar));
    return getCosto();
}

/**
 * Agrega productos a la lista de los productos del proveedor 
 * @param pProducto producto que se va a agregar
 */
 public void agregarProducto( Producto pProducto )
 {
     Productos.add(pProducto);
 }
 
 /**
  * Elimina un rpoducto de la lista del proveedor 
  * @param ID numero que identifica el porducto que quiere eliminar
  */
 public boolean eliminarProducto( int ID )
 {
     
     boolean exito = false;
     
     if(!Productos.isEmpty())
     {
         for( Producto p : Productos)
     {
         
         if(p.getID() == ID)
         {
             Productos.remove(p);
             exito = true;
             
         }
         
     }
     }
     
     return exito;
 }
 
 /**
  * Método para buscar un producto 
  * @param ID Número de identificación del producto
  * @return el producto ue se buscó
  */
 public Producto buscarProducto( int ID )
 {
     Producto Buscado = null;
     
     for(Producto p : Productos )
     {
       if(ID == p.getID())
       {
           Buscado=p;
       }
     }
     
     return Buscado;
 }
 
}
