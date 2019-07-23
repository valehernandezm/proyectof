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

/**
 *
 * @author jgarn
 */
public class ControlEliminar {
        private EliminarUsu ventana;

    public ControlEliminar() {
    this.ventana=new EliminarUsu();
    ventana.getBuscar().setOnAction(new EventBuscar());
    ventana.getEliminar().setOnAction(new EventEliminar());
    ventana.getVolver().setOnAction(new EventVolver());
    }
    
        private class EventVolver implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
         
         
         Stage stage=new Stage();
        Stage stage2=(Stage) ventana.getVolver().getScene().getWindow();
         stage.setTitle("Usuarios");
         ControlSubUsu controlador = null;
            try {
                controlador = new ControlSubUsu();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControlSubUsu.class.getName()).log(Level.SEVERE, null, ex);
            }
         VistaB vistau=controlador.getVentana();
         stage.setScene(vistau.getScene());
         stage2.close();
         stage.show();
        }

}
    
        private class EventEliminar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            
        }
        
        
        } //completar esta vacio
        
        private class EventBuscar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            
        }
        
        
        } //completar

    public EliminarUsu getVentana() {
        return ventana;
    }

    public void setVentana(EliminarUsu ventana) {
        this.ventana = ventana;
    }
}
