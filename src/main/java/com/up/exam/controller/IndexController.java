package com.up.exam.controller;

import com.up.exam.dao.CourseDao;
import com.up.exam.dao.dataobject.Course;
import com.up.exam.dao.dataobject.Student;
import com.up.exam.dao.dataobject.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @Autowired
    CourseDao courseDao;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/student")
    public String student(){
        return "student";
    }
    @ResponseBody
    @RequestMapping("/getNow")
    public String getNow(HttpSession session){

        Student student = (Student) session.getAttribute("student");
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        if (student!=null){
           return student.getStudentName();
        }if (teacher!=null){
            return teacher.getteacherName();
        }
        return "-1";
    }
    @RequestMapping(value = "/student/course/{courseId}")
    public String toCourse(HttpSession session,@PathVariable String courseId){
        Course course = courseDao.selectByID(courseId);
        session.setAttribute("course",course);
        return "course";
    }
}
