package com.up.exam.dao;


import com.up.exam.dao.dataobject.Questions;

import java.util.List;

public interface QuestionsDao {
    public boolean insert(Questions questions);
    public boolean delete(Questions questions);
    public boolean update(Questions questions);
    public List<Questions> selectAll();
    public Questions selectByID(String questionsID);
}
