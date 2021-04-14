package com.up.exam.dao.impl;

import com.up.exam.dao.KnowledgePointDao;

import com.up.exam.dao.dataobject.KnowledgePoint;
import com.up.exam.dao.mapper.KnowledgePointIDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class KnowledgePointDaoImpl implements KnowledgePointDao {


    @Autowired
    KnowledgePointIDMapper KnowledgePointIDMapper;



    @Override
    public boolean insert(KnowledgePoint KnowledgePoint) {
        return KnowledgePointIDMapper.insert(KnowledgePoint)>0;
    }

    @Override
    public boolean delete(KnowledgePoint KnowledgePoint) {
        return KnowledgePointIDMapper.deleteByPrimaryKey(KnowledgePoint.getKnowledgePointID())>0;
    }

    @Override
    public boolean update(KnowledgePoint KnowledgePoint) {
        return KnowledgePointIDMapper.updateByPrimaryKey(KnowledgePoint)>0;
    }

    @Override
    public List<KnowledgePoint> selectAll() {
        return KnowledgePointIDMapper.selectAll();
    }

    @Override
    public KnowledgePoint selectByID(String KnowledgePointID) {
        return KnowledgePointIDMapper.selectByPrimaryKey(KnowledgePointID);
    }


}
