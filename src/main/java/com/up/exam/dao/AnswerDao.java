package com.up.exam.dao;

import com.up.exam.dao.dataobject.Answer;
import com.up.exam.entity.AnswerOB;

import java.util.List;

public interface AnswerDao {
    public boolean insert(Answer answer);
    public boolean delete(Answer answer);
    public boolean update(Answer answer);
    public List<Answer> selectAll();
    public Answer selectByID(String answerstudentID,String answerquestionsID,String answerexamId);
}
