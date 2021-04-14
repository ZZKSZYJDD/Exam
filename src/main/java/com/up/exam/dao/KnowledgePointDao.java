package com.up.exam.dao;
import com.up.exam.dao.dataobject.KnowledgePoint;

import java.util.List;

public interface KnowledgePointDao {
    public boolean insert(KnowledgePoint KnowledgePoint);
    public boolean delete(KnowledgePoint KnowledgePoint);
    public boolean update(KnowledgePoint KnowledgePoint);
    public List<KnowledgePoint> selectAll();
    public KnowledgePoint selectByID(String KnowledgePointID);
}
