/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author jgarn
 */
public class EliminarUsu implements VistaB {
    
  private Scene escena;
  private TextField ID;
  private  Label nombre, edad, sexo, cargo, direccion,telefono,horario;
  private Button buscar, eliminar, volver;
    public EliminarUsu(){   
    ID=new TextField ("Documento de identidad");
        nombre=new Label("Nombre");
        edad=new Label("Edad");
        sexo=new Label("Sexo");
        cargo=new Label("Cargo");
        direccion=new Label("Dirección");
        telefono=new Label("Teléfono");
        horario=new Label("Horario");
        buscar=new Button("Buscar");
        eliminar=new Button("Eliminar");
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
        botones.getChildren().add(buscar);
        botones.getChildren().add(eliminar);
        botones.setSpacing(30);
       HBox g=new HBox();
       g.getChildren().add(formulario);
       g.getChildren().add(botones);
       g.setSpacing(20);
        escena=new Scene(g, 400,300);
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

    public Label getNombre() {
        return nombre;
    }

    public void setNombre(Label nombre) {
        this.nombre = nombre;
    }

    public Label getEdad() {
        return edad;
    }

    public void setEdad(Label edad) {
        this.edad = edad;
    }

    public Label getSexo() {
        return sexo;
    }

    public void setSexo(Label sexo) {
        this.sexo = sexo;
    }

    public Label getCargo() {
        return cargo;
    }

    public void setCargo(Label cargo) {
        this.cargo = cargo;
    }

    public Label getDireccion() {
        return direccion;
    }

    public void setDireccion(Label direccion) {
        this.direccion = direccion;
    }

    public Label getTelefono() {
        return telefono;
    }

    public void setTelefono(Label telefono) {
        this.telefono = telefono;
    }

    public Label getHorario() {
        return horario;
    }

    public void setHorario(Label horario) {
        this.horario = horario;
    }

    public Button getBuscar() {
        return buscar;
    }

    public void setBuscar(Button buscar) {
        this.buscar = buscar;
    }

    public Button getEliminar() {
        return eliminar;
    }

    public void setEliminar(Button eliminar) {
        this.eliminar = eliminar;
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
