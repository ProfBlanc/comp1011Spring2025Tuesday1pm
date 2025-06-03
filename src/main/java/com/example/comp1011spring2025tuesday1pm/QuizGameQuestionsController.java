package com.example.comp1011spring2025tuesday1pm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class QuizGameQuestionsController {

//    private String nickname;
//    private Image avatar;
    private Participant participant;
    private QuizModel model;

    @FXML
    private Button btnSubmit;
    @FXML
    private ImageView imgAvatar;

    @FXML
    private RadioButton rbOption1, rbOption2, rbOption3, rbOption4;

    private ToggleGroup toggleGroup = new ToggleGroup();

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



    private void generateQuizQuestions() {

            QuestionOption question1Option1 = new QuestionOption("Monday");
        QuestionOption question1Option2 = new QuestionOption("Tuesday");
        QuestionOption question1Option3 = new QuestionOption("Wednesday");
        QuestionOption question1Option4 = new QuestionOption("Thursday");

        Question question1 = new Question("What day of the week do you have comp1011?", 1,
                question1Option1, question1Option2, question1Option3, question1Option4);


        /// ///////////////////////////////////////////////////////////

        QuestionOption question2Option1 = new QuestionOption("Georgian College");
        QuestionOption question2Option2 = new QuestionOption("Barrie College");
        QuestionOption question2Option3 = new QuestionOption("Simcoe College");
        QuestionOption question2Option4 = new QuestionOption("Lakehead University");

        Question question2 = new Question("What school do you attend?",
                question2Option1, question2Option2, question2Option3, question2Option4);

        /// ///////////////////////////////////////////////////////////

        QuestionOption question3Option1 = new QuestionOption("VS Code");
        QuestionOption question3Option2 = new QuestionOption("Eclipse");
        QuestionOption question3Option3 = new QuestionOption("Java Time");
        QuestionOption question3Option4 = new QuestionOption("IntelliJ");

        Question question3 = new Question("What IDE does your prof use in comp1011?", 3,
                question3Option1, question3Option2, question3Option3, question3Option4);

        model = new QuizModel(question1, question2, question3);



    }
    @FXML
    private void onSubmit(ActionEvent event) {
        System.out.println("You have submitted an answer");

        RadioButton rb = (RadioButton) toggleGroup.getSelectedToggle();

        if(rb == null)
            System.err.println("You have not selected a radio button");
        else{
            System.out.println("You have selected the answer: " + rb.getText());
        }

    }
    private void setupQuizQuestionPage(){

            Question question = model.getQuestion(0);

            txtQuestion.setText(question.getQuestionText());
            rbOption1.setText(question.getOptions().get(0).getContent());
            rbOption2.setText(question.getOptions().get(1).getContent());
            rbOption3.setText(question.getOptions().get(2).getContent());
            rbOption4.setText(question.getOptions().get(3).getContent());

            rbOption1.setToggleGroup(toggleGroup);
            rbOption2.setToggleGroup(toggleGroup);
            rbOption3.setToggleGroup(toggleGroup);
            rbOption4.setToggleGroup(toggleGroup);


    }
    @FXML
    private void initialize(){

//        imgAvatar.setImage(avatar);
//        txtNickname.setText(nickname);

        imgAvatar.setImage(participant.getAvatar());
        txtNickname.setText(participant.getName());
        generateQuizQuestions();
        setupQuizQuestionPage();
        btnSubmit.setOnAction(this::onSubmit);
    }

    /*
        QuizModel
            Many Questions: Question (class)
            Total Questions: int (data type)
        Question:
            QuestionText: String
            Many QuestionOptions: QuestionOption (class)
            Correct Answer: int (index of QuestionOptions)
        QuestionOption:
            Content/Text: String

    */
}
