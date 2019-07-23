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
import java.io.PrintWriter;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *Es el controlador para poder agregar productos 
 * @author sljim
 */
public class ControlAgregarProducto {
    private agregarProducto ventana;

    public ControlAgregarProducto() throws FileNotFoundException {
        this.ventana=new agregarProducto();
        ventana.getGuardar().setOnAction(new eventoGuardar());
        ventana.getBorrar().setOnAction(new eventoBorrar());
        ventana.getVolver().setOnAction(new eventoVolver());
        
        
        //this.ventana.getAgregar().setOnAction(new Producto.EventAgre());
        /*this.ventana.getQuitar().setOnAction(new ControlSubUsu.EventQuitar());
        this.ventana.getVolver().setOnAction(new ControlSubUsu.EventVolver());*/
    }

    File file = new File ("Inventario.txt");
/**
 * Metodos
 */
    
    private class eventoBorrar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            
        }
        
        
        
        } //completar esta vacio
    
    
    
        private class eventoVolver implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            
        }
        
        
        } //completar esta vacio
    
    
        
        private class eventoGuardar implements EventHandler<ActionEvent>{
            
        @Override
        public void handle(ActionEvent event) {
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
               fw.write(System.lineSeparator()); 
               bw.write("Saraaaaaaa J");
               bw.write(ventana.getNombre().getText()+" "+ventana.getNombreProv().getText());
                System.out.println("Información agregada");
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
            
        
        
        
        } //completar
 
    public agregarProducto getVentana() {
        
        return ventana;
    }

    public void setVentana(agregarProducto ventana) {
        this.ventana = ventana;
        
    }
    
}
