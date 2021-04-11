package com.up.exam.dao;
import com.up.exam.dao.dataobject.Knowledgepoint;

import java.util.List;

public interface KnowledgepointDao {
    public boolean insert(Knowledgepoint knowledgepoint);
    public boolean delete(Knowledgepoint knowledgepoint);
    public boolean update(Knowledgepoint knowledgepoint);
    public List<Knowledgepoint> selectAll();
    public Knowledgepoint selectByID(String knowledgepointID);
}
