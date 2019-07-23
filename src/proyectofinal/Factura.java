/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *Es una clase que representa una factura, extiende a la clase Identidad
 * @author sljim
 */
public class Factura 
{
 
   //-------------------------------------------- 
   // Atributos 
   //--------------------------------------------
    
    /**
     * Lista con los productos comprados
     */
    private ArrayList<Producto> Compra; 
    private int ID;
    /**
     * El total que se le va a cobrar al cliente
     */
    private Double Total;
    
    /**
     * Dinero que el cliente nos entrega 
     */
    private Double Recibido;
    
    /**
     * Fecha en la que se genero la factura
     */
    private Calendar Fecha;
    
    /**
     * Contenido de la factura
     */
    private ArrayList<String> Contenido;
    
   //-------------------------------------------- 
   // Constantes
   //--------------------------------------------
  
   /**
    * Porcentaje de impuesto sobre la venta
    */
   public final static Double IMPUESTO= 0.1; 
    
   //-------------------------------------------- 
   // Constructor
   //--------------------------------------------

   /**
    * Constructor de la factura
    * @param Total El total que el cliente debe pagar
    * @param Recibido Dinero qu eel cliente entrega
    * @param pID Número de la factura
    * @param pDescripcion lista que describe lo que el cliente compró
    */
    public Factura(Calendar fecha, Double Recibido,int pID, ArrayList<Producto> pCompra) 
    {
       pID = ID;
       Compra=pCompra;
       Fecha = fecha;
       Contenido = new ArrayList<>();
       Total = 0.0;
       
       
       
        //Contenido.add("" + Fecha.toString());
        Contenido.add("Nombre-Cantidad-Precio");
        
        for( Producto p:Compra)
        {
            Contenido.add(p.getCantidad() + "-" + p.getPrecio());
            Total+=p.getPrecio();
        }
       
        Contenido.add("Total");
        Contenido.add(""+Total);
        Contenido.add("Recibido");
        Contenido.add("" + Recibido);
        Contenido.add("Vueltas");
        Contenido.add("" + (Recibido - Total));
        
   
        
    }

   //-------------------------------------------- 
   // Metodos
   //--------------------------------------------
    
    /**
     * Para poder consultar la lista con lo que el cliente compró
     * @return regresa la lista con los productos, precios y cantidad
     */
    public ArrayList<Producto> getCompra() {
        return Compra;
    }

    /**
     * Consultar el valor que debe pagar el cliente
     * @return regresa el valor a pagar
     */  
    public Double getTotal() {
        return Total;
    }
    
    /**
     * Consulta el dinero que el cliente entrega
     * @return  el dinero que el cliente entrega
     */
    public Double getRecibido() {
        return Recibido;
    }
    
    /**
     * 
     * @return 
     */
    public Calendar darFecha()
    {
        return Fecha;
    }
    
    /**
     * 
     */
    public ArrayList<String> darContenido()
    {
        return Contenido;
    }
    
}
