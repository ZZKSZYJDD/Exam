package com.up.exam.dao.dataobject;

import java.util.Date;

/**
 * 
 * @date 2021/04/09
 */
public class Exam {
    /**
     * 考试编号
     */
    private String examId;

    /**
     * 考试发布老师
     */
    private String examTeacher;

    /**
     * 考试课程
     */
    private String examCourse;

    /**
     * 考试名称
     */
    private String examName;

    /**
     * 考试开始时间
     */
    private Date examStarsTime;

    /**
     * 考试结束时间
     */
    private Date examEndTime;

    /**
     * 考试时间（单位：分钟）
     */
    private Integer examTime;

    /**
     * 考试是否结束
     */
    private Integer examStatus;

    /**
     * 考试试卷ID
     */
    private String examTestPaper;

    public String getexamId() {
        return examId;
    }

    public void setexamId(String examId) {
        this.examId = examId;
    }

    public String getexamTeacher() {
        return examTeacher;
    }

    public void setexamTeacher(String examTeacher) {
        this.examTeacher = examTeacher;
    }

    public String getexamCourse() {
        return examCourse;
    }

    public void setexamCourse(String examCourse) {
        this.examCourse = examCourse;
    }

    public String getexamName() {
        return examName;
    }

    public void setexamName(String examName) {
        this.examName = examName;
    }

    public Date getexamStarsTime() {
        return examStarsTime;
    }

    public void setexamStarsTime(Date examStarsTime) {
        this.examStarsTime = examStarsTime;
    }

    public Date getexamEndTime() {
        return examEndTime;
    }

    public void setexamEndTime(Date examEndTime) {
        this.examEndTime = examEndTime;
    }

    public Integer getexamTime() {
        return examTime;
    }

    public void setexamTime(Integer examTime) {
        this.examTime = examTime;
    }

    public Integer getexamStatus() {
        return examStatus;
    }

    public void setexamStatus(Integer examStatus) {
        this.examStatus = examStatus;
    }

    public String getexamTestPaper() {
        return examTestPaper;
    }

    public void setexamTestPaper(String examTestPaper) {
        this.examTestPaper = examTestPaper;
    }
}