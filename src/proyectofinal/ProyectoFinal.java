/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import Interfaz.ControlAdd;
import Interfaz.ControlIng;
import Interfaz.Ingresar;
import Interfaz.Menu;
import Interfaz.VistaB;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import Prueba.Prueba;
/**
 *
 * @author jgarn
 */
public class ProyectoFinal extends Application {

    public static void main(String []args) throws FileNotFoundException{
        Application.launch(args);
    
            
   proyectofinal.Tienda store = new proyectofinal.Tienda("Pepita");
    /**
     * De aqui en adelante es una muestra de como almacena la idea es hacer un acrivo en agregar productos que contenga todo, y en el main se hace una función lectora que lee ese archivo y lo agrega a el programa de tienda 
     */
        System.out.println(" "+Prueba.getUsuarios().size());
    for(int k=0;k<Prueba.getUsuarios().size();k++){
        System.out.println(" "+Prueba.getUsuarios().get(k).getNombre());
    }
    }

    @Override
    public void start(Stage stage) throws Exception {
        Singleton singleton=Singleton.getSingleton();
        singleton.setStage(stage);
        ControlIng controlador=new ControlIng();
        VistaB vista =controlador.getVentana();
        stage.setScene(vista.getScene());
        stage.show();
    }
    
    
}
