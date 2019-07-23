
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author jgarn
 */
public class Menu implements VistaB {
  private Scene escena;
  private Button productos, adminUsu, venta, estad, salir;
  private Label bien, imagen;
  FileInputStream input; 
    public Menu() throws FileNotFoundException {
        productos=new Button("Productos");
        adminUsu= new Button("Usuarios");
        venta=new Button ("Venta");
        estad=new Button("Estadistica");
        salir=new Button("Salir");
        bien=new Label("Bienvenido usuario");
        input=new FileInputStream("usuario.png");
        Image foto= new Image(input);
        imagen = new Label("", new ImageView(foto));
        VBox v1=new VBox();
        v1.setSpacing(30);
        v1.getChildren().add(productos);
        v1.getChildren().add(adminUsu);
        v1.getChildren().add(venta);
        v1.getChildren().add(estad);
        VBox v2=new VBox();
        v2.setSpacing(10);
        v2.setAlignment(Pos.CENTER);
        v2.getChildren().add(imagen);
        v2.getChildren().add(bien);
        BorderPane panel=new BorderPane();
        panel.setLeft(v1);
        panel.setCenter(v2);
        panel.setBottom(salir);
        escena=new Scene(panel,300,250);
        
    }

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }

    public Button getProductos() {
        return productos;
    }

    public void setProductos(Button productos) {
        this.productos = productos;
    }

    public Button getAdminUsu() {
        return adminUsu;
    }

    public void setAdminUsu(Button adminUsu) {
        this.adminUsu = adminUsu;
    }

    public Button getVenta() {
        return venta;
    }

    public void setVenta(Button venta) {
        this.venta = venta;
    }

    public Button getEstad() {
        return estad;
    }

    public void setEstad(Button estad) {
        this.estad = estad;
    }

    public Label getBien() {
        return bien;
    }

    public void setBien(Label bien) {
        this.bien = bien;
    }

    public Label getImagen() {
        return imagen;
    }

    public void setImagen(Label imagen) {
        this.imagen = imagen;
    }

    @Override
    public Scene getScene() {
       return escena;
    }

    public Button getSalir() {
        return salir;
    }

    public void setSalir(Button salir) {
        this.salir = salir;
    }
  
  
}