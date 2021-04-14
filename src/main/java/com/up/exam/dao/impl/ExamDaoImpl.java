package com.up.exam.dao.impl;

import com.up.exam.dao.ExamDao;
import com.up.exam.dao.dataobject.Exam;
import com.up.exam.dao.mapper.ExamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamDaoImpl implements ExamDao {

    @Autowired
    ExamMapper examMapper;

    @Override
    public boolean insert(Exam exam) {
        return examMapper.insert(exam)>0;
    }

    @Override
    public boolean delete(Exam exam) {
        return examMapper.deleteByPrimaryKey(exam.getexamId())>0;
    }

    @Override
    public boolean update(Exam exam) {
        return examMapper.updateByPrimaryKey(exam)>0;
    }

    @Override
    public List<Exam> selectAll() {
        return examMapper.selectAll();
    }

    @Override
    public Exam selectByID(String examId) {
        return examMapper.selectByPrimaryKey(examId);
    }
}
