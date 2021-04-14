package com.up.exam.dao;

import com.up.exam.dao.dataobject.Questions;
import com.up.exam.dao.dataobject.Testpaper;

import java.util.List;

public interface TestpaperDao {
    public boolean insert(Testpaper testpaper);
    public boolean delete(Testpaper testpaper);
    public boolean update(Testpaper testpaper);
    public List<Testpaper> selectAll();
    public Testpaper selectByID(String testpaperId);
}
