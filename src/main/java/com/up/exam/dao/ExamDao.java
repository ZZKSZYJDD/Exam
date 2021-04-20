package com.up.exam.dao;

import com.up.exam.dao.dataobject.Exam;

import java.util.List;

public interface ExamDao {
    public boolean insert(Exam exam);
    public boolean delete(Exam exam);
    public boolean update(Exam exam);
    public List<Exam> selectAll();
    public Exam selectByID(String examId);

    List<Exam> selectByCourseID(String courseId);
}
