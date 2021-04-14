package com.up.exam.entity;

import com.up.exam.dao.dataobject.Class;
import com.up.exam.dao.dataobject.Teacher;

public class CourseOB {
    /**
     * 课程编号
     */
    private String courseId;

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 课程老师
     */
    private Teacher courseTeacher;

    /**
     * 上课班级
     */
    private ClassOB courseClass;

    public String getcourseId() {
        return courseId;
    }

    public void setcourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getcourseName() {
        return courseName;
    }

    public void setcourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getcourseTeacher() {
        return courseTeacher;
    }

    public void setcourseTeacher(Teacher courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public ClassOB getcourseClass() {
        return courseClass;
    }

    public void setcourseClass(ClassOB courseClass) {
        this.courseClass = courseClass;
    }
}
