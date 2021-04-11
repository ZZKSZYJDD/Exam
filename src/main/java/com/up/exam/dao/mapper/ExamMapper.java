package com.up.exam.dao.mapper;

import java.util.List;

import com.up.exam.dao.dataobject.Exam;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface ExamMapper {
    @Delete({
        "delete from exam",
        "where examID = #{examid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String examid);

    @Insert({
        "insert into exam (examID, examTeacher, ",
        "examCourse, examName, ",
        "examStartTime, examEndTime, ",
        "examTime, examStatus, ",
        "examTestPaper)",
        "values (#{examid,jdbcType=VARCHAR}, #{examteacher,jdbcType=VARCHAR}, ",
        "#{examcourse,jdbcType=VARCHAR}, #{examname,jdbcType=VARCHAR}, ",
        "#{examstarttime,jdbcType=TIMESTAMP}, #{examendtime,jdbcType=TIMESTAMP}, ",
        "#{examtime,jdbcType=INTEGER}, #{examstatus,jdbcType=INTEGER}, ",
        "#{examtestpaper,jdbcType=VARCHAR})"
    })
    int insert(Exam record);

    @Select({
        "select",
        "examID, examTeacher, examCourse, examName, examStartTime, examEndTime, examTime, ",
        "examStatus, examTestPaper",
        "from exam",
        "where examID = #{examid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="examID", property="examid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="examTeacher", property="examteacher", jdbcType=JdbcType.VARCHAR),
        @Result(column="examCourse", property="examcourse", jdbcType=JdbcType.VARCHAR),
        @Result(column="examName", property="examname", jdbcType=JdbcType.VARCHAR),
        @Result(column="examStartTime", property="examstarttime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="examEndTime", property="examendtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="examTime", property="examtime", jdbcType=JdbcType.INTEGER),
        @Result(column="examStatus", property="examstatus", jdbcType=JdbcType.INTEGER),
        @Result(column="examTestPaper", property="examtestpaper", jdbcType=JdbcType.VARCHAR)
    })
    Exam selectByPrimaryKey(String examid);

    @Select({
        "select",
        "examID, examTeacher, examCourse, examName, examStartTime, examEndTime, examTime, ",
        "examStatus, examTestPaper",
        "from exam"
    })
    @Results({
        @Result(column="examID", property="examid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="examTeacher", property="examteacher", jdbcType=JdbcType.VARCHAR),
        @Result(column="examCourse", property="examcourse", jdbcType=JdbcType.VARCHAR),
        @Result(column="examName", property="examname", jdbcType=JdbcType.VARCHAR),
        @Result(column="examStartTime", property="examstarttime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="examEndTime", property="examendtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="examTime", property="examtime", jdbcType=JdbcType.INTEGER),
        @Result(column="examStatus", property="examstatus", jdbcType=JdbcType.INTEGER),
        @Result(column="examTestPaper", property="examtestpaper", jdbcType=JdbcType.VARCHAR)
    })
    List<Exam> selectAll();

    @Update({
        "update exam",
        "set examTeacher = #{examteacher,jdbcType=VARCHAR},",
          "examCourse = #{examcourse,jdbcType=VARCHAR},",
          "examName = #{examname,jdbcType=VARCHAR},",
          "examStartTime = #{examstarttime,jdbcType=TIMESTAMP},",
          "examEndTime = #{examendtime,jdbcType=TIMESTAMP},",
          "examTime = #{examtime,jdbcType=INTEGER},",
          "examStatus = #{examstatus,jdbcType=INTEGER},",
          "examTestPaper = #{examtestpaper,jdbcType=VARCHAR}",
        "where examID = #{examid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Exam record);
}