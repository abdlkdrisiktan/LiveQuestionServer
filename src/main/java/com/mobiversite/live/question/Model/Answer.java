package com.mobiversite.live.question.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Answer")
public class Answer {

    @Id
    private String Id;
    private int questionId;
    private int rightAnswer;


    public Answer(String id, int questionId, int rightAnswer) {
        Id = id;
        this.questionId = questionId;
        this.rightAnswer = rightAnswer;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(int rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public Answer() {
    }

    public Answer(int rightAnswer,int questionId) {
        this.rightAnswer = rightAnswer;
        this.questionId=questionId;
    }
}
