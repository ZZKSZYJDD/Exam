package com.up.exam.dao.mapper;

import java.util.List;

import com.up.exam.dao.dataobject.Course;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface CourseMapper {
    @Delete({
        "delete from course",
        "where courseID = #{courseid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String courseid);

    @Insert({
        "insert into course (courseID, courseName, ",
        "courseTeacher, courseClass)",
        "values (#{courseid,jdbcType=VARCHAR}, #{coursename,jdbcType=VARCHAR}, ",
        "#{courseteacher,jdbcType=VARCHAR}, #{courseclass,jdbcType=VARCHAR})"
    })
    int insert(Course record);

    @Select({
        "select",
        "courseID, courseName, courseTeacher, courseClass",
        "from course",
        "where courseID = #{courseid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="courseID", property="courseid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="courseName", property="coursename", jdbcType=JdbcType.VARCHAR),
        @Result(column="courseTeacher", property="courseteacher", jdbcType=JdbcType.VARCHAR),
        @Result(column="courseClass", property="courseclass", jdbcType=JdbcType.VARCHAR)
    })
    Course selectByPrimaryKey(String courseid);

    @Select({
        "select",
        "courseID, courseName, courseTeacher, courseClass",
        "from course"
    })
    @Results({
        @Result(column="courseID", property="courseid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="courseName", property="coursename", jdbcType=JdbcType.VARCHAR),
        @Result(column="courseTeacher", property="courseteacher", jdbcType=JdbcType.VARCHAR),
        @Result(column="courseClass", property="courseclass", jdbcType=JdbcType.VARCHAR)
    })
    List<Course> selectAll();

    @Update({
        "update course",
        "set courseName = #{coursename,jdbcType=VARCHAR},",
          "courseTeacher = #{courseteacher,jdbcType=VARCHAR},",
          "courseClass = #{courseclass,jdbcType=VARCHAR}",
        "where courseID = #{courseid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Course record);
}