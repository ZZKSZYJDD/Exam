package com.up.exam.dao.mapper;

import java.util.List;

import com.up.exam.dao.dataobject.Student;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface StudentMapper {
    @Delete({
            "delete from student",
            "where studentId = #{studentid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String studentid);

    @Insert({
            "insert into student (studentId, studentName, ",
            "studentPwd, studentAge, ",
            "studentSex, studentEmail)",
            "values (#{studentid,jdbcType=VARCHAR}, #{studentname,jdbcType=VARCHAR}, ",
            "#{studentpwd,jdbcType=VARCHAR}, #{studentage,jdbcType=VARCHAR}, ",
            "#{studentsex,jdbcType=VARCHAR}, #{studentemail,jdbcType=VARCHAR})"
    })
    int insert(Student record);

    @Select({
            "select",
            "studentId, studentName, studentPwd, studentAge, studentSex, studentEmail",
            "from student",
            "where studentId = #{studentid,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="studentId", property="studentid", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="studentName", property="studentname", jdbcType=JdbcType.VARCHAR),
            @Result(column="studentPwd", property="studentpwd", jdbcType=JdbcType.VARCHAR),
            @Result(column="studentAge", property="studentage", jdbcType=JdbcType.VARCHAR),
            @Result(column="studentSex", property="studentsex", jdbcType=JdbcType.VARCHAR),
            @Result(column="studentEmail", property="studentemail", jdbcType=JdbcType.VARCHAR)
    })
    Student selectByPrimaryKey(String studentid);

    @Select({
            "select",
            "studentId, studentName, studentPwd, studentAge, studentSex, studentEmail",
            "from student"
    })
    @Results({
            @Result(column="studentId", property="studentid", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="studentName", property="studentname", jdbcType=JdbcType.VARCHAR),
            @Result(column="studentPwd", property="studentpwd", jdbcType=JdbcType.VARCHAR),
            @Result(column="studentAge", property="studentage", jdbcType=JdbcType.VARCHAR),
            @Result(column="studentSex", property="studentsex", jdbcType=JdbcType.VARCHAR),
            @Result(column="studentEmail", property="studentemail", jdbcType=JdbcType.VARCHAR)
    })
    List<Student> selectAll();

    @Update({
            "update student",
            "set studentName = #{studentname,jdbcType=VARCHAR},",
            "studentPwd = #{studentpwd,jdbcType=VARCHAR},",
            "studentAge = #{studentage,jdbcType=VARCHAR},",
            "studentSex = #{studentsex,jdbcType=VARCHAR},",
            "studentEmail = #{studentemail,jdbcType=VARCHAR}",
            "where studentId = #{studentid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Student record);
}