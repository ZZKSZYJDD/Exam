package com.up.exam.dao.impl;

import com.up.exam.dao.AnswerDao;
import com.up.exam.dao.dataobject.Answer;
import com.up.exam.dao.mapper.AnswerMapper;
import com.up.exam.entity.AnswerOB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnswerDaoImpl implements AnswerDao {


    @Autowired
    AnswerMapper answerMapper;


    @Override
    public boolean insert(Answer answer) {
        return answerMapper.insert(answer)>0;
    }

    @Override
    public boolean delete(Answer answer) {
        return answerMapper.deleteByPrimaryKey(answer.getAnswerStudent(),answer.getAnswerQuestions(),answer.getAnswerExam())>0;
    }

    @Override
    public boolean update(Answer answer) {
        return answerMapper.updateByPrimaryKey(answer)>0;
    }

    @Override
    public List<Answer> selectAll() {
        return answerMapper.selectAll();
    }

    @Override
    public Answer selectByID(String answerstudentID,String answerquestionsID,String answerexamId) {
        return answerMapper.selectByPrimaryKey(answerstudentID,answerquestionsID,answerexamId);
    }
}
