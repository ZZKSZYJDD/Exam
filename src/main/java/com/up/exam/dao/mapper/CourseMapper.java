package com.up.exam.dao.mapper;

import java.util.List;

import com.up.exam.dao.dataobject.Course;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface CourseMapper {
    @Delete({
        "delete from course",
        "where courseId = #{courseId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String courseId);

    @Insert({
        "insert into course (courseId, courseName, ",
        "courseTeacher, courseClass,courseImgURL)",
        "values (#{courseId,jdbcType=VARCHAR}, #{courseName,jdbcType=VARCHAR}, ",
        "#{courseTeacher,jdbcType=VARCHAR}, #{courseClass,jdbcType=VARCHAR},#{courseImgURL,jdbcType=VARCHAR})"
    })
    int insert(Course record);

    @Select({
        "select",
        "courseId, courseName, courseTeacher, courseClass,courseImgURL",
        "from course",
        "where courseId = #{courseId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="courseId", property="courseId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="courseName", property="courseName", jdbcType=JdbcType.VARCHAR),
        @Result(column="courseTeacher", property="courseTeacher", jdbcType=JdbcType.VARCHAR),
        @Result(column="courseClass", property="courseClass", jdbcType=JdbcType.VARCHAR),
            @Result(column="courseImgURL", property="courseImgURL", jdbcType=JdbcType.VARCHAR)
    })
    Course selectByPrimaryKey(String courseId);

    @Select({
        "select",
        "courseId, courseName, courseTeacher, courseClass,courseImgURL",
        "from course"
    })
    @Results({
        @Result(column="courseId", property="courseId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="courseName", property="courseName", jdbcType=JdbcType.VARCHAR),
        @Result(column="courseTeacher", property="courseTeacher", jdbcType=JdbcType.VARCHAR),
        @Result(column="courseClass", property="courseClass", jdbcType=JdbcType.VARCHAR),
            @Result(column="courseImgURL", property="courseImgURL", jdbcType=JdbcType.VARCHAR)
    })
    List<Course> selectAll();

    @Update({
        "update course",
        "set courseName = #{courseName,jdbcType=VARCHAR},",
          "courseTeacher = #{courseTeacher,jdbcType=VARCHAR},",
            "courseClass = #{courseClass,jdbcType=VARCHAR}",
            "courseImgURL = #{courseImgURL,jdbcType=VARCHAR}",
        "where courseId = #{courseId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Course record);

    @Select({
            "select",
            "courseId, courseName, courseTeacher, courseClass,className,courseImgURL",
            "from course left join class on course.courseClass=class.classId",
            "where courseClass = #{classId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="courseId", property="courseId", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="courseName", property="courseName", jdbcType=JdbcType.VARCHAR),
            @Result(column="courseTeacher", property="courseTeacher", jdbcType=JdbcType.VARCHAR),
            @Result(column="className", property="courseClass", jdbcType=JdbcType.VARCHAR),
            @Result(column="courseImgURL", property="courseImgURL", jdbcType=JdbcType.VARCHAR)
    })
    List<Course> selectByClassID(String classId);
}