package com.up.exam.entity;

import com.up.exam.dao.dataobject.Exam;
import com.up.exam.dao.dataobject.Questions;
import com.up.exam.dao.dataobject.Student;

public class AnswerOB {
    /**
     * 回答问题的学生
     */
    private Student answerStudent;

    /**
     * 回答的问题
     */
    private Questions answerQuestions;

    /**
     * 回答的考试
     */
    private Exam answerExam;

    /**
     * 学生做答的结果
     */
    private String answerQuestionsResult;

    public Student getAnswerStudent() {
        return answerStudent;
    }

    public void setAnswerStudent(Student answerStudent) {
        this.answerStudent = answerStudent;
    }

    public Questions getAnswerQuestions() {
        return answerQuestions;
    }

    public void setAnswerQuestions(Questions answerQuestions) {
        this.answerQuestions = answerQuestions;
    }

    public Exam getAnswerExam() {
        return answerExam;
    }

    public void setAnswerExam(Exam answerExam) {
        this.answerExam = answerExam;
    }

    public String getAnswerQuestionsResult() {
        return answerQuestionsResult;
    }

    public void setAnswerQuestionsResult(String answerQuestionsResult) {
        this.answerQuestionsResult = answerQuestionsResult;
    }
}
