package com.up.exam.entity;

import java.util.List;

public class QuestionsLook {
    private String questionsID;
    private String questionsStems;
    private List<String> options;

    public QuestionsLook(String questionsID, String questionsStems, List<String> options) {
        this.questionsID = questionsID;
        this.questionsStems = questionsStems;
        this.options = options;
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
