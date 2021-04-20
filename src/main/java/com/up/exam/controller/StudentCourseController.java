package com.up.exam.controller;

import com.up.exam.dao.ClassDao;
import com.up.exam.dao.CourseDao;
import com.up.exam.dao.ExamDao;
import com.up.exam.dao.dataobject.Course;
import com.up.exam.dao.dataobject.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class StudentCourseController {

    @Autowired
    CourseDao courseDao;
    @Autowired
    ExamDao examDao;

    @RequestMapping("/student/getCourse")
    public Course getCourse(HttpSession session){
        return (Course) session.getAttribute("course");
    }
    @RequestMapping("/student/getExam")
    public List<Exam> getExam(HttpSession session){
        Course course = (Course) session.getAttribute("course");
        return examDao.selectByCourseID(course.getCourseId());
    }
}
