package com.up.exam.dao.impl;

import com.up.exam.dao.QuestionsDao;
import com.up.exam.dao.dataobject.Questions;
import com.up.exam.dao.mapper.QuestionsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class QuestionsDaoImpl implements QuestionsDao {

    @Autowired
    QuestionsMapper questionsMapper;
    @Override
    public boolean insert(Questions questions) {
        return questionsMapper.insert(questions)>0;
    }

    @Override
    public boolean delete(Questions questions) {
        return questionsMapper.deleteByPrimaryKey(questions.getQuestionsId())>0;
    }

    @Override
    public boolean update(Questions questions) {
        return questionsMapper.updateByPrimaryKey(questions)>0;
    }

    @Override
    public List<Questions> selectAll() {
        return questionsMapper.selectAll();
    }

    @Override
    public Questions selectByID(String questionsID) {
        return questionsMapper.selectByPrimaryKey(questionsID);
    }
}
