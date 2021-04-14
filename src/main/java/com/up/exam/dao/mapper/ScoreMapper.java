package com.up.exam.dao.mapper;

import java.util.List;

import com.up.exam.dao.dataobject.Score;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface ScoreMapper {
    @Delete({
        "delete from score",
        "where scoreID = #{scoreID,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String scoreID);

    @Insert({
        "insert into score (scoreID, scoreExam, ",
        "scoreStudents, score)",
        "values (#{scoreID,jdbcType=VARCHAR}, #{scoreExam,jdbcType=VARCHAR}, ",
        "#{scoreStudents,jdbcType=VARCHAR}, #{score,jdbcType=INTEGER})"
    })
    int insert(Score record);

    @Select({
        "select",
        "scoreID, scoreExam, scoreStudents, score",
        "from score",
        "where scoreID = #{scoreID,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="scoreID", property="scoreID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="scoreExam", property="scoreExam", jdbcType=JdbcType.VARCHAR),
        @Result(column="scoreStudents", property="scoreStudents", jdbcType=JdbcType.VARCHAR),
        @Result(column="score", property="score", jdbcType=JdbcType.INTEGER)
    })
    Score selectByPrimaryKey(String scoreID);

    @Select({
        "select",
        "scoreID, scoreExam, scoreStudents, score",
        "from score"
    })
    @Results({
        @Result(column="scoreID", property="scoreID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="scoreExam", property="scoreExam", jdbcType=JdbcType.VARCHAR),
        @Result(column="scoreStudents", property="scoreStudents", jdbcType=JdbcType.VARCHAR),
        @Result(column="score", property="score", jdbcType=JdbcType.INTEGER)
    })
    List<Score> selectAll();

    @Update({
        "update score",
        "set scoreExam = #{scoreExam,jdbcType=VARCHAR},",
          "scoreStudents = #{scoreStudents,jdbcType=VARCHAR},",
          "score = #{score,jdbcType=INTEGER}",
        "where scoreID = #{scoreID,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Score record);
}