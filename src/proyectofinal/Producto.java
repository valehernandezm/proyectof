/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 * Representa un producto de la tienda, hereda de la clase Identidad
 * @author sljim
 */
public class Producto 
{
    
   //-------------------------------------------- 
   // Atributos
   //--------------------------------------------

    /**
     * Contiene el precio al cual lo compran los clientes
     */
    
    private Double Precio;
    private String Nombre;
    private int ID;
    private double costo;
    /**
     * Cantidad de producto
     */ 
    private int Cantidad; 
    
    /**
     * Unidades Vendidas del producto
     */
   private int UnidadesVendidas;
   
   //-------------------------------------------- 
   // Constructor 
   //--------------------------------------------
   
   /**
    * Constructor de la clase producto
    * @param pNombre nombre del producto, nombre debe ser distinto de null
    * @param pID codigo unico del producto
    * @param pCosto dinero necesario para adquirir el producto de un proveedor
    * @param pPrecio dinero que debe entregar un cliente a la tienda para adquirir el producto
    * @param pCantidad cantidad del producto en inventario de la tienda
    */
   public Producto( Double Precio, String Nombre, int ID, double costo, int Cantidad)
   {
        this.Precio = Precio;
        this.Nombre = Nombre;
        this.ID = ID;
        this.costo = costo;
        this.Cantidad = Cantidad;
        this.UnidadesVendidas = UnidadesVendidas;
   }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int pID) {
        this.ID = pID;
    }

    public double getCosto() {
        return costo;
    }

    //--------------------------------------------
    // Metodos
    public void setCosto(double costo) {
        this.costo = costo;
    }

    //--------------------------------------------
    /**
     * Modifica el precio del producto
     */
    public void cambiarPrecio(Double pPrecio) {
        Precio = pPrecio;
    }
   
   /**
    * Precio del producto
    * @return precio del producto
    */
    public Double getPrecio() {
        return Precio;
    }

    /**
     * Cantidad del producto en inventario
     * @return cantidad inventariada del producto
     */
    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    /**
     * Cantidad de unidades vendidas 
     * @return cantidad de unidades vendidas
     */
    public int getUnidadesVendidas() {
        return UnidadesVendidas;
    }

    /**
     * Modifica las unidades vendidas
     * @param UnidadesVendidas cantidad de unidades vendidas
     */
    public void setUnidadesVendidas(int UnidadesVendidas) {
        this.UnidadesVendidas = UnidadesVendidas;
    }
   
   
   
}
