package com.up.exam.dao.mapper;

import java.util.List;

import com.up.exam.dao.dataobject.Teacher;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface TeacherMapper {
    @Delete({
            "delete from teacher",
            "where teacherId = #{teacherid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String teacherid);

    @Insert({
            "insert into teacher (teacherId, teacherName, ",
            "teacherSex, teacherPwd, ",
            "teacherEmail)",
            "values (#{teacherid,jdbcType=VARCHAR}, #{teachername,jdbcType=VARCHAR}, ",
            "#{teachersex,jdbcType=VARCHAR}, #{teacherpwd,jdbcType=VARCHAR}, ",
            "#{teacheremail,jdbcType=VARCHAR})"
    })
    int insert(Teacher record);

    @Select({
            "select",
            "teacherId, teacherName, teacherSex, teacherPwd, teacherEmail",
            "from teacher",
            "where teacherId = #{teacherid,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="teacherId", property="teacherid", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="teacherName", property="teachername", jdbcType=JdbcType.VARCHAR),
            @Result(column="teacherSex", property="teachersex", jdbcType=JdbcType.VARCHAR),
            @Result(column="teacherPwd", property="teacherpwd", jdbcType=JdbcType.VARCHAR),
            @Result(column="teacherEmail", property="teacheremail", jdbcType=JdbcType.VARCHAR)
    })
    Teacher selectByPrimaryKey(String teacherid);

    @Select({
            "select",
            "teacherId, teacherName, teacherSex, teacherPwd, teacherEmail",
            "from teacher"
    })
    @Results({
            @Result(column="teacherId", property="teacherid", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="teacherName", property="teachername", jdbcType=JdbcType.VARCHAR),
            @Result(column="teacherSex", property="teachersex", jdbcType=JdbcType.VARCHAR),
            @Result(column="teacherPwd", property="teacherpwd", jdbcType=JdbcType.VARCHAR),
            @Result(column="teacherEmail", property="teacheremail", jdbcType=JdbcType.VARCHAR)
    })
    List<Teacher> selectAll();

    @Update({
            "update teacher",
            "set teacherName = #{teachername,jdbcType=VARCHAR},",
            "teacherSex = #{teachersex,jdbcType=VARCHAR},",
            "teacherPwd = #{teacherpwd,jdbcType=VARCHAR},",
            "teacherEmail = #{teacheremail,jdbcType=VARCHAR}",
            "where teacherId = #{teacherid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Teacher record);

}