/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
/**
 *
 * @author jgarn
 */
public class Venta implements VistaB {
   private TableView table;
   private ListView<String> lista;
   private ObservableList<String> items;
   private Button addProducto, volver;
   private Scene escena;
    public Venta() throws FileNotFoundException {
        lista=new ListView<String>();
        items=FXCollections.observableArrayList("Nombre", "ID", "Cantidad", "Precio individual", "Precio total");
        lista.setItems(items);
        FileInputStream input=new FileInputStream("anadir-al-carrito.png");
    Image a=new Image (input);
    volver=new Button("Volver");
    addProducto=new Button("Añadir al carrito", new ImageView(a));
    VBox v= new VBox();
    v.getChildren().add(volver);
    volver.setAlignment(Pos.TOP_LEFT);
    v.getChildren().add(lista);
    v.getChildren().add(addProducto);
    escena=new Scene(v, 500, 400);
    
    }

    @Override
    public Scene getScene() {
        return this.escena;
    }

    public TableView getTable() {
        return table;
    }

    public void setTable(TableView table) {
        this.table = table;
    }

    public ListView<String> getLista() {
        return lista;
    }

    public void setLista(ListView<String> lista) {
        this.lista = lista;
    }

    public ObservableList<String> getItems() {
        return items;
    }

    public void setItems(ObservableList<String> items) {
        this.items = items;
    }

    public Button getAddProducto() {
        return addProducto;
    }

    public void setAddProducto(Button addProducto) {
        this.addProducto = addProducto;
    }

    public Button getVolver() {
        return volver;
    }

    public void setVolver(Button volver) {
        this.volver = volver;
    }

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }
    
    
    
}