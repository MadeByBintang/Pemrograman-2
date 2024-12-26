package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tabel extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        TableView<Mahasiswa> Tabel = new TableView<>();

        TableColumn<Mahasiswa, Integer> kolom1 = new TableColumn<>("ID");
        TableColumn<Mahasiswa, String> kolom2 = new TableColumn<>("NIM");
        TableColumn<Mahasiswa, String> kolom3 = new TableColumn<>("Nama");

        kolom1.setCellValueFactory(new PropertyValueFactory<>("id"));  
        kolom2.setCellValueFactory(new PropertyValueFactory<>("nim")); 
        kolom3.setCellValueFactory(new PropertyValueFactory<>("nama")); 

        Tabel.getColumns().add(kolom1);
        Tabel.getColumns().add(kolom2);
        Tabel.getColumns().add(kolom3);

        Tabel.getItems().add(new Mahasiswa(1, "2310817110006", "Adrian Bintang Saputera"));
        Tabel.getItems().add(new Mahasiswa(2, "2310817310011", "Muhammad Rizky"));
        Tabel.getItems().add(new Mahasiswa(3, "2310817120002", "Siti Ratna Dwinta Sari"));
        Tabel.getItems().add(new Mahasiswa(4, "2310817110015", "Akhmad Chaidar Ananda"));
        Tabel.getItems().add(new Mahasiswa(5, "2310817210020", "Muhammad Hasbiyan Rusyadi"));
        Tabel.getItems().add(new Mahasiswa(6, "2310817120001", "Dina Izzati Elfadheya"));
        Tabel.getItems().add(new Mahasiswa(7, "2310817210012", "Nazmi Hakim"));
        Tabel.getItems().add(new Mahasiswa(8, "2310817310010", "Akmallullail Sya'ban"));
        Tabel.getItems().add(new Mahasiswa(9, "2310817120014", "Aliya Raffa Naura Ayu"));
        Tabel.getItems().add(new Mahasiswa(10,"2310817210007", "Raymond Hariyono"));

        VBox box = new VBox(Tabel);
        Scene scene = new Scene(box);

        primaryStage.setScene(scene);
        primaryStage.setTitle("");
        primaryStage.show();
    }
}