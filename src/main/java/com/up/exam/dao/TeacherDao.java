package com.up.exam.dao;



import com.up.exam.dao.dataobject.Teacher;

import java.util.List;

public interface TeacherDao {
    public boolean insert(Teacher teacher);
    public boolean delete(Teacher teacher);
    public boolean update(Teacher teacher);
    public List<Teacher> selectAll();
    public Teacher selectByID(String teacherID);
}
