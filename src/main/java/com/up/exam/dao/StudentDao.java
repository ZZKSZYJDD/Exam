package com.up.exam.dao;
import com.up.exam.dao.dataobject.Student;
import java.util.List;


public interface StudentDao {
    public boolean insert(Student student);
    public boolean delete(Student student);
    public boolean update(Student student);
    public List<Student> selectAll();
    public Student selectByID(String studentID);

}
