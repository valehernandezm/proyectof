/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import proyectofinal.Singleton;

/**
 *
 * @author jgarn
 */
public class ControlPro {
    private Producto ventana;

    public ControlPro() throws FileNotFoundException {
    this.ventana=new Producto();
    this.ventana.getAgregar().setOnAction(new EventAgre());
    this.ventana.getBuscar().setOnAction(new EventBuscar());
    this.ventana.getQuitar().setOnAction(new EventQuitar());
    this.ventana.getVolver().setOnAction(new EventVolver());
    }
    
     private class EventVolver implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
         
         Singleton singleton= Singleton.getSingleton();
         Stage stage=singleton.getStage();
            try {
                Producto ventana= new Producto();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControlPro.class.getName()).log(Level.SEVERE, null, ex);
            }
        Stage stage2=(Stage) ventana.getVolver().getScene().getWindow();
         stage.setTitle("Menu");
         
         ControlMenu controlador = null;
            try {
                controlador = new ControlMenu();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControlIng.class.getName()).log(Level.SEVERE, null, ex);
            }
         VistaB vistamenu=controlador.getVentana();
         stage.setScene(vistamenu.getScene());
         stage2.close();
         stage.show();
         
        }
     
     } 
     
     private class EventBuscar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            //Hacer ventana de ventas
        }
     
     }//completar esta vacio el evento
     
     private class EventQuitar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
           //hacer nueva ventana
        }
     
     }//completar
     
     private class EventAgre implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
        //hacer ventana
        
        
        
        
        
          Stage stage=new Stage();
          stage.setTitle("Agregar");
          ControlAgregarProducto cont = null;
            try {
                cont=new ControlAgregarProducto();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControlPro.class.getName()).log(Level.SEVERE, null, ex);
            }
         VistaB u=cont.getVentana();
          stage.setScene(u.getScene());
          stage.show();
        
        
        
        
        
        
        
        /*Stage stage=new Stage();
          stage.setTitle("Usuarios");
          agregarProducto add = null;
        try
        {
            add=new agregarProducto();
        }catch(Exception e){
            
        }
        VistaB o=add.getScene();
        
        @Override
        public void handle(ActionEvent event) {
          Stage stage=new Stage();
          stage.setTitle("Usuarios");
          ControlSubUsu controlador = null;
            try {
                controlador=new ControlSubUsu();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControlMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
          VistaB vistausu=controlador.getVentana();
          stage.setScene(vistausu.getScene());
          stage.show();
        }
        */
        
        
        }
     
     }

    public Producto getVentana() {
        return ventana;
    }

    public void setVentana(Producto ventana) {
        this.ventana = ventana;
    }
     
    
}
