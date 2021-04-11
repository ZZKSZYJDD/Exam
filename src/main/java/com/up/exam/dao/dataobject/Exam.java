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
    private Date examStartTime;

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

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getExamTeacher() {
        return examTeacher;
    }

    public void setExamTeacher(String examTeacher) {
        this.examTeacher = examTeacher;
    }

    public String getExamCourse() {
        return examCourse;
    }

    public void setExamCourse(String examCourse) {
        this.examCourse = examCourse;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public Date getExamStartTime() {
        return examStartTime;
    }

    public void setExamStartTime(Date examStartTime) {
        this.examStartTime = examStartTime;
    }

    public Date getExamEndTime() {
        return examEndTime;
    }

    public void setExamEndTime(Date examendTime) {
        this.examEndTime = examendTime;
    }

    public Integer getExamTime() {
        return examTime;
    }

    public void setExamTime(Integer examTime) {
        this.examTime = examTime;
    }

    public Integer getExamStatus() {
        return examStatus;
    }

    public void setExamStatus(Integer examStatus) {
        this.examStatus = examStatus;
    }

    public String getExamTestPaper() {
        return examTestPaper;
    }

    public void setExamTestPaper(String examTestPaper) {
        this.examTestPaper = examTestPaper;
    }
}