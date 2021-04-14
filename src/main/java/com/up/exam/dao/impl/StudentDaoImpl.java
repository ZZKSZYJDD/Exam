package com.up.exam.dao.impl;

import com.up.exam.dao.StudentDao;
import com.up.exam.dao.dataobject.Student;
import com.up.exam.dao.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentDaoImpl implements StudentDao {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public boolean insert(Student student) {
        return studentMapper.insert(student)>0;
    }

    @Override
    public boolean delete(Student student) {
        return studentMapper.deleteByPrimaryKey(student.getStudentId())>0;
    }

    @Override
    public boolean update(Student student) {
        return studentMapper.updateByPrimaryKey(student)>0;
    }

    @Override
    public List<Student> selectAll() {

        return studentMapper.selectAll();
    }

    @Override
    public Student selectByID(String studentID) {
        return studentMapper.selectByPrimaryKey(studentID);
    }


}
