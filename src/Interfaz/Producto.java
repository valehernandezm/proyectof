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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author jgarn
 */
public class Producto implements VistaB {
    private agregarProducto ventanita;
    
    
    private Scene escena;
    private Button agregar, quitar, buscar, volver;
    private TextField b;
    private TableView table;
    private TableColumn nombre,nombreP,codigo,costo,precio,dispo;
    public Producto() throws FileNotFoundException {
    FileInputStream input=new FileInputStream("mas.png");
    FileInputStream input2=new FileInputStream("menos.png");
   FileInputStream input3=new FileInputStream("lupa-de-busqueda.png");
    Image a=new Image (input);
    Image q=new Image(input2);
    Image s=new Image(input3);
    agregar=new Button("Agregar",new ImageView (a));
    quitar=new Button("Quitar", new ImageView(q));
    buscar=new Button("", new ImageView(s));
    volver=new Button("Volver");
    b=new TextField("Buscar");
    table=new TableView();
    nombre=new TableColumn("Producto");
    nombreP=new TableColumn("Proveedor");
    codigo=new TableColumn("Código");
    costo=new TableColumn("Costo");
    precio=new TableColumn("Precio");
    dispo=new TableColumn("Cantidad");
    table.getColumns().addAll(nombre,nombreP,codigo,costo,precio,dispo);
    HBox superior=new HBox();
    superior.getChildren().add(b);
    superior.getChildren().add(buscar);
    superior.setSpacing(20);
    HBox inferior =new HBox();
    inferior.getChildren().add(volver);
    inferior.getChildren().add(agregar);
    inferior.getChildren().add(quitar);
    inferior.setSpacing(200);
    BorderPane panel=new BorderPane();
    panel.setBottom(inferior);
    panel.setCenter(table);
    panel.setTop(superior);
    escena=new Scene(panel, 900,600);
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

    public Button getBuscar() {
        return buscar;
    }

    public void setBuscar(Button buscar) {
        this.buscar = buscar;
    }

    public TextField getB() {
        return b;
    }

    public void setB(TextField b) {
        this.b = b;
    }

    public TableView getTable() {
        return table;
    }

    public void setTable(TableView table) {
        this.table = table;
    }

    public TableColumn getNombre() {
        return nombre;
    }

    public void setNombre(TableColumn nombre) {
        this.nombre = nombre;
    }

    public TableColumn getCodigo() {
        return codigo;
    }

    public void setCodigo(TableColumn codigo) {
        this.codigo = codigo;
    }

    public TableColumn getDispo() {
        return dispo;
    }

    public void setDispo(TableColumn dispo) {
        this.dispo = dispo;
    }

    public Button getVolver() {
        return volver;
    }

    public void setVolver(Button volver) {
        this.volver = volver;
    }
    
    
   
    
    
    @Override
    public Scene getScene() {
        return this.escena;
    }
}
