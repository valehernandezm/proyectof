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
 *
 * @author jgarn
 */
public class addVenta implements VistaB{
    private TextField idPro, cantidad;
    private Button volver, guardar;
    private Scene escena;
    public addVenta() {
       idPro=new TextField();
       idPro.setPromptText("ID del producto");
       cantidad=new TextField();
       cantidad.setPromptText("Cantidad de producto");
       volver= new Button("Volver");
       guardar=new Button("Guardar");
       VBox v1= new VBox();
       VBox v2= new VBox();
       HBox hg= new HBox();
       v1.setSpacing(20);
       v2.setSpacing(20);
       hg.setSpacing(20);
       v1.getChildren().add(idPro);
       v1.getChildren().add(cantidad);
       v2.getChildren().add(guardar);
       v2.getChildren().add(volver);
       hg.getChildren().add(v1);
       hg.getChildren().add(v2);
       escena=new Scene(hg, 400, 400);
    }

    @Override
    public Scene getScene() {
       return escena;
    }

    public TextField getIdPro() {
        return idPro;
    }

    public void setIdPro(TextField idPro) {
        this.idPro = idPro;
    }

    public TextField getCantidad() {
        return cantidad;
    }

    public void setCantidad(TextField cantidad) {
        this.cantidad = cantidad;
    }

    public Button getVolver() {
        return volver;
    }

    public void setVolver(Button volver) {
        this.volver = volver;
    }

    public Button getGuardar() {
        return guardar;
    }

    public void setGuardar(Button guardar) {
        this.guardar = guardar;
    }

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }
    
}
