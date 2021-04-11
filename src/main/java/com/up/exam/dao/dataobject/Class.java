package com.up.exam.dao.dataobject;

/**
 * 
 * @date 2021/04/09
 */
public class Class {
    /**
     * 班级编号
     */
    private String classId;

    /**
     * 班级学生
     */
    private String classStudent;

    /**
     * 班级名称
     */
    private String className;

    public Class(String classId, String className, String classStudent) {
        this.classId = classId;
        this.className = className;
        this.classStudent = classStudent;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}