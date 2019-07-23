/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;


/**
 *
 * @author sljim
 */
public class Identidad 
{
    
   //-------------------------------------------- 
   // Atributos
   //--------------------------------------------
    
    /**
     * Nombre de el objeto
     */
    private String Nombre;
    
    /**
     * Codigo unico de la persona u objeto
     */
    private int ID;
    
    /**
     * Dinero que se debe
     */
    private Double Costo;
    
    /**
     * Fecha de ingreso
     */
    //private FechaEntrada;
    
    /**
     *Fecha en la que dejó la tineda o debe ser retirado
     */
    //private FechaSalida;
    
   //-------------------------------------------- 
   // Constructor
   //--------------------------------------------
    
   /**
    * Constructor de la super clase 
    * @param pNombre nombre de el objeto
    * @param pID identificacion del objeto
    * @param pCosto costo del objeto
    */
   public Identidad(String pNombre, int pID, Double pCosto) {
        Nombre = pNombre;
        ID = pID;
        Costo = pCosto;
    }
    
   //-------------------------------------------- 
   // Metodos
   //--------------------------------------------

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String pNombre) {
        Nombre = pNombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int pID) {
        ID = pID;
    }

    public Double getCosto() {
        return Costo;
    }

    public void setCosto(Double pCosto) {
        Costo = pCosto;
    }
   
}
