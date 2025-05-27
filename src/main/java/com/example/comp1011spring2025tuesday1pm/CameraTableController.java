package com.example.comp1011spring2025tuesday1pm;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class CameraTableController {

    @FXML
    private TableView<CameraModel> tableView;



    @FXML
    public void initialize(){
        /*

         */

        TableColumn<CameraModel, String> columnColor =
                new TableColumn<>("Color");

        TableColumn<CameraModel, CameraModel.MemoryOptions> columnMemory =
                new TableColumn<>("Memory");

        TableColumn<CameraModel, CameraModel.AvailableBrands> columnBrand =
                new TableColumn<>("Brand");

        TableColumn<CameraModel, Double> columnResolution =
                new TableColumn<>("Resolution");

        TableColumn<CameraModel, Integer> columnLensLength =
                new TableColumn<>("Lens Length");



        columnColor.setCellValueFactory(
                new PropertyValueFactory<>("color")
        );

        columnMemory.setCellValueFactory(
                new PropertyValueFactory<>("memory")
        );
        columnBrand.setCellValueFactory(
                new PropertyValueFactory<>("brand")
        );
        columnResolution.setCellValueFactory(
                new PropertyValueFactory<>("resolution")
        );
        columnLensLength.setCellValueFactory(
                new PropertyValueFactory<>("lensLength")
        );


        tableView.getColumns().add(columnColor);
        tableView.getColumns().addAll(columnBrand, columnMemory , columnResolution, columnLensLength);

        ArrayList<CameraModel> cameraModels = new ArrayList<>();

        cameraModels.add(new CameraModel(CameraModel.MemoryOptions.GB_32, "Red", CameraModel.AvailableBrands.CANON, 1080, 10));
        cameraModels.add(new CameraModel(CameraModel.MemoryOptions.GB_64, "Blue", CameraModel.AvailableBrands.POLAROID, 1080, 10));
        cameraModels.add(new CameraModel(CameraModel.MemoryOptions.GB_128, "Green", CameraModel.AvailableBrands.SONY, 1080, 10));

        tableView.getItems().addAll(cameraModels);


    }

}
