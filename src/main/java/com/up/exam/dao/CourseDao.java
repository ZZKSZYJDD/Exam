package com.up.exam.dao;


import com.up.exam.dao.dataobject.Course;

import java.util.List;

public interface CourseDao {
    public boolean insert(Course course);
    public boolean delete(Course course);
    public int update(Course course);
    public List<Course> selectAll();
    public Course selectByID(String courseID);
}
