package com.up.exam.dao.dataobject;

/**
 * 
 * @date 2021/04/09
 */
public class Teacher {
    /**
     * 工号
     */
    private String teacherId;

    /**
     * 教师姓名
     */
    private String teacherName;

    /**
     * 教师性别
     */
    private String teacherSex;

    /**
     * 教师密码
     */
    private String teacherPwd;

    /**
     * 老师邮箱
     */
    private String teacherEmail;

    public String getteacherId() {
        return teacherId;
    }

    public void setteacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getteacherName() {
        return teacherName;
    }

    public void setteacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getteacherSex() {
        return teacherSex;
    }

    public void setteacherSex(String teacherSex) {
        this.teacherSex = teacherSex;
    }

    public String getteacherPwd() {
        return teacherPwd;
    }

    public void setteacherPwd(String teacherPwd) {
        this.teacherPwd = teacherPwd;
    }
    public String getteacherEmail() {
        return teacherEmail;
    }

    public void setteacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }
}