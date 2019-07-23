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
public class ControlSubUsu {
    private SubMenu_Usu ventana;

    public ControlSubUsu() throws FileNotFoundException {
        this.ventana=new SubMenu_Usu();
        this.ventana.getAgregar().setOnAction(new EventAgregar());
        this.ventana.getQuitar().setOnAction(new EventQuitar());
        this.ventana.getVolver().setOnAction(new EventVolver());
    }
    
    private class EventVolver implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
         
         Singleton singleton= Singleton.getSingleton();
         Stage stage=singleton.getStage();
            try {
                SubMenu_Usu ventana= new SubMenu_Usu();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControlSubUsu.class.getName()).log(Level.SEVERE, null, ex);
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

    private class EventAgregar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
         
         Stage stage=new Stage();
            try {
                SubMenu_Usu ventana= new SubMenu_Usu();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControlSubUsu.class.getName()).log(Level.SEVERE, null, ex);
            }
        Stage stage2=(Stage) ventana.getVolver().getScene().getWindow();
         stage.setTitle("Usuarios");
         ControlAdd controlador = null;
         controlador = new ControlAdd();
         VistaB vistamenu=controlador.getVentana();
         stage.setScene(vistamenu.getScene());
         stage2.close();
         stage.show();   
        }
     
     }
    
    private class EventQuitar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
                     
         Stage stage=new Stage();
            try {
                SubMenu_Usu ventana= new SubMenu_Usu();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControlSubUsu.class.getName()).log(Level.SEVERE, null, ex);
            }
        Stage stage2=(Stage) ventana.getVolver().getScene().getWindow();
         stage.setTitle("Usuarios");
         ControlEliminar controlador = null;
         controlador = new ControlEliminar();
         VistaB vistamenu=controlador.getVentana();
         stage.setScene(vistamenu.getScene());
         stage2.close();
         stage.show();
        }
     
     }//completar esta vacio el evento
    
    public SubMenu_Usu getVentana() {
        return ventana;
    }

    public void setVentana(SubMenu_Usu ventana) {
        this.ventana = ventana;
    }

}

