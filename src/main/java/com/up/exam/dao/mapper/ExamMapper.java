package com.up.exam.dao.mapper;

import java.util.List;

import com.up.exam.dao.dataobject.Exam;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface ExamMapper {
    @Delete({
        "delete from exam",
        "where examId = #{examId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String examId);

    @Insert({
        "insert into exam (examId, examTeacher, ",
        "examCourse, examName, ",
        "examStarsTime, examEndTime, ",
        "examTime, examStatus, ",
        "examTestPaper)",
        "values (#{examId,jdbcType=VARCHAR}, #{examTeacher,jdbcType=VARCHAR}, ",
        "#{examCourse,jdbcType=VARCHAR}, #{examName,jdbcType=VARCHAR}, ",
        "#{examStarsTime,jdbcType=TIMESTAMP}, #{examEndTime,jdbcType=TIMESTAMP}, ",
        "#{examTime,jdbcType=INTEGER}, #{examStatus,jdbcType=INTEGER}, ",
        "#{examTestPaper,jdbcType=VARCHAR})"
    })
    int insert(Exam record);

    @Select({
        "select",
        "examId, examTeacher, examCourse, examName, examStarsTime, examEndTime, examTime, ",
        "examStatus, examTestPaper",
        "from exam",
        "where examId = #{examId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="examId", property="examId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="examTeacher", property="examTeacher", jdbcType=JdbcType.VARCHAR),
        @Result(column="examCourse", property="examCourse", jdbcType=JdbcType.VARCHAR),
        @Result(column="examName", property="examName", jdbcType=JdbcType.VARCHAR),
        @Result(column="examStarsTime", property="examStarsTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="examEndTime", property="examEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="examTime", property="examTime", jdbcType=JdbcType.INTEGER),
        @Result(column="examStatus", property="examStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="examTestPaper", property="examTestPaper", jdbcType=JdbcType.VARCHAR)
    })
    Exam selectByPrimaryKey(String examId);

    @Select({
        "select",
        "examId, examTeacher, examCourse, examName, examStarsTime, examEndTime, examTime, ",
        "examStatus, examTestPaper",
        "from exam"
    })
    @Results({
        @Result(column="examId", property="examId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="examTeacher", property="examTeacher", jdbcType=JdbcType.VARCHAR),
        @Result(column="examCourse", property="examCourse", jdbcType=JdbcType.VARCHAR),
        @Result(column="examName", property="examName", jdbcType=JdbcType.VARCHAR),
        @Result(column="examStarsTime", property="examStarsTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="examEndTime", property="examEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="examTime", property="examTime", jdbcType=JdbcType.INTEGER),
        @Result(column="examStatus", property="examStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="examTestPaper", property="examTestPaper", jdbcType=JdbcType.VARCHAR)
    })
    List<Exam> selectAll();

    @Update({
        "update exam",
        "set examTeacher = #{examTeacher,jdbcType=VARCHAR},",
          "examCourse = #{examCourse,jdbcType=VARCHAR},",
          "examName = #{examName,jdbcType=VARCHAR},",
          "examStarsTime = #{examStarsTime,jdbcType=TIMESTAMP},",
          "examEndTime = #{examEndTime,jdbcType=TIMESTAMP},",
          "examTime = #{examTime,jdbcType=INTEGER},",
          "examStatus = #{examStatus,jdbcType=INTEGER},",
          "examTestPaper = #{examTestPaper,jdbcType=VARCHAR}",
        "where examId = #{examId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Exam record);
}