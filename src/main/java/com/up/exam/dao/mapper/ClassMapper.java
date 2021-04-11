package com.up.exam.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import com.up.exam.dao.dataobject.Class;

@Mapper
public interface ClassMapper {
    @Delete({
        "delete from class",
        "where classID = #{classid,jdbcType=VARCHAR}",
          "and classStudent = #{classstudent,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(@Param("classid") String classid, @Param("classstudent") String classstudent);

    @Insert({
        "insert into class (classID, classStudent, ",
        "className)",
        "values (#{classid,jdbcType=VARCHAR}, #{classstudent,jdbcType=VARCHAR}, ",
        "#{classname,jdbcType=VARCHAR})"
    })
    int insert(com.up.exam.dao.dataobject.Class record);

    @Select({
        "select",
        "classID, classStudent, className",
        "from class",
        "where classID = #{classid,jdbcType=VARCHAR}",
          "and classStudent = #{classstudent,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="classID", property="classid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="classStudent", property="classstudent", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="className", property="classname", jdbcType=JdbcType.VARCHAR)
    })
    com.up.exam.dao.dataobject.Class selectByPrimaryKey(@Param("classid") String classid, @Param("classstudent") String classstudent);

    @Select({
        "select",
        "classID, classStudent, className",
        "from class"
    })
    @Results({
        @Result(column="classID", property="classid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="classStudent", property="classstudent", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="className", property="classname", jdbcType=JdbcType.VARCHAR)
    })
    List<com.up.exam.dao.dataobject.Class> selectAll();

    @Update({
        "update class",
        "set className = #{classname,jdbcType=VARCHAR}",
        "where classID = #{classid,jdbcType=VARCHAR}",
          "and classStudent = #{classstudent,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(com.up.exam.dao.dataobject.Class record);

    @Select({
            "select DISTINCT classID",
            "classID, className",
            "from class"
    })
    @Results({
            @Result(column="classID", property="classid", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="className", property="classname", jdbcType=JdbcType.VARCHAR)

    })
    List<Class> selectAllClass();

    @Select({
            "select",
            "classID, classStudent, className",
            "where classID = #{classid,jdbcType=VARCHAR}",
            "from class"
    })
    @Results({
            @Result(column="classStudent", property="classstudent", jdbcType=JdbcType.VARCHAR, id=true),
    })
    List<String> selectByClassIDOfStudentID(@Param("classid") String classid);

}