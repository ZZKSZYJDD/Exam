package com.up.exam.dao.mapper;

import java.util.List;

import com.up.exam.dao.dataobject.Questions;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface QuestionsMapper {
    @Delete({
        "delete from questions",
        "where questionsID = #{questionsid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String questionsid);

    @Insert({
        "insert into questions (questionsID, questionsType, ",
        "questionsStems, questionsOption, ",
        "questionsAnswer, questionsKnowledgePoint, ",
        "questionsDifficulty)",
        "values (#{questionsid,jdbcType=VARCHAR}, #{questionstype,jdbcType=INTEGER}, ",
        "#{questionsstems,jdbcType=VARCHAR}, #{questionsoption,jdbcType=VARCHAR}, ",
        "#{questionsanswer,jdbcType=VARCHAR}, #{questionsknowledgepoint,jdbcType=VARCHAR}, ",
        "#{questionsdifficulty,jdbcType=INTEGER})"
    })
    int insert(Questions record);

    @Select({
        "select",
        "questionsID, questionsType, questionsStems, questionsOption, questionsAnswer, ",
        "questionsKnowledgePoint, questionsDifficulty",
        "from questions",
        "where questionsID = #{questionsid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="questionsID", property="questionsid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="questionsType", property="questionstype", jdbcType=JdbcType.INTEGER),
        @Result(column="questionsStems", property="questionsstems", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionsOption", property="questionsoption", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionsAnswer", property="questionsanswer", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionsKnowledgePoint", property="questionsknowledgepoint", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionsDifficulty", property="questionsdifficulty", jdbcType=JdbcType.INTEGER)
    })
    Questions selectByPrimaryKey(String questionsid);

    @Select({
        "select",
        "questionsID, questionsType, questionsStems, questionsOption, questionsAnswer, ",
        "questionsKnowledgePoint, questionsDifficulty",
        "from questions"
    })
    @Results({
        @Result(column="questionsID", property="questionsid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="questionsType", property="questionstype", jdbcType=JdbcType.INTEGER),
        @Result(column="questionsStems", property="questionsstems", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionsOption", property="questionsoption", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionsAnswer", property="questionsanswer", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionsKnowledgePoint", property="questionsknowledgepoint", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionsDifficulty", property="questionsdifficulty", jdbcType=JdbcType.INTEGER)
    })
    List<Questions> selectAll();

    @Update({
        "update questions",
        "set questionsType = #{questionstype,jdbcType=INTEGER},",
          "questionsStems = #{questionsstems,jdbcType=VARCHAR},",
          "questionsOption = #{questionsoption,jdbcType=VARCHAR},",
          "questionsAnswer = #{questionsanswer,jdbcType=VARCHAR},",
          "questionsKnowledgePoint = #{questionsknowledgepoint,jdbcType=VARCHAR},",
          "questionsDifficulty = #{questionsdifficulty,jdbcType=INTEGER}",
        "where questionsID = #{questionsid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Questions record);
}