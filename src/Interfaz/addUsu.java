/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author jgarn
 */
public class addUsu implements VistaB{
   private Scene escena;
  private  TextField ID, nombre, edad, sexo, cargo, direccion,telefono,horario;
  private Button guardar, borrar, volver;

    public addUsu() {
        ID=new TextField ();
        ID.setPromptText("Documento de identidad");
        nombre=new TextField();
        nombre.setPromptText("Nombre");
        edad=new TextField();
        edad.setPromptText("Edad");
        sexo=new TextField();
        sexo.setPromptText("Sexo");
        cargo=new TextField();
        cargo.setPromptText("Cargo");
        direccion=new TextField();
        direccion.setPromptText("Dirección");
        telefono=new TextField();
        telefono.setPromptText("Teléfono");
        horario=new TextField();
        horario.setPromptText("Horario");
        guardar=new Button("Guardar");
        borrar=new Button("Borrar");
        volver=new Button("Volver");
        
        HBox centro = new HBox ();
        centro.getChildren().add(edad);
        centro.getChildren().add(sexo);
        centro.setSpacing(20);
        VBox formulario=new VBox();
        formulario.getChildren().add(ID);
        formulario.getChildren().add(nombre);
        formulario.getChildren().add(centro);
        formulario.getChildren().add(cargo);
        formulario.getChildren().add(direccion);
        formulario.getChildren().add(telefono);
        formulario.getChildren().add(horario);
        formulario.setSpacing(30);
        VBox botones=new VBox();
        botones.getChildren().add(volver);
        botones.getChildren().add(guardar);
        botones.getChildren().add(borrar);
        botones.setSpacing(30);
       HBox g=new HBox();
       g.getChildren().add(formulario);
       g.getChildren().add(botones);
       g.setSpacing(20);
        escena=new Scene(g, 400,400);
    }

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }

    public TextField getID() {
        return ID;
    }

    public void setID(TextField ID) {
        this.ID = ID;
    }

    public TextField getNombre() {
        return nombre;
    }

    public void setNombre(TextField nombre) {
        this.nombre = nombre;
    }

    public TextField getEdad() {
        return edad;
    }

    public void setEdad(TextField edad) {
        this.edad = edad;
    }

    public TextField getSexo() {
        return sexo;
    }

    public void setSexo(TextField sexo) {
        this.sexo = sexo;
    }

    public TextField getCargo() {
        return cargo;
    }

    public void setCargo(TextField cargo) {
        this.cargo = cargo;
    }

    public TextField getDireccion() {
        return direccion;
    }

    public void setDireccion(TextField direccion) {
        this.direccion = direccion;
    }

    public TextField getTelefono() {
        return telefono;
    }

    public void setTelefono(TextField telefono) {
        this.telefono = telefono;
    }

    public TextField getHorario() {
        return horario;
    }

    public void setHorario(TextField horario) {
        this.horario = horario;
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

  
  
  
    @Override
    public Scene getScene() {
      return this.escena;
    }
}
