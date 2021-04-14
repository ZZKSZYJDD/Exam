package com.up.exam.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import com.up.exam.dao.dataobject.Class;

@Mapper
public interface ClassMapper {
    @Delete({
        "delete from class",
        "where classId = #{classId,jdbcType=VARCHAR}",
          "and classStudent = #{classStudent,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(@Param("classId") String classId, @Param("classStudent") String classStudent);

    @Insert({
        "insert into class (classId, classStudent, ",
        "className)",
        "values (#{classId,jdbcType=VARCHAR}, #{classStudent,jdbcType=VARCHAR}, ",
        "#{className,jdbcType=VARCHAR})"
    })
    int insert(com.up.exam.dao.dataobject.Class record);

    @Select({
        "select",
        "classId, classStudent, className",
        "from class",
        "where classId = #{classId,jdbcType=VARCHAR}",
          "and classStudent = #{classStudent,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="classId", property="classId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="classStudent", property="classStudent", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="className", property="className", jdbcType=JdbcType.VARCHAR)
    })
    com.up.exam.dao.dataobject.Class selectByPrimaryKey(@Param("classId") String classId, @Param("classStudent") String classStudent);

    @Select({
        "select",
        "classId, classStudent, className",
        "from class"
    })
    @Results({
        @Result(column="classId", property="classId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="classStudent", property="classStudent", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="className", property="className", jdbcType=JdbcType.VARCHAR)
    })
    List<com.up.exam.dao.dataobject.Class> selectAll();

    @Update({
        "update class",
        "set className = #{className,jdbcType=VARCHAR}",
        "where classId = #{classId,jdbcType=VARCHAR}",
          "and classStudent = #{classStudent,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(com.up.exam.dao.dataobject.Class record);

    @Select({
            "select DISTINCT classId",
            "classId, className",
            "from class"
    })
    @Results({
            @Result(column="classId", property="classId", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="className", property="className", jdbcType=JdbcType.VARCHAR)

    })
    List<Class> selectAllClass();

    @Select({
            "select",
            "classId, classStudent, className",
            "where classId = #{classId,jdbcType=VARCHAR}",
            "from class"
    })
    @Results({
            @Result(column="classStudent", property="classStudent", jdbcType=JdbcType.VARCHAR, id=true),
    })
    List<String> selectByclassIdOfStudentID(@Param("classId") String classId);

}