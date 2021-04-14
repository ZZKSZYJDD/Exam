package com.up.exam.dao.impl;

import com.up.exam.dao.TestpaperDao;
import com.up.exam.dao.dataobject.Testpaper;
import com.up.exam.dao.mapper.TeacherMapper;
import com.up.exam.dao.mapper.TestpaperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestpaperDaoImpl implements TestpaperDao {
    @Autowired
    TestpaperMapper testpaperMapper;
    @Override
    public boolean insert(Testpaper testpaper) {
        return testpaperMapper.insert(testpaper)>0;
    }

    @Override
    public boolean delete(Testpaper testpaper) {
        return testpaperMapper.deleteByPrimaryKey(testpaper.gettestpaperId())>0;
    }

    @Override
    public boolean update(Testpaper testpaper) {
        return testpaperMapper.updateByPrimaryKey(testpaper)>0;
    }

    @Override
    public List<Testpaper> selectAll() {
        return testpaperMapper.selectAll();
    }

    @Override
    public Testpaper selectByID(String testpaperId) {
        return testpaperMapper.selectByPrimaryKey(testpaperId);
    }
}
