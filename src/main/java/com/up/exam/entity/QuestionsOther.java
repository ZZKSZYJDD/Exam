package com.up.exam.entity;

public class QuestionsOther {
    private String questionsStems;
    private String questionsID;
    private int count;

    public QuestionsOther(String questionsStems, String questionsID, int count) {
        this.questionsStems = questionsStems;
        this.questionsID = questionsID;
        this.count = count;
    }

    public String getQuestionsStems() {
        return questionsStems;
    }

    public void setQuestionsStems(String questionsStems) {
        this.questionsStems = questionsStems;
    }

    public String getQuestionsID() {
        return questionsID;
    }

    public void setQuestionsID(String questionsID) {
        this.questionsID = questionsID;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
