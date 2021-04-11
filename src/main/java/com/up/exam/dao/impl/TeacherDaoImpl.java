package com.up.exam.dao.impl;

import com.up.exam.dao.TeacherDao;
import com.up.exam.dao.dataobject.Teacher;
import com.up.exam.dao.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TeacherDaoImpl implements TeacherDao {
    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public boolean insert(Teacher teacher) {
        return teacherMapper.insert(teacher)>0;
    }

    @Override
    public boolean delete(Teacher teacher) {
        return teacherMapper.deleteByPrimaryKey(teacher.getTeacherId())>0;
    }

    @Override
    public boolean update(Teacher teacher) {
        return teacherMapper.updateByPrimaryKey(teacher)>0;
    }

    @Override
    public List<Teacher> selectAll() {
        return teacherMapper.selectAll();
    }

    @Override
    public Teacher selectByID(String teacherID) {
        return teacherMapper.selectByPrimaryKey(teacherID);
    }
}
