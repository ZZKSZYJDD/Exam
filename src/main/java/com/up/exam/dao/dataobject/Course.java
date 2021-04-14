package com.up.exam.dao.dataobject;

/**
 * 
 * @date 2021/04/09
 */
public class Course {
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
    private String courseTeacher;

    /**
     * 上课班级
     */
    private String courseClass;

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

    public String getcourseTeacher() {
        return courseTeacher;
    }

    public void setcourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public String getcourseClass() {
        return courseClass;
    }

    public void setcourseClass(String courseClass) {
        this.courseClass = courseClass;
    }
}