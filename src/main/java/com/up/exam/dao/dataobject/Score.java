package com.up.exam.dao.dataobject;

/**
 * 
 * @date 2021/04/09
 */
public class Score {
    /**
     * 成绩编号
     */
    private String scoreID;

    /**
     * 哪一场考试
     */
    private String scoreExam;

    /**
     * 参加考试的学生
     */
    private String scoreStudents;

    /**
     * 考试成绩
     */
    private Integer score;

    public String getscoreID() {
        return scoreID;
    }

    public void setscoreID(String scoreID) {
        this.scoreID = scoreID;
    }

    public String getscoreExam() {
        return scoreExam;
    }

    public void setscoreExam(String scoreExam) {
        this.scoreExam = scoreExam;
    }

    public String getscoreStudents() {
        return scoreStudents;
    }

    public void setscoreStudents(String scoreStudents) {
        this.scoreStudents = scoreStudents;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}