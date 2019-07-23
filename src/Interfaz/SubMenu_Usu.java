/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author jgarn
 */
public class SubMenu_Usu implements VistaB {
    private Scene escena;
    private Button agregar, quitar, volver;

    public SubMenu_Usu() throws FileNotFoundException {
    FileInputStream input=new FileInputStream("agregar-usuario.png");
    FileInputStream input2=new FileInputStream("bloquear-usuario.png");
    Image a=new Image (input);
    Image q=new Image(input2);
    agregar=new Button("Agregar Usuario",new ImageView (a));
    quitar=new Button("Quitar Usuario", new ImageView(q));
    volver=new Button("Volver");
    VBox usu=new VBox();
    usu.getChildren().add(volver);
    usu.getChildren().add(agregar);
    usu.getChildren().add(quitar);
    usu.setSpacing(40);
    escena=new Scene(usu, 150, 155);
    }

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }

    public Button getAgregar() {
        return agregar;
    }

    public void setAgregar(Button agregar) {
        this.agregar = agregar;
    }

    public Button getQuitar() {
        return quitar;
    }

    public void setQuitar(Button quitar) {
        this.quitar = quitar;
    }

    public Button getVolver() {
        return volver;
    }

    public void setVolver(Button volver) {
        this.volver = volver;
    }

    
    
    @Override
    public Scene getScene() {
        return escena;
    }
    
}
