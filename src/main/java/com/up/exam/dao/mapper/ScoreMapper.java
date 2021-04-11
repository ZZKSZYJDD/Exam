package com.up.exam.dao.mapper;

import java.util.List;

import com.up.exam.dao.dataobject.Score;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface ScoreMapper {
    @Delete({
        "delete from score",
        "where scoreID = #{scoreid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String scoreid);

    @Insert({
        "insert into score (scoreID, scoreExam, ",
        "scoreStudents, score)",
        "values (#{scoreid,jdbcType=VARCHAR}, #{scoreexam,jdbcType=VARCHAR}, ",
        "#{scorestudents,jdbcType=VARCHAR}, #{score,jdbcType=INTEGER})"
    })
    int insert(Score record);

    @Select({
        "select",
        "scoreID, scoreExam, scoreStudents, score",
        "from score",
        "where scoreID = #{scoreid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="scoreID", property="scoreid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="scoreExam", property="scoreexam", jdbcType=JdbcType.VARCHAR),
        @Result(column="scoreStudents", property="scorestudents", jdbcType=JdbcType.VARCHAR),
        @Result(column="score", property="score", jdbcType=JdbcType.INTEGER)
    })
    Score selectByPrimaryKey(String scoreid);

    @Select({
        "select",
        "scoreID, scoreExam, scoreStudents, score",
        "from score"
    })
    @Results({
        @Result(column="scoreID", property="scoreid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="scoreExam", property="scoreexam", jdbcType=JdbcType.VARCHAR),
        @Result(column="scoreStudents", property="scorestudents", jdbcType=JdbcType.VARCHAR),
        @Result(column="score", property="score", jdbcType=JdbcType.INTEGER)
    })
    List<Score> selectAll();

    @Update({
        "update score",
        "set scoreExam = #{scoreexam,jdbcType=VARCHAR},",
          "scoreStudents = #{scorestudents,jdbcType=VARCHAR},",
          "score = #{score,jdbcType=INTEGER}",
        "where scoreID = #{scoreid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Score record);
}