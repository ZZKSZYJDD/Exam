package com.up.exam.dao.impl;

import com.up.exam.dao.ClassDao;
import com.up.exam.dao.ClassOBDao;
import com.up.exam.dao.dataobject.Class;
import com.up.exam.dao.dataobject.Student;
import com.up.exam.dao.mapper.ClassMapper;
import com.up.exam.entity.ClassOB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Repository
public class ClassDaoImpl implements ClassDao {


    @Autowired
    ClassMapper classMapper;



    @Override
    public boolean insert(Class cla) {
        return classMapper.insert(cla)>0;
    }

    @Override
    public boolean delete(Class cla) {
        return classMapper.deleteByPrimaryKey(cla.getClassId(),cla.getClassStudent())>0;
    }

    @Override
    public boolean update(Class cla) {
        return classMapper.updateByPrimaryKey(cla)>0;
    }

    @Override
    public List<Class> selectAll() {
        return classMapper.selectAll();
    }

    @Override
    public Class selectClassByID(String classID,String stuID) {
        return classMapper.selectByPrimaryKey(classID,stuID);
    }


}
