package com.up.exam.dao.mapper;

import java.util.List;

import com.up.exam.dao.dataobject.Teacher;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface TeacherMapper {
    @Delete({
            "delete from teacher",
            "where teacherId = #{teacherId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String teacherId);

    @Insert({
            "insert into teacher (teacherId, teacherName, ",
            "teacherSex, teacherPwd, ",
            "teacherEmail)",
            "values (#{teacherId,jdbcType=VARCHAR}, #{teacherName,jdbcType=VARCHAR}, ",
            "#{teacherSex,jdbcType=VARCHAR}, #{teacherPwd,jdbcType=VARCHAR}, ",
            "#{teacherEmail,jdbcType=VARCHAR})"
    })
    int insert(Teacher record);

    @Select({
            "select",
            "teacherId, teacherName, teacherSex, teacherPwd, teacherEmail",
            "from teacher",
            "where teacherId = #{teacherId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="teacherId", property="teacherId", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="teacherName", property="teacherName", jdbcType=JdbcType.VARCHAR),
            @Result(column="teacherSex", property="teacherSex", jdbcType=JdbcType.VARCHAR),
            @Result(column="teacherPwd", property="teacherPwd", jdbcType=JdbcType.VARCHAR),
            @Result(column="teacherEmail", property="teacherEmail", jdbcType=JdbcType.VARCHAR)
    })
    Teacher selectByPrimaryKey(String teacherId);

    @Select({
            "select",
            "teacherId, teacherName, teacherSex, teacherPwd, teacherEmail",
            "from teacher"
    })
    @Results({
            @Result(column="teacherId", property="teacherId", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="teacherName", property="teacherName", jdbcType=JdbcType.VARCHAR),
            @Result(column="teacherSex", property="teacherSex", jdbcType=JdbcType.VARCHAR),
            @Result(column="teacherPwd", property="teacherPwd", jdbcType=JdbcType.VARCHAR),
            @Result(column="teacherEmail", property="teacherEmail", jdbcType=JdbcType.VARCHAR)
    })
    List<Teacher> selectAll();

    @Update({
            "update teacher",
            "set teacherName = #{teacherName,jdbcType=VARCHAR},",
            "teacherSex = #{teacherSex,jdbcType=VARCHAR},",
            "teacherPwd = #{teacherPwd,jdbcType=VARCHAR},",
            "teacherEmail = #{teacherEmail,jdbcType=VARCHAR}",
            "where teacherId = #{teacherId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Teacher record);

}