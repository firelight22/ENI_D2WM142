package com.example.mod4tpvraifaux.bo;

public class QuestionReponseJV {
    private String question = "La réponse est \"faux\"";
    private boolean reponse = false;

    public String getQuestion() {
        return question;
    }

    public boolean getReponse() {
        return reponse;
    }

    @Override
    public String toString() {
        return "QuestionReponseJV{" +
                "question='" + question + '\'' +
                ", reponse=" + reponse +
                '}';
    }
}
