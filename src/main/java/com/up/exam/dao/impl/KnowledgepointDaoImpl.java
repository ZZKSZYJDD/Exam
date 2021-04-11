package com.up.exam.dao.impl;

import com.up.exam.dao.KnowledgepointDao;
import com.up.exam.dao.dataobject.Knowledgepoint;
import com.up.exam.dao.mapper.KnowledgepointMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class KnowledgepointDaoImpl implements KnowledgepointDao {


    @Autowired
    KnowledgepointMapper knowledgepointMapper;



    @Override
    public boolean insert(Knowledgepoint knowledgepoint) {
        return knowledgepointMapper.insert(knowledgepoint)>0;
    }

    @Override
    public boolean delete(Knowledgepoint knowledgepoint) {
        return knowledgepointMapper.deleteByPrimaryKey(knowledgepoint.getKnowledgePointId())>0;
    }

    @Override
    public boolean update(Knowledgepoint knowledgepoint) {
        return knowledgepointMapper.updateByPrimaryKey(knowledgepoint)>0;
    }

    @Override
    public List<Knowledgepoint> selectAll() {
        return knowledgepointMapper.selectAll();
    }

    @Override
    public Knowledgepoint selectByID(String knowledgepointID) {
        return knowledgepointMapper.selectByPrimaryKey(knowledgepointID);
    }


}
