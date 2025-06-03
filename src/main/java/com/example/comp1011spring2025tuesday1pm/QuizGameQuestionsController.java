package com.example.comp1011spring2025tuesday1pm;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class QuizGameQuestionsController {

//    private String nickname;
//    private Image avatar;
    private Participant participant;

    @FXML
    private ImageView imgAvatar;

    @FXML
    private RadioButton rbOption1, rbOption2, rbOption3, rbOption4;

    @FXML
    private Label txtCorrectAnswers, txtNickname, txtQuestion, txtQuestionsRemaining, txtTotalQuestions;
        public void setParticipant(Participant participant) {
            this.participant = participant;
        }
//    public void setAvatarImage(Image image) {
//        avatar = image;
//    }
//    public void setNickname(String nickname) {
//        this.nickname = nickname;
//    }
    @FXML
    private void initialize(){

//        imgAvatar.setImage(avatar);
//        txtNickname.setText(nickname);
        imgAvatar.setImage(participant.getAvatar());
        txtNickname.setText(participant.getName());
    }


}
