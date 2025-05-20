package com.example.comp1011spring2025tuesday1pm;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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

    CameraModel model = new CameraModel();

    @FXML
    void onCameraListSubmit(ActionEvent event) {

    }

    @FXML
    void initialize(){

        model.getAllMemoryOptions();

        memoryList.getItems().addAll(model.getAllMemoryOptions());
        brandList.getItems().addAll(model.getAllBrands());


        memoryList.getSelectionModel().selectFirst();
        brandList.getSelectionModel().selectFirst();
        //lamba expression
        cameraList.setOnAction(
                event -> {
                    System.out.println("You selected index:" + cameraList.getSelectionModel().getSelectedIndex());
                    output.setText(cameraList.getSelectionModel().getSelectedItem());
                }

        );
    }

    @FXML
    void onFormSubmit(ActionEvent event) {

//        System.out.println(txtColor.getText());
//        System.out.println(txtLensLength.getText());
//        System.out.println(txtResolution.getText());
//
//        output.setText(txtColor.getText() + txtLensLength.getText() + txtResolution.getText());

        System.out.println(brandList.getSelectionModel().getSelectedItem());
        System.out.println(memoryList.getSelectionModel().getSelectedIndex());

        //get all of the values that the user inputted
        //use the getters of cameramodel object to set all the values of the class

        //if any validation error occurs, create an alert to display message to user
        try {
            model.setBrand(CameraModel.AvailableBrands.valueOf(brandList.getSelectionModel().getSelectedItem()));
            model.setMemory(CameraModel.MemoryOptions.valueOf(memoryList.getSelectionModel().getSelectedItem()));
            model.setColor(txtColor.getText());
            model.setResolution(Double.parseDouble(txtResolution.getText()));
            model.setLensLength(Integer.parseInt(txtLensLength.getText()));

            output.setText(model.toString());
            cameraList.getItems().add(model.comboBoxDisplay());
        }
        catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Validation Error");
            alert.setHeaderText("Incorrect Values");
            alert.setContentText(e.getMessage());
            alert.show();

        }



    }

}
