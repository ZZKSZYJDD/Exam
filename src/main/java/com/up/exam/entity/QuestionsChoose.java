package com.up.exam.entity;

import java.util.List;

public class QuestionsChoose {
    private String questionsID;
    private String questionsStems;
    private List<String> options;
    private int count;
    public QuestionsChoose(String questionsID, String questionsStems, List<String> options, int count) {
        this.questionsID = questionsID;
        this.questionsStems = questionsStems;
        this.options = options;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getQuestionsID() {
        return questionsID;
    }

    public void setQuestionsID(String questionsID) {
        this.questionsID = questionsID;
    }

    public String getQuestionsStems() {
        return questionsStems;
    }

    public void setQuestionsStems(String questionsStems) {
        this.questionsStems = questionsStems;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}
