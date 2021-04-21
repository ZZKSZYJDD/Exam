package com.up.exam.dao.mapper;

import java.util.List;

import com.up.exam.dao.dataobject.Testpaper;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface TestpaperMapper {
    @Delete({
        "delete from testpaper",
        "where testpaperId = #{testpaperId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String testpaperId);

    @Insert({
        "insert into testpaper (testpaperId, testpaperName, ",
        "testpaperTeather, testpaperQuestion, ",
        "testpaperTotalPoints, testpaperCourse, ",
        "testpaperQuestionNumber, testpaperQuestionScore)",
        "values (#{testpaperId,jdbcType=VARCHAR}, #{testpaperName,jdbcType=VARCHAR}, ",
        "#{testpaperTeather,jdbcType=VARCHAR}, #{testpaperQuestion,jdbcType=VARCHAR}, ",
        "#{testpaperTotalPoints,jdbcType=INTEGER}, #{testpaperCourse,jdbcType=VARCHAR}, ",
        "#{testpaperQuestionNumber,jdbcType=VARCHAR}, #{testpaperQuestionScore,jdbcType=VARCHAR})"
    })
    int insert(Testpaper record);

    @Select({
        "select",
        "testpaperId, testpaperName, testpaperTeather, testpaperQuestion, testpaperTotalPoints, ",
        "testpaperCourse, testpaperQuestionNumber, testpaperQuestionScore",
        "from testpaper",
        "where testpaperId = #{testpaperId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="testpaperId", property="testpaperId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="testpaperName", property="testpaperName", jdbcType=JdbcType.VARCHAR),
        @Result(column="testpaperTeather", property="testpaperTeather", jdbcType=JdbcType.VARCHAR),
        @Result(column="testpaperQuestion", property="testpaperQuestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="testpaperTotalPoints", property="testpaperTotalPoints", jdbcType=JdbcType.INTEGER),
        @Result(column="testpaperCourse", property="testpaperCourse", jdbcType=JdbcType.VARCHAR),
        @Result(column="testpaperQuestionNumber", property="testpaperQuestionNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="testpaperQuestionScore", property="testpaperQuestionScore", jdbcType=JdbcType.VARCHAR)
    })
    Testpaper selectByPrimaryKey(String testpaperId);

    @Select({
        "select",
        "testpaperId, testpaperName, testpaperTeather, testpaperQuestion, testpaperTotalPoints, ",
        "testpaperCourse, testpaperQuestionNumber, testpaperQuestionScore",
        "from testpaper"
    })
    @Results({
        @Result(column="testpaperId", property="testpaperId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="testpaperName", property="testpaperName", jdbcType=JdbcType.VARCHAR),
        @Result(column="testpaperTeather", property="testpaperTeather", jdbcType=JdbcType.VARCHAR),
        @Result(column="testpaperQuestion", property="testpaperQuestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="testpaperTotalPoints", property="testpaperTotalPoints", jdbcType=JdbcType.INTEGER),
        @Result(column="testpaperCourse", property="testpaperCourse", jdbcType=JdbcType.VARCHAR),
        @Result(column="testpaperQuestionNumber", property="testpaperQuestionNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="testpaperQuestionScore", property="testpaperQuestionScore", jdbcType=JdbcType.VARCHAR)
    })
    List<Testpaper> selectAll();

    @Update({
        "update testpaper",
        "set testpaperName = #{testpaperName,jdbcType=VARCHAR},",
          "testpaperTeather = #{testpaperTeather,jdbcType=VARCHAR},",
          "testpaperQuestion = #{testpaperQuestion,jdbcType=VARCHAR},",
          "testpaperTotalPoints = #{testpaperTotalPoints,jdbcType=INTEGER},",
          "testpaperCourse = #{testpaperCourse,jdbcType=VARCHAR},",
          "testpaperQuestionNumber = #{testpaperQuestionNumber,jdbcType=VARCHAR},",
          "testpaperQuestionScore = #{testpaperQuestionScore,jdbcType=VARCHAR}",
        "where testpaperId = #{testpaperId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Testpaper record);
}