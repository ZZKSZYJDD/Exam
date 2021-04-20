package com.up.exam.dao;


import com.up.exam.dao.dataobject.Class;
import com.up.exam.dao.dataobject.Student;
import com.up.exam.entity.ClassOB;

import java.util.List;

public interface ClassDao {
    public boolean insert(Class cla);
    public boolean delete(Class cla);

    public boolean update(Class cla);
    public List<Class> selectAll();
    public Class selectClassByID(String classId,String stuID);

    public List<Class> selectClassByStudentID(String studentId);
}
