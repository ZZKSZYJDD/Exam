package com.up.exam.dao.mapper;

import java.util.List;

import com.up.exam.dao.dataobject.Answer;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface AnswerMapper {
    @Delete({
        "delete from answer",
        "where answerStudent = #{answerstudent,jdbcType=VARCHAR}",
          "and answerQuestions = #{answerquestions,jdbcType=VARCHAR}",
          "and answerExam = #{answerexam,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(@Param("answerstudent") String answerstudent, @Param("answerquestions") String answerquestions, @Param("answerexam") String answerexam);

    @Insert({
        "insert into answer (answerStudent, answerQuestions, ",
        "answerExam, answerQuestionsResult)",
        "values (#{answerstudent,jdbcType=VARCHAR}, #{answerquestions,jdbcType=VARCHAR}, ",
        "#{answerexam,jdbcType=VARCHAR}, #{answerquestionsresult,jdbcType=VARCHAR})"
    })
    int insert(Answer record);

    @Select({
        "select",
        "answerStudent, answerQuestions, answerExam, answerQuestionsResult",
        "from answer",
        "where answerStudent = #{answerstudent,jdbcType=VARCHAR}",
          "and answerQuestions = #{answerquestions,jdbcType=VARCHAR}",
          "and answerExam = #{answerexam,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="answerStudent", property="answerstudent", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="answerQuestions", property="answerquestions", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="answerExam", property="answerexam", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="answerQuestionsResult", property="answerquestionsresult", jdbcType=JdbcType.VARCHAR)
    })
    Answer selectByPrimaryKey(@Param("answerstudent") String answerstudent, @Param("answerquestions") String answerquestions, @Param("answerexam") String answerexam);

    @Select({
        "select",
        "answerStudent, answerQuestions, answerExam, answerQuestionsResult",
        "from answer"
    })
    @Results({
        @Result(column="answerStudent", property="answerstudent", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="answerQuestions", property="answerquestions", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="answerExam", property="answerexam", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="answerQuestionsResult", property="answerquestionsresult", jdbcType=JdbcType.VARCHAR)
    })
    List<Answer> selectAll();

    @Update({
        "update answer",
        "set answerQuestionsResult = #{answerquestionsresult,jdbcType=VARCHAR}",
        "where answerStudent = #{answerstudent,jdbcType=VARCHAR}",
          "and answerQuestions = #{answerquestions,jdbcType=VARCHAR}",
          "and answerExam = #{answerexam,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Answer record);
}