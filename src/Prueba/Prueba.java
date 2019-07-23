/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import proyectofinal.Empleado;

/**
 *
 * @author valeh
 */
public class Prueba {
    static ArrayList<Empleado>Usuarios = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        
        
           
           
    File lectura=new File("Usuarios.txt");
        Scanner flujo=null;
        String linea=null;
        flujo=new Scanner(lectura);
        
        while (flujo.hasNextLine())
      
        {
            
            linea=flujo.nextLine();
            String[] parts = linea.split(" ");
            String usuarioe=parts[1];
            String passworde=parts[0]+parts[2]; 
            
            Usuarios.add(new Empleado(parts[0],Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),parts[4],Integer.parseInt(parts[5]),parts[7], parts[6], Integer.parseInt(parts[3]),
                    usuarioe, passworde));
         }
      
        setUsuarios(Usuarios);
    }

    public static ArrayList<Empleado> getUsuarios() {
        return Usuarios;
    }

    public static void setUsuarios(ArrayList<Empleado> Usuarios) {
        Prueba.Usuarios = Usuarios;
    }
    
   
    
}

