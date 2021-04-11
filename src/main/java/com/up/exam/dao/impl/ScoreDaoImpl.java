package com.up.exam.dao.impl;

import com.up.exam.dao.ScoreDao;
import com.up.exam.dao.dataobject.Score;
import com.up.exam.dao.mapper.ScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ScoreDaoImpl implements ScoreDao {

    @Autowired
    ScoreMapper scoreMapper;

    @Override
    public boolean insert(Score score) {
        return scoreMapper.insert(score)>0;
    }

    @Override
    public boolean delete(Score score) {
        return scoreMapper.deleteByPrimaryKey(score.getScoreId())>0;
    }

    @Override
    public boolean update(Score score) {
        return scoreMapper.updateByPrimaryKey(score)>0;
    }

    @Override
    public List<Score> selectAll() {
        return scoreMapper.selectAll();
    }

    @Override
    public Score selectByID(String scoreId) {
        return scoreMapper.selectByPrimaryKey(scoreId);
    }
}
