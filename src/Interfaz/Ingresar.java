/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author jgarn
 */
public class Ingresar implements VistaB {
    private Scene escena;
    private Label usu;
    private Label contra;
    private Image foto;
    FileInputStream input;
    private Button ing;
    private Button quit;
    private TextField u;
    private PasswordField c;
    private Label fotoaux;
    
    public Ingresar() throws FileNotFoundException {
    this.addFoto();        
    usu=new Label("Usuario");
    contra=new Label("Contraseña");
    u=new TextField();
    c=new PasswordField();
    ing=new Button("Ingresar");
    quit=new Button("Salir");
    
    BorderPane panel = new BorderPane();
    GridPane gridBoton = new GridPane();
    gridBoton.setMinSize(400, 0);
    gridBoton.setPadding(new Insets(10, 10, 10, 10));
    gridBoton.setVgap(5); 
    gridBoton.setHgap(200);
    gridBoton.setAlignment(Pos.BASELINE_CENTER);
    gridBoton.add(quit, 0, 0); 
    gridBoton.add(ing, 1, 0);
    panel.setBottom(gridBoton);
    GridPane centro =new GridPane();
    centro.setMinSize(300, 300);
    centro.setPadding(new Insets(10, 10, 10, 10));
    centro.setVgap(10); 
    centro.setHgap(5);
    centro.setAlignment(Pos.CENTER);
    centro.add(fotoaux,2, 0);
    centro.add(usu, 0, 3 ); 
    centro.add(u, 2, 3); 
    centro.add(contra, 0, 5);       
    centro.add(c, 2, 5); 
    panel.setCenter(centro);
    this.escena=new Scene(panel,400,400);
    
    
    }
    
    
    
    
    
    
    public boolean addFoto() throws FileNotFoundException{
    input=new FileInputStream("usuario.png");
    foto= new Image(input);
    this.fotoaux=new Label("", new ImageView(foto));
    return true;
    }

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }

    public Label getUsu() {
        return usu;
    }

    public void setUsu(Label usu) {
        this.usu = usu;
    }

    public Label getContra() {
        return contra;
    }

    public void setContra(Label contra) {
        this.contra = contra;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public FileInputStream getFotoP() {
        return input;
    }

    public void setFotoP(FileInputStream fotoP) {
        this.input = fotoP;
    }

    public Button getIng() {
        return ing;
    }

    public void setIng(Button ing) {
        this.ing = ing;
    }

    public Button getQuit() {
        return quit;
    }

    public void setQuit(Button quit) {
        this.quit = quit;
    }

    public TextField getU() {
        return u;
    }

    public void setU(TextField u) {
        this.u = u;
    }

    public TextField getC() {
        return c;
    }

    public void setC(PasswordField c) {
        this.c = c;
    }

    public Label getFotoaux() {
        return fotoaux;
    }

    
    public void setFotoaux(Label fotoaux) {
        this.fotoaux = fotoaux;
    }
   

@Override
    public Scene getScene() {
       return escena;
    }
    
}
