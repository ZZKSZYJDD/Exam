package com.up.exam.dao.dataobject;

/**
 * 
 * @date 2021/04/09
 */
public class Testpaper {
    /**
     * 试卷ID
     */
    private String testpaperId;

    /**
     * 试卷名称
     */
    private String testpaperName;

    /**
     * 出题人
     */
    private String testpaperTeather;

    /**
     * 题目ID用占位符@分割例:@1
     */
    private String testpaperQuestion;

    /**
     * 试卷总分
     */
    private Integer testpaperTotalPoints;

    /**
     * 试卷课程
     */
    private String testpaperCourse;

    /**
     * 试卷各种题目的数量(格式:@单选择题数量@多选题数量@判断题数量@填空题数量@简答题数量)
     */
    private String testpaperQuestionNumber;

    /**
     * 试卷各种题目的分值（格式：@单选择题分数@多选题分数@判断题分数@填空题分数@简答题分数）
     */
    private String testpaperQuestionScore;

    public String gettestpaperId() {
        return testpaperId;
    }

    public void settestpaperId(String testpaperId) {
        this.testpaperId = testpaperId;
    }

    public String gettestpaperName() {
        return testpaperName;
    }

    public void settestpaperName(String testpaperName) {
        this.testpaperName = testpaperName;
    }

    public String gettestpaperTeather() {
        return testpaperTeather;
    }

    public void settestpaperTeather(String testpaperTeather) {
        this.testpaperTeather = testpaperTeather;
    }

    public String gettestpaperQuestion() {
        return testpaperQuestion;
    }

    public void settestpaperQuestion(String testpaperQuestion) {
        this.testpaperQuestion = testpaperQuestion;
    }

    public Integer gettestpaperTotalPoints() {
        return testpaperTotalPoints;
    }

    public void settestpaperTotalPoints(Integer testpaperTotalPoints) {
        this.testpaperTotalPoints = testpaperTotalPoints;
    }

    public String gettestpaperCourse() {
        return testpaperCourse;
    }

    public void settestpaperCourse(String testpaperCourse) {
        this.testpaperCourse = testpaperCourse;
    }

    public String gettestpaperQuestionNumber() {
        return testpaperQuestionNumber;
    }

    public void settestpaperQuestionNumber(String testpaperQuestionNumber) {
        this.testpaperQuestionNumber = testpaperQuestionNumber;
    }

    public String gettestpaperQuestionScore() {
        return testpaperQuestionScore;
    }

    public void settestpaperQuestionScore(String testpaperQuestionScore) {
        this.testpaperQuestionScore = testpaperQuestionScore;
    }
}