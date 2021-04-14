package com.up.exam.dao.dataobject;

/**
 * 
 * @date 2021/04/09
 */
public class Questions {
    /**
     * 问题编号
     */
    private String questionsID;

    /**
     * 问题类型（0：单选题；1：多选题；2：判断题；3：填空题；4：简答题）
     */
    private Integer questionsType;

    /**
     * 题干
     */
    private String questionsStems;

    /**
     * 题目选项（问题类型为0、1时不为空）
     */
    private String questionsOption;

    /**
     * 题目答案（0：为选项标号例：ABCD;1:0为错误，1为正确；2：对应文字；3：可为空，参考答案)
     */
    private String questionsAnswer;

    /**
     * 题目知识点
     */
    private String questionsKnowledgePointID;

    /**
     * 题目难度：0为简单1为普通2为困难
     */
    private Integer questionsDifficulty;

    public String getquestionsID() {
        return questionsID;
    }

    public void setquestionsID(String questionsID) {
        this.questionsID = questionsID;
    }

    public Integer getquestionsType() {
        return questionsType;
    }

    public void setquestionsType(Integer questionsType) {
        this.questionsType = questionsType;
    }

    public String getquestionsStems() {
        return questionsStems;
    }

    public void setquestionsStems(String questionsStems) {
        this.questionsStems = questionsStems;
    }

    public String getquestionsOption() {
        return questionsOption;
    }

    public void setquestionsOption(String questionsOption) {
        this.questionsOption = questionsOption;
    }

    public String getquestionsAnswer() {
        return questionsAnswer;
    }

    public void setquestionsAnswer(String questionsAnswer) {
        this.questionsAnswer = questionsAnswer;
    }

    public String getquestionsKnowledgePointID() {
        return questionsKnowledgePointID;
    }

    public void setquestionsKnowledgePointID(String questionsKnowledgePointID) {
        this.questionsKnowledgePointID = questionsKnowledgePointID;
    }

    public Integer getquestionsDifficulty() {
        return questionsDifficulty;
    }

    public void setquestionsDifficulty(Integer questionsDifficulty) {
        this.questionsDifficulty = questionsDifficulty;
    }
}