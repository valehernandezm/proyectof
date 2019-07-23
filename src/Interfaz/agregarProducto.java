/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * esta clase se encarga de la pantalla para agregar un producto
 * @author sljim
 */
public class agregarProducto implements VistaB{
    
    
   private Scene escena;
  private  TextField nombre, nombreProv, codigo, costo, precio, cantidad;
  private Button guardar, borrar, volver;
/**
 * Constructor
 */
    public agregarProducto() {
        
        /**
         * Nombre de los botones y los campos a llenar con la información del producto
         */
        
        nombre=new TextField ();
        nombre.setPromptText("Nombre del producto");
        nombreProv=new TextField();
        nombreProv.setPromptText("Nombre del proveedor");
        codigo=new TextField();
        codigo.setPromptText("Codigo de ID");
        costo=new TextField();
        costo.setPromptText("Costo");
        precio=new TextField();
        precio.setPromptText("Precio");
        cantidad=new TextField();
        cantidad.setPromptText("Cantidad");
        
        guardar=new Button("Guardar");
        borrar=new Button("Borrar");
        volver=new Button("Volver");
        
        
        
        VBox formulario=new VBox();
        formulario.getChildren().add(nombre);
        formulario.getChildren().add(nombreProv);
        formulario.getChildren().add(codigo);
        formulario.getChildren().add(costo);
        formulario.getChildren().add(precio);
        formulario.getChildren().add(cantidad);
        
        formulario.setSpacing(30);
        VBox botones=new VBox();
        botones.getChildren().add(volver);
        botones.getChildren().add(guardar);
        botones.getChildren().add(borrar);
        botones.setSpacing(30);
       HBox g=new HBox();
       
       g.setSpacing(20);
       g.getChildren().add(formulario);
       g.getChildren().add(botones);
       g.setSpacing(20);
        escena=new Scene(g, 400,300);
    }
    
    /**
     * Metodos
     * @return 
     */

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }

    public TextField getNombre() {
        return nombre;
    }

    public void setNombre(TextField nombre) {
        this.nombre = nombre;
    }

    public TextField getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(TextField nombreProv) {
        this.nombreProv = nombreProv;
    }

    public TextField getCodigo() {
        return codigo;
    }

    public void setCodigo(TextField codigo) {
        this.codigo = codigo;
    }

    public TextField getCosto() {
        return costo;
    }

    public void setCosto(TextField costo) {
        this.costo = costo;
    }

    public TextField getPrecio() {
        return precio;
    }

    public void setPrecio(TextField precio) {
        this.precio = precio;
    }

    public TextField getCantidad() {
        return cantidad;
    }

    public void setCantidad(TextField cantidad) {
        this.cantidad = cantidad;
    }

    
    public Button getGuardar() {
        return guardar;
    }

    public void setGuardar(Button guardar) {
        this.guardar = guardar;
    }

    public Button getBorrar() {
        return borrar;
    }

    public void setBorrar(Button borrar) {
        this.borrar = borrar;
    }

    public Button getVolver() {
        return volver;
    }

    public void setVolver(Button volver) {
        this.volver = volver;
    }

  
  /**
   * Este se encarga de implementar el metodo de la interface 
   * @return 
   */
  
    @Override
    public Scene getScene() {
      return this.escena;
    }
    
}
