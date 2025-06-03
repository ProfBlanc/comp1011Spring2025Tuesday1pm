package com.example.comp1011spring2025tuesday1pm;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.List;

public class QuizGameController {

    @FXML
    private Button btnSubmit;


    @FXML
    private ComboBox<String> cbNickname;

    @FXML
    private ImageView imgAvatar;

    @FXML
    private Spinner<Integer> imgSpinner;


    @FXML
    public void initialize(){

        cbNickname.getItems().addAll(Participant.getAllNames());
        cbNickname.getSelectionModel().selectFirst();

       List<Image> images =  Participant.getAllAvatars().stream()
                .map(v -> new Image(getClass().getResourceAsStream("avatars/" + v)))
               .toList();

        imgAvatar.setImage(images.get(0));

        imgSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, images.size() - 1, 0));


        imgSpinner.valueProperty().addListener(
                (observable, oldValue, newValue) -> {
                    imgAvatar.setImage(images.get(newValue));
                }
        );


        btnSubmit.setOnAction(
                event -> {

                    String selectedName = cbNickname.getSelectionModel().getSelectedItem();
                    Image selectedImage = imgAvatar.getImage();

                    System.out.println(selectedName);
                    System.out.println(selectedImage);

                }
        );

    }



}
