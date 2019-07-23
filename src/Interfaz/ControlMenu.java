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
public class ControlMenu {
    private Menu ventana;

    public ControlMenu() throws FileNotFoundException {
   this.ventana=new Menu();
   this.ventana.getSalir().setOnAction(new EventSalir());
   this.ventana.getAdminUsu().setOnAction(new EventUsu());
   this.ventana.getEstad().setOnAction(new EventEstad());
   this.ventana.getProductos().setOnAction(new EventProduct());
   this.ventana.getVenta().setOnAction(new EventVenta());
    }
    
     private class EventSalir implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
         Singleton singleton= Singleton.getSingleton();
         Stage stage=singleton.getStage();
         stage.setTitle("Ingresar");
         ControlIng controlador = null;
            try {
                controlador = new ControlIng();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControlMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
         VistaB vistaingresar=controlador.getVentana();
         stage.setScene(vistaingresar.getScene());
         stage.show();
        }    
     }
     
     private class EventUsu implements EventHandler<ActionEvent>{

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
     
     } //completar
     
     private class EventEstad implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            //Hacer ventana de ventas
        }
     
     }//completar
     
     private class EventProduct implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
          Stage stage=new Stage();
          stage.setTitle("Productos");
          ControlPro controlador = null;
            try {
                controlador=new ControlPro();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControlMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
          VistaB vistaPro=controlador.getVentana();
          stage.setScene(vistaPro.getScene());
          stage.show();
        }
     
     }
     
     private class EventVenta implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
                  Stage stage=new Stage();
          stage.setTitle("Venta");
          ControlVenta controlador = null;
            try {
                controlador=new ControlVenta();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControlMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
          VistaB vistaVent=controlador.getVentana();
          stage.setScene(vistaVent.getScene());
          stage.show();
            
            
        }
     
     }
     
     public Menu getVentana() {
        return ventana;
    }
}
