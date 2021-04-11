package com.up.exam.dao;


import com.up.exam.entity.CourseOB;

import java.util.List;

public interface CourseOBDao {
    public boolean insert(CourseOB courseOB);
    public boolean delete(CourseOB courseOB);
    public boolean update(CourseOB courseOB);
    public List<CourseOB> selectAll();
    public CourseOB selectByID(String courseOBID);
}
