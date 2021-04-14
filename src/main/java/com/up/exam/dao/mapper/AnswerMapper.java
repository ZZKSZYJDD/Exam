package com.up.exam.dao.mapper;

import java.util.List;

import com.up.exam.dao.dataobject.Answer;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface AnswerMapper {
    @Delete({
        "delete from answer",
        "where answerStudent = #{answerStudent,jdbcType=VARCHAR}",
          "and answerQuestions = #{answerQuestions,jdbcType=VARCHAR}",
          "and answerExam = #{answerExam,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(@Param("answerStudent") String answerStudent, @Param("answerQuestions") String answerQuestions, @Param("answerExam") String answerExam);

    @Insert({
        "insert into answer (answerStudent, answerQuestions, ",
        "answerExam, answerQuestionsResult)",
        "values (#{answerStudent,jdbcType=VARCHAR}, #{answerQuestions,jdbcType=VARCHAR}, ",
        "#{answerExam,jdbcType=VARCHAR}, #{answerQuestionsResult,jdbcType=VARCHAR})"
    })
    int insert(Answer record);

    @Select({
        "select",
        "answerStudent, answerQuestions, answerExam, answerQuestionsResult",
        "from answer",
        "where answerStudent = #{answerStudent,jdbcType=VARCHAR}",
          "and answerQuestions = #{answerQuestions,jdbcType=VARCHAR}",
          "and answerExam = #{answerExam,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="answerStudent", property="answerStudent", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="answerQuestions", property="answerQuestions", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="answerExam", property="answerExam", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="answerQuestionsResult", property="answerQuestionsResult", jdbcType=JdbcType.VARCHAR)
    })
    Answer selectByPrimaryKey(@Param("answerStudent") String answerStudent, @Param("answerQuestions") String answerQuestions, @Param("answerExam") String answerExam);

    @Select({
        "select",
        "answerStudent, answerQuestions, answerExam, answerQuestionsResult",
        "from answer"
    })
    @Results({
        @Result(column="answerStudent", property="answerStudent", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="answerQuestions", property="answerQuestions", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="answerExam", property="answerExam", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="answerQuestionsResult", property="answerQuestionsResult", jdbcType=JdbcType.VARCHAR)
    })
    List<Answer> selectAll();

    @Update({
        "update answer",
        "set answerQuestionsResult = #{answerQuestionsResult,jdbcType=VARCHAR}",
        "where answerStudent = #{answerStudent,jdbcType=VARCHAR}",
          "and answerQuestions = #{answerQuestions,jdbcType=VARCHAR}",
          "and answerExam = #{answerExam,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Answer record);
}