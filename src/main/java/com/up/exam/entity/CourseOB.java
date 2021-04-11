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

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(Teacher courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public ClassOB getCourseClass() {
        return courseClass;
    }

    public void setCourseClass(ClassOB courseClass) {
        this.courseClass = courseClass;
    }
}
