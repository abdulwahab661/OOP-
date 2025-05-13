module com.example.gui01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gui01 to javafx.fxml;
    exports com.example.gui01;
}