package com.up.exam.dao.dataobject;

/**
 * 
 * @date 2021/04/09
 */
public class Testpaper {
    /**
     * 试卷ID
     */
    private String testPaperId;

    /**
     * 试卷名称
     */
    private String testPaperName;

    /**
     * 出题人
     */
    private String testPaperTeacher;

    /**
     * 题目ID用占位符@分割例:@1
     */
    private String testPaperQuestion;

    /**
     * 试卷总分
     */
    private Integer testPaperTotalPoints;

    /**
     * 试卷课程
     */
    private String testPaperCourse;

    /**
     * 试卷各种题目的数量(格式:@单选择题数量@多选题数量@判断题数量@填空题数量@简答题数量)
     */
    private String testPaperQuestionNumber;

    /**
     * 试卷各种题目的分值（格式：@单选择题分数@多选题分数@判断题分数@填空题分数@简答题分数）
     */
    private String testPaperQuestionScore;

    public String getTestPaperId() {
        return testPaperId;
    }

    public void setTestPaperId(String testPaperId) {
        this.testPaperId = testPaperId;
    }

    public String getTestPaperName() {
        return testPaperName;
    }

    public void setTestPaperName(String testPaperName) {
        this.testPaperName = testPaperName;
    }

    public String getTestPaperTeacher() {
        return testPaperTeacher;
    }

    public void setTestPaperTeacher(String testPaperTeacher) {
        this.testPaperTeacher = testPaperTeacher;
    }

    public String getTestPaperQuestion() {
        return testPaperQuestion;
    }

    public void setTestPaperQuestion(String testPaperQuestion) {
        this.testPaperQuestion = testPaperQuestion;
    }

    public Integer getTestPaperTotalPoints() {
        return testPaperTotalPoints;
    }

    public void setTestPaperTotalPoints(Integer testPaperTotalPoints) {
        this.testPaperTotalPoints = testPaperTotalPoints;
    }

    public String getTestPaperCourse() {
        return testPaperCourse;
    }

    public void setTestPaperCourse(String testPaperCourse) {
        this.testPaperCourse = testPaperCourse;
    }

    public String getTestPaperQuestionNumber() {
        return testPaperQuestionNumber;
    }

    public void setTestPaperQuestionNumber(String testPaperQuestionNumber) {
        this.testPaperQuestionNumber = testPaperQuestionNumber;
    }

    public String getTestPaperQuestionScore() {
        return testPaperQuestionScore;
    }

    public void setTestPaperQuestionScore(String testPaperQuestionScore) {
        this.testPaperQuestionScore = testPaperQuestionScore;
    }
}