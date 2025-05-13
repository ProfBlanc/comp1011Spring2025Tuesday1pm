package com.example.comp1011spring2025tuesday1pm;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CameraController {

    @FXML
    private ComboBox<String> brandList;

    @FXML
    private ComboBox<String> cameraList;

    @FXML
    private ComboBox<String> memoryList;

    @FXML
    private TextArea output;

    @FXML
    private TextField txtColor;

    @FXML
    private TextField txtLensLength;

    @FXML
    private TextField txtResolution;

    @FXML
    void onCameraListSubmit(ActionEvent event) {

    }

    @FXML
    void onFormSubmit(ActionEvent event) {

        System.out.println(txtColor.getText());
        System.out.println(txtLensLength.getText());
        System.out.println(txtResolution.getText());

        output.setText(txtColor.getText() + txtLensLength.getText() + txtResolution.getText());

    }

}
