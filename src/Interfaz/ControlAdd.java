/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import proyectofinal.Singleton;

/**
 *
 * @author jgarn
 */
public class ControlAdd {
    private addUsu ventana;

    public ControlAdd() {
    this.ventana=new addUsu();
    ventana.getGuardar().setOnAction(new EventGuardar());
    ventana.getBorrar().setOnAction(new EventBorrar());
    ventana.getVolver().setOnAction(new EventVolver());
    }
    File file = new File ("Usuarios.txt");
    
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
    
        private class EventBorrar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            
        }
        
        
        } //completar esta vacio
        
        private class EventGuardar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            
            if(ventana.getNombre().getText().isEmpty()||ventana.getID().getText().isEmpty()||ventana.getEdad().getText().isEmpty()||ventana.getHorario().getText().isEmpty()
                    ||ventana.getSexo().getText().isEmpty()||ventana.getTelefono().getText().isEmpty()||ventana.getDireccion().getText().isEmpty()||ventana.getCargo().getText().isEmpty()){
                Alert mensaje= new Alert(Alert.AlertType.ERROR);
               mensaje.setTitle("Error");
               mensaje.setHeaderText("No ha completado los datos");
               mensaje.showAndWait();
            }
            else{
             try
            {
            //FileWriter fw = new FileWriter(new File( "Inventario.txt" ));
            //BufferedWriter escritor = new BufferedWriter( fw );
            //fw.write(String.format("holis"));
            //ventana.getNombre().getText()," ",ventana.getNombreProv().getText()," ",Integer.parseInt(ventana.getCodigo().getText())," ",Double.parseDouble(ventana.getCosto().getText())," ",Double.parseDouble(ventana.getPrecio().getText())," ",Integer.parseInt(ventana.getCantidad().getText()))
            //fw.write(System.lineSeparator()); //new line
                
                if (!file.exists()){
                file.createNewFile();

                }
               FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
               BufferedWriter bw = new BufferedWriter(fw);
               bw.write(ventana.getNombre().getText()+" "+ventana.getID().getText()+" "+ventana.getEdad().getText()+" "+ventana.getHorario().getText()+" "+ventana.getSexo().getText()
               +" "+ventana.getTelefono().getText()+" "+ventana.getDireccion().getText()+" "+ventana.getCargo().getText());
               System.out.println("Información agregada");
               bw.write(System.lineSeparator()); 
               bw.close();
               fw.close();
            
                /*PrintWriter writer = new PrintWriter("Inventario.txt");
            
            writer.println(ventana.getNombre().getText()+" "+ventana.getNombreProv().getText()+" "+ventana.getCodigo().getText()+" "+ventana.getCodigo().getText()+" "+ventana.getPrecio().getText()+" "+ventana.getCantidad().getText());
           */// writer.close();
            }
            catch( Exception e )
        {
            
        }
        }
        }
        
        
        } //completar

    public addUsu getVentana() {
        return ventana;
    }

    public void setVentana(addUsu ventana) {
        this.ventana = ventana;
    }


}
