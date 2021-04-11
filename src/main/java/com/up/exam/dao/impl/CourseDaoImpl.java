package com.up.exam.dao.impl;

import com.up.exam.dao.CourseDao;
import com.up.exam.dao.dataobject.Course;
import com.up.exam.dao.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CourseDaoImpl implements CourseDao {

    @Autowired
    CourseMapper courseMapper;


    @Override
    public boolean insert(Course course) {
        return courseMapper.insert(course)>0;
    }

    @Override
    public boolean delete(Course course) {
        return courseMapper.deleteByPrimaryKey(course.getCourseId())>0;
    }

    @Override
    public int update(Course course) {
        return courseMapper.updateByPrimaryKey(course);
    }

    @Override
    public List<Course> selectAll() {
        return courseMapper.selectAll();
    }

    @Override
    public Course selectByID(String courseOBID) {
        return courseMapper.selectByPrimaryKey(courseOBID);
    }
}
