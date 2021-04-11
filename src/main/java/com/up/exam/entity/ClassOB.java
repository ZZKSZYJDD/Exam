package com.up.exam.entity;

import com.up.exam.dao.dataobject.Class;
import com.up.exam.dao.dataobject.Student;

import java.util.List;

public class ClassOB {
    /**
     * 班级编号
     */
    private String classId;

    /**
     * 班级学生
     */
    private List<Student> classStudent;

    /**
     * 班级名称
     */
    private String className;

    public ClassOB(String classId, List<Student> students, String className) {
        this.classId = classId;
        this.className = className;
        classStudent = students;
    }

    public ClassOB(Class c, List<Student> students) {
        this.classId = c.getClassId();
        classStudent = students;
        this.className = c.getClassName();
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public List<Student> getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(List<Student> classStudent) {
        this.classStudent = classStudent;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
