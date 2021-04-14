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
            "values (#{studentId,jdbcType=VARCHAR}, #{studentName,jdbcType=VARCHAR}, ",
            "#{studentPwd,jdbcType=VARCHAR}, #{studentAge,jdbcType=VARCHAR}, ",
            "#{studentSex,jdbcType=VARCHAR}, #{studentEmail,jdbcType=VARCHAR})"
    })
    int insert(Student record);

    @Select({
            "select",
            "studentId, studentName, studentPwd, studentAge, studentSex, studentEmail",
            "from student",
            "where studentId = #{studentid,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="studentId", property="studentId", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="studentName", property="studentName", jdbcType=JdbcType.VARCHAR),
            @Result(column="studentPwd", property="studentPwd", jdbcType=JdbcType.VARCHAR),
            @Result(column="studentAge", property="studentAge", jdbcType=JdbcType.VARCHAR),
            @Result(column="studentSex", property="studentSex", jdbcType=JdbcType.VARCHAR),
            @Result(column="studentEmail", property="studentEmail", jdbcType=JdbcType.VARCHAR)
    })
    Student selectByPrimaryKey(String studentid);

    @Select({
            "select",
            "studentId, studentName, studentPwd, studentAge, studentSex, studentEmail",
            "from student"
    })
    @Results({
            @Result(column="studentId", property="studentId", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="studentName", property="studentName", jdbcType=JdbcType.VARCHAR),
            @Result(column="studentPwd", property="studentPwd", jdbcType=JdbcType.VARCHAR),
            @Result(column="studentAge", property="studentAge", jdbcType=JdbcType.VARCHAR),
            @Result(column="studentSex", property="studentSex", jdbcType=JdbcType.VARCHAR),
            @Result(column="studentEmail", property="studentEmail", jdbcType=JdbcType.VARCHAR)
    })
    List<Student> selectAll();

    @Update({
            "update student",
            "set studentName = #{studentName,jdbcType=VARCHAR},",
            "studentPwd = #{studentPwd,jdbcType=VARCHAR},",
            "studentAge = #{studentAge,jdbcType=VARCHAR},",
            "studentSex = #{studentSex,jdbcType=VARCHAR},",
            "studentEmail = #{studentEmail,jdbcType=VARCHAR}",
            "where studentId = #{studentId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Student record);
}