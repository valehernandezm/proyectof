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
public class ControlVenta {
    private Venta ventana;

    public ControlVenta() throws FileNotFoundException {
        this.ventana= new Venta();
        this.ventana.getAddProducto().setOnAction(new EventAdd());
        this.ventana.getVolver().setOnAction(new EventVolver());
    }
    
         private class EventVolver implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
         
         Singleton singleton= Singleton.getSingleton();
         Stage stage=singleton.getStage();
            try {
                Venta ventana= new Venta();
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
        private class EventAdd implements EventHandler<ActionEvent>{

            @Override
            public void handle(ActionEvent event) {
              
               
            }
        
         }

    public Venta getVentana() {
        return ventana;
    }

    public void setVentana(Venta ventana) {
        this.ventana = ventana;
    }


}
     
    

