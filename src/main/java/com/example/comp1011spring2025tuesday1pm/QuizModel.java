package com.example.comp1011spring2025tuesday1pm;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizModel {

    private ArrayList<Question> questions = new ArrayList<>();
    private int totalQuestions;

    public void setQuestions(Question ...questions) {
        this.questions.clear();
        for(Question question : questions){
            this.questions.add(question);
        }

        this.totalQuestions = this.questions.size();
    }
    public Question getQuestion(int index){
        if(index < 0 || index >= this.questions.size())
            throw new IndexOutOfBoundsException("No question found with index " + index);

        return this.questions.get(index);
    }
    public QuizModel(Question ...questions) {
        setQuestions(questions);
    }
}
