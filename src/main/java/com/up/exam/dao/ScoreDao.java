package com.up.exam.dao;

import com.up.exam.dao.dataobject.Exam;
import com.up.exam.dao.dataobject.Score;

import java.util.List;

public interface ScoreDao {
    public boolean insert(Score score);
    public boolean delete(Score score);
    public boolean update(Score score);
    public List<Score> selectAll();
    public Score selectByID(String scoreId);
}
