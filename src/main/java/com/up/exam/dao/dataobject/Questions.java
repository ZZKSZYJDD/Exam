package com.up.exam.dao.dataobject;

/**
 * 
 * @date 2021/04/09
 */
public class Questions {
    /**
     * 问题编号
     */
    private String questionsId;

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
    private String questionsKnowledgePoint;

    /**
     * 题目难度：0为简单1为普通2为困难
     */
    private Integer questionsDifficulty;

    public String getQuestionsId() {
        return questionsId;
    }

    public void setQuestionsId(String questionsId) {
        this.questionsId = questionsId;
    }

    public Integer getQuestionsType() {
        return questionsType;
    }

    public void setQuestionsType(Integer questionsType) {
        this.questionsType = questionsType;
    }

    public String getQuestionsStems() {
        return questionsStems;
    }

    public void setQuestionsStems(String questionsStems) {
        this.questionsStems = questionsStems;
    }

    public String getQuestionsOption() {
        return questionsOption;
    }

    public void setQuestionsOption(String questionsOption) {
        this.questionsOption = questionsOption;
    }

    public String getQuestionsAnswer() {
        return questionsAnswer;
    }

    public void setQuestionsAnswer(String questionsAnswer) {
        this.questionsAnswer = questionsAnswer;
    }

    public String getQuestionsKnowledgePoint() {
        return questionsKnowledgePoint;
    }

    public void setQuestionsKnowledgePoint(String questionsKnowledgePoint) {
        this.questionsKnowledgePoint = questionsKnowledgePoint;
    }

    public Integer getQuestionsDifficulty() {
        return questionsDifficulty;
    }

    public void setQuestionsDifficulty(Integer questionsDifficulty) {
        this.questionsDifficulty = questionsDifficulty;
    }
}