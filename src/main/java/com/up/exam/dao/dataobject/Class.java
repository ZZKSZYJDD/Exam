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

    public String getclassId() {
        return classId;
    }

    public void setclassId(String classId) {
        this.classId = classId;
    }

    public String getclassStudent() {
        return classStudent;
    }

    public void setclassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public String getclassName() {
        return className;
    }

    public void setclassName(String className) {
        this.className = className;
    }
}