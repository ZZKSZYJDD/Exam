package com.up.exam.controller;

import com.up.exam.dao.ClassDao;
import com.up.exam.dao.CourseDao;
import com.up.exam.dao.dataobject.Class;
import com.up.exam.dao.dataobject.Course;
import com.up.exam.dao.dataobject.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    CourseDao courseDao;
    @Autowired
    ClassDao classDao;

    @RequestMapping("/student/getAllCourse")
    public List<Course> getCourse(HttpSession session){
        //TODO 测试数据改为session;
        //Student student = (Student) session.getAttribute("student");
        Student student = new Student();
        student.setStudentId("201819144323");
        List<Course> courses = new ArrayList<>();
        List<Class> classes = classDao.selectClassByStudentID(student.getStudentId());
        for (int i = 0; i < classes.size(); i++) {
            courses.addAll(courseDao.selectByClassID(classes.get(i).getclassId()));
        }
        return courses;
    }



}
