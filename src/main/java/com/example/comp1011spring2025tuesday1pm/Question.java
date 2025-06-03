package com.example.comp1011spring2025tuesday1pm;

import java.util.ArrayList;
import java.util.Arrays;

public class Question {
    private String questionText;
    private ArrayList<QuestionOption> options = new ArrayList<>();
    private int correctAnswer;

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        if(questionText.length() < 3)
            throw new IllegalArgumentException("Question text must be at least 3 characters");
        this.questionText = questionText;
    }
    public ArrayList<QuestionOption> getOptions() {
        return options;
    }

    //setOptions("q1", "q2", "q3")
    public void setOptions(QuestionOption ...options) {
        this.options.clear();
        for (QuestionOption option : options){
            this.options.add(option);
        }
    }
    public void addOption(QuestionOption option){
        this.options.add(option);
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        if(correctAnswer < 0 || correctAnswer >= options.size())
            throw new IllegalArgumentException("Correct answer must be between 0 and " + (options.size() - 1));
        this.correctAnswer = correctAnswer;
    }

    public Question(String questionText, int correctAnswer, QuestionOption ...options) {
        setQuestionText(questionText);
        setOptions(options);
        setCorrectAnswer(correctAnswer);
    }
    public Question(String questionText, QuestionOption ...options) {
        this(questionText, 0, options);
    }
}
