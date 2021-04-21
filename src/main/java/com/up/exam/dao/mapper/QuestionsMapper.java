package com.up.exam.dao.mapper;

import java.util.List;

import com.up.exam.dao.dataobject.Questions;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface QuestionsMapper {
    @Delete({
        "delete from questions",
        "where questionsID = #{questionsID,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String questionsID);

    @Insert({
        "insert into questions (questionsID, questionsType, ",
        "questionsStems, questionsOption, ",
        "questionsAnswer, questionsKnowledgePoint, ",
        "questionsDifficulty)",
        "values (#{questionsID,jdbcType=VARCHAR}, #{questionsType,jdbcType=VARCHAR}, ",
        "#{questionsStems,jdbcType=VARCHAR}, #{questionsOption,jdbcType=VARCHAR}, ",
        "#{questionsAnswer,jdbcType=VARCHAR}, #{questionsKnowledgePoint,jdbcType=VARCHAR}, ",
        "#{questionsDifficulty,jdbcType=INTEGER})"
    })
    int insert(Questions record);

    @Select({
        "select",
        "questionsID, questionsType, questionsStems, questionsOption, questionsAnswer, ",
        "questionsKnowledgePoint, questionsDifficulty",
        "from questions",
        "where questionsID = #{questionsID,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="questionsID", property="questionsID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="questionsType", property="questionsType", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionsStems", property="questionsStems", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionsOption", property="questionsOption", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionsAnswer", property="questionsAnswer", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionsKnowledgePoint", property="questionsKnowledgePoint", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionsDifficulty", property="questionsDifficulty", jdbcType=JdbcType.INTEGER)
    })
    Questions selectByPrimaryKey(String questionsID);

    @Select({
        "select",
        "questionsID, questionsType, questionsStems, questionsOption, questionsAnswer, ",
        "questionsKnowledgePoint, questionsDifficulty",
        "from questions"
    })
    @Results({
        @Result(column="questionsID", property="questionsID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="questionsType", property="questionsType", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionsStems", property="questionsStems", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionsOption", property="questionsOption", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionsAnswer", property="questionsAnswer", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionsKnowledgePoint", property="questionsKnowledgePoint", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionsDifficulty", property="questionsDifficulty", jdbcType=JdbcType.INTEGER)
    })
    List<Questions> selectAll();

    @Update({
        "update questions",
        "set questionsType = #{questionsType,jdbcType=VARCHAR},",
          "questionsStems = #{questionsStems,jdbcType=VARCHAR},",
          "questionsOption = #{questionsOption,jdbcType=VARCHAR},",
          "questionsAnswer = #{questionsAnswer,jdbcType=VARCHAR},",
          "questionsKnowledgePoint = #{questionsKnowledgePoint,jdbcType=VARCHAR},",
          "questionsDifficulty = #{questionsDifficulty,jdbcType=INTEGER}",
        "where questionsID = #{questionsID,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Questions record);
}