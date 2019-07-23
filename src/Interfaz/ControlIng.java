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
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import proyectofinal.Admin;
import proyectofinal.Singleton;
import Prueba.Prueba;
import java.util.ArrayList;
import proyectofinal.Empleado;
/**
 *
 * @author jgarn
 */
public class ControlIng {
    private Ingresar ventana;
    private Admin admin=new Admin();
    boolean x=true;
    ArrayList<Empleado>Usuarios=Prueba.getUsuarios();
    
    public ControlIng() throws FileNotFoundException {
        this.ventana = new Ingresar();
        this.ventana.getIng().setOnAction(new EventoIng());
    }
    private class EventoIng implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            
        if(ventana.getU().getText().isEmpty()||ventana.getC().getText().isEmpty()){
                 Alert mensaje= new Alert(Alert.AlertType.ERROR);
               mensaje.setTitle("Error");
               mensaje.setHeaderText("No ha ingresado los datos");
               mensaje.showAndWait();
            }
            else if(!(ventana.getU().getText().equals(admin.getUsuario())&& ventana.getC().getText().equals(admin.getClave()))){
                
                 Alert mensaje= new Alert(Alert.AlertType.ERROR);
               mensaje.setTitle("Error");
               mensaje.setHeaderText("Los datos ingreasados son incorrectos");
               mensaje.showAndWait();
            }
            
            else if ((ventana.getU().getText().equals(admin.getUsuario())&& ventana.getC().getText().equals(admin.getClave()))){
         String usuario=ventana.getU().getText();
         String contraseña=ventana.getC().getText();       
         CompararUsu();
         Singleton singleton= Singleton.getSingleton();
         Stage stage=singleton.getStage();
         stage.setTitle("Menu");
         ControlMenu controlador = null;
            try {
                controlador = new ControlMenu();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControlIng.class.getName()).log(Level.SEVERE, null, ex);
            }
         VistaB vistamenu=controlador.getVentana();
         stage.setScene(vistamenu.getScene());
         stage.show();
        
            }
            else {
               CompararUsu();
               if(x==true){
                   String usuario=ventana.getU().getText();
         String contraseña=ventana.getC().getText();       
         CompararUsu();
         Singleton singleton= Singleton.getSingleton();
         Stage stage=singleton.getStage();
         stage.setTitle("Menu");
         ControlMenu controlador = null;
            try {
                controlador = new ControlMenu();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControlIng.class.getName()).log(Level.SEVERE, null, ex);
            }
         VistaB vistamenu=controlador.getVentana();
         stage.setScene(vistamenu.getScene());
         stage.show();
               }
               else{
                   Alert mensaje= new Alert(Alert.AlertType.ERROR);
               mensaje.setTitle("Error");
               mensaje.setHeaderText("Los datos ingreasados son incorrectos");
               mensaje.showAndWait();
               }
            }
        
        }
    }
    
    public Ingresar getVentana() {
        return ventana;
    }
    
    public boolean CompararUsu(){
        for(int i=0;i<Usuarios.size();i++){
        
            
             if(ventana.getU().getText().equals(Usuarios.get(i).getUsuario())&& ventana.getC().getText().equals(Usuarios.get(i).getPassword())){
                x=true;
            }
            else{
                x=false;
            }
            
        }
       return x; 
    }//completar
    
   
    
}
