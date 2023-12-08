module com.example.javaapps {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaapps to javafx.fxml;
    exports com.example.javaapps;
}