package com.up.exam.dao.dataobject;

/**
 * 
 * @date 2021/04/09
 */
public class Score {
    /**
     * 成绩编号
     */
    private String scoreId;

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

    public String getScoreId() {
        return scoreId;
    }

    public void setScoreId(String scoreId) {
        this.scoreId = scoreId;
    }

    public String getScoreExam() {
        return scoreExam;
    }

    public void setScoreExam(String scoreExam) {
        this.scoreExam = scoreExam;
    }

    public String getScoreStudents() {
        return scoreStudents;
    }

    public void setScoreStudents(String scoreStudents) {
        this.scoreStudents = scoreStudents;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}