package com.up.exam.dao.dataobject;

/**
 * 
 * @date 2021/04/09
 */
public class Knowledgepoint {
    /**
     * 知识点ID
     */
    private String knowledgePointId;

    /**
     * 知识点名称
     */
    private String knowledgePointName;

    /**
     * 知识点属于的课程
     */
    private String knowledgePointCourse;

    public String getKnowledgePointId() {
        return knowledgePointId;
    }

    public void setKnowledgePointId(String knowledgePointId) {
        this.knowledgePointId = knowledgePointId;
    }

    public String getKnowledgePointName() {
        return knowledgePointName;
    }

    public void setKnowledgePointName(String knowledgePointName) {
        this.knowledgePointName = knowledgePointName;
    }

    public String getKnowledgePointCourse() {
        return knowledgePointCourse;
    }

    public void setKnowledgePointCourse(String knowledgePointCourse) {
        this.knowledgePointCourse = knowledgePointCourse;
    }
}