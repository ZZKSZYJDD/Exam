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
        this.classId = c.getclassId();
        classStudent = students;
        this.className = c.getclassName();
    }

    public String getclassId() {
        return classId;
    }

    public void setclassId(String classId) {
        this.classId = classId;
    }

    public List<Student> getclassStudent() {
        return classStudent;
    }

    public void setclassStudent(List<Student> classStudent) {
        this.classStudent = classStudent;
    }

    public String getclassName() {
        return className;
    }

    public void setclassName(String className) {
        this.className = className;
    }
}
