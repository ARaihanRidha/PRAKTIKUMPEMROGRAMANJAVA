package com.example.javaapps;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Tabel extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        TableView tabel = new TableView<>();
        tabel.setPlaceholder(new Label("Belum ada data !"));
        TableColumn<Mahasiswa, String> kolom1 = new TableColumn<>("NIM");
        kolom1.setCellValueFactory(
                new PropertyValueFactory<>("nim")
        );
        tabel.getColumns().add(kolom1);
        tabel.getItems().add(new Mahasiswa(123,"Agus","12345"));
        tabel.getItems().add(new Mahasiswa(231,"Baagas","12354"));
        tabel.getItems().add(new Mahasiswa(123,"Loki","12345"));
        tabel.getItems().add(new Mahasiswa(213,"Akmal","22108"));
        tabel.getItems().add(new Mahasiswa(431,"Kemal","22091"));
        tabel.getItems().add(new Mahasiswa(126,"Rehan","22108"));
        tabel.getItems().add(new Mahasiswa(178,"Ryan","73013"));
        tabel.getItems().add(new Mahasiswa(191,"Irfan","22107"));
        tabel.getItems().add(new Mahasiswa(210,"Muhammad","17303"));
        tabel.getItems().add(new Mahasiswa(125,"Trisna","17910"));
        TableColumn<Mahasiswa, String> kolom2 = new TableColumn<>("NAMA");
        kolom2.setCellValueFactory(
                new PropertyValueFactory<>("nama")
        );
        tabel.getColumns().add(kolom2);
        VBox vbox= new VBox(tabel);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
