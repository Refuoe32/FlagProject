module com.example.flagproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flagproject to javafx.fxml;
    exports com.example.flagproject;
}