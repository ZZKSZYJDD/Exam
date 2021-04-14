package com.up.exam.dao.dataobject;

/**
 * 
 * @date 2021/04/09
 */

public class KnowledgePoint {
    /**
     * 知识点ID
     */
    private String KnowledgePointID;

    /**
     * 知识点名称
     */
    private String KnowledgePointName;

    /**
     * 知识点属于的课程
     */
    private String KnowledgePointCourse;

    public String getKnowledgePointID() {
        return KnowledgePointID;
    }

    public void setKnowledgePointID(String KnowledgePointID) {
        this.KnowledgePointID = KnowledgePointID;
    }

    public String getKnowledgePointIDName() {
        return KnowledgePointName;
    }

    public void setKnowledgePointName(String KnowledgePointName) {
        this.KnowledgePointName = KnowledgePointName;
    }

    public String getKnowledgePointCourse() {
        return KnowledgePointCourse;
    }

    public void setKnowledgePointCourse(String KnowledgePointCourse) {
        this.KnowledgePointCourse = KnowledgePointCourse;
    }
}