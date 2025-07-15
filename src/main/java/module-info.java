module com.example.comp1011spring2025tuesday1pm {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;


    opens com.example.comp1011spring2025tuesday1pm to javafx.fxml, com.google.gson;
    exports com.example.comp1011spring2025tuesday1pm;
}