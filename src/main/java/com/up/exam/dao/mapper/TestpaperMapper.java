package com.up.exam.dao.mapper;

import java.util.List;

import com.up.exam.dao.dataobject.Testpaper;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface TestpaperMapper {
    @Delete({
        "delete from testpaper",
        "where testPaperID = #{testpaperid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String testpaperid);

    @Insert({
        "insert into testpaper (testPaperID, testPaperName, ",
        "testPaperTeather, testPaperQuestion, ",
        "testPaperTotalPoints, testPaperCourse, ",
        "testPaperQuestionNumber, testPaperQuestionScore)",
        "values (#{testpaperid,jdbcType=VARCHAR}, #{testpapername,jdbcType=VARCHAR}, ",
        "#{testpaperteather,jdbcType=VARCHAR}, #{testpaperquestion,jdbcType=VARCHAR}, ",
        "#{testpapertotalpoints,jdbcType=INTEGER}, #{testpapercourse,jdbcType=VARCHAR}, ",
        "#{testpaperquestionnumber,jdbcType=VARCHAR}, #{testpaperquestionscore,jdbcType=VARCHAR})"
    })
    int insert(Testpaper record);

    @Select({
        "select",
        "testPaperID, testPaperName, testPaperTeather, testPaperQuestion, testPaperTotalPoints, ",
        "testPaperCourse, testPaperQuestionNumber, testPaperQuestionScore",
        "from testpaper",
        "where testPaperID = #{testpaperid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="testPaperID", property="testpaperid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="testPaperName", property="testpapername", jdbcType=JdbcType.VARCHAR),
        @Result(column="testPaperTeather", property="testpaperteather", jdbcType=JdbcType.VARCHAR),
        @Result(column="testPaperQuestion", property="testpaperquestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="testPaperTotalPoints", property="testpapertotalpoints", jdbcType=JdbcType.INTEGER),
        @Result(column="testPaperCourse", property="testpapercourse", jdbcType=JdbcType.VARCHAR),
        @Result(column="testPaperQuestionNumber", property="testpaperquestionnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="testPaperQuestionScore", property="testpaperquestionscore", jdbcType=JdbcType.VARCHAR)
    })
    Testpaper selectByPrimaryKey(String testpaperid);

    @Select({
        "select",
        "testPaperID, testPaperName, testPaperTeather, testPaperQuestion, testPaperTotalPoints, ",
        "testPaperCourse, testPaperQuestionNumber, testPaperQuestionScore",
        "from testpaper"
    })
    @Results({
        @Result(column="testPaperID", property="testpaperid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="testPaperName", property="testpapername", jdbcType=JdbcType.VARCHAR),
        @Result(column="testPaperTeather", property="testpaperteather", jdbcType=JdbcType.VARCHAR),
        @Result(column="testPaperQuestion", property="testpaperquestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="testPaperTotalPoints", property="testpapertotalpoints", jdbcType=JdbcType.INTEGER),
        @Result(column="testPaperCourse", property="testpapercourse", jdbcType=JdbcType.VARCHAR),
        @Result(column="testPaperQuestionNumber", property="testpaperquestionnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="testPaperQuestionScore", property="testpaperquestionscore", jdbcType=JdbcType.VARCHAR)
    })
    List<Testpaper> selectAll();

    @Update({
        "update testpaper",
        "set testPaperName = #{testpapername,jdbcType=VARCHAR},",
          "testPaperTeather = #{testpaperteather,jdbcType=VARCHAR},",
          "testPaperQuestion = #{testpaperquestion,jdbcType=VARCHAR},",
          "testPaperTotalPoints = #{testpapertotalpoints,jdbcType=INTEGER},",
          "testPaperCourse = #{testpapercourse,jdbcType=VARCHAR},",
          "testPaperQuestionNumber = #{testpaperquestionnumber,jdbcType=VARCHAR},",
          "testPaperQuestionScore = #{testpaperquestionscore,jdbcType=VARCHAR}",
        "where testPaperID = #{testpaperid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Testpaper record);
}