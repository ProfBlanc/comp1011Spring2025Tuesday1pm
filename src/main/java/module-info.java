module com.example.comp1011spring2025tuesday1pm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp1011spring2025tuesday1pm to javafx.fxml;
    exports com.example.comp1011spring2025tuesday1pm;
}