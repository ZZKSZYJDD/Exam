package com.up.exam.dao.dataobject;

import org.springframework.context.annotation.Bean;

/**
 * 
 * @date 2021/04/09
 */

public class Answer {
    /**
     * 回答问题的学生
     */
    private String answerStudent;

    /**
     * 回答的问题
     */
    private String answerQuestions;

    /**
     * 回答的考试
     */
    private String answerExam;

    /**
     * 学生做答的结果
     */
    private String answerQuestionsResult;

    public Answer(String studentId, String questionsID, String examId) {
        this.answerExam = examId;
        this.answerQuestions = questionsID;
        this.answerStudent = studentId;
    }

    public String getAnswerStudent() {
        return answerStudent;
    }

    public void setAnswerStudent(String answerStudent) {
        this.answerStudent = answerStudent;
    }

    public String getAnswerQuestions() {
        return answerQuestions;
    }

    public void setAnswerQuestions(String answerQuestions) {
        this.answerQuestions = answerQuestions;
    }

    public String getAnswerExam() {
        return answerExam;
    }

    public void setAnswerExam(String answerExam) {
        this.answerExam = answerExam;
    }

    public String getAnswerQuestionsResult() {
        return answerQuestionsResult;
    }

    public void setAnswerQuestionsResult(String answerQuestionsResult) {
        this.answerQuestionsResult = answerQuestionsResult;
    }
}