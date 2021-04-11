package com.up.exam.dao;


import com.up.exam.dao.dataobject.Student;
import com.up.exam.entity.ClassOB;

import java.util.List;

public interface ClassOBDao {
    public boolean insert(ClassOB classOB);
    public boolean deleteClass(ClassOB classOB);
    public boolean deleteStudent(Student student,ClassOB classOB);
    public boolean updateClass(ClassOB classOB);
    public List<ClassOB> selectAll();
    public ClassOB selectClassByID(String classOBID);
}
