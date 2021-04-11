package com.up.exam.dao.mapper;

import java.util.List;

import com.up.exam.dao.dataobject.Knowledgepoint;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface KnowledgepointMapper {
    @Delete({
        "delete from knowledgepoint",
        "where knowledgePointID = #{knowledgepointid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String knowledgepointid);

    @Insert({
        "insert into knowledgepoint (knowledgePointID, knowledgePointName, ",
        "knowledgePointCourse)",
        "values (#{knowledgepointid,jdbcType=VARCHAR}, #{knowledgepointname,jdbcType=VARCHAR}, ",
        "#{knowledgepointcourse,jdbcType=VARCHAR})"
    })
    int insert(Knowledgepoint record);

    @Select({
        "select",
        "knowledgePointID, knowledgePointName, knowledgePointCourse",
        "from knowledgepoint",
        "where knowledgePointID = #{knowledgepointid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="knowledgePointID", property="knowledgepointid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="knowledgePointName", property="knowledgepointname", jdbcType=JdbcType.VARCHAR),
        @Result(column="knowledgePointCourse", property="knowledgepointcourse", jdbcType=JdbcType.VARCHAR)
    })
    Knowledgepoint selectByPrimaryKey(String knowledgepointid);

    @Select({
        "select",
        "knowledgePointID, knowledgePointName, knowledgePointCourse",
        "from knowledgepoint"
    })
    @Results({
        @Result(column="knowledgePointID", property="knowledgepointid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="knowledgePointName", property="knowledgepointname", jdbcType=JdbcType.VARCHAR),
        @Result(column="knowledgePointCourse", property="knowledgepointcourse", jdbcType=JdbcType.VARCHAR)
    })
    List<Knowledgepoint> selectAll();

    @Update({
        "update knowledgepoint",
        "set knowledgePointName = #{knowledgepointname,jdbcType=VARCHAR},",
          "knowledgePointCourse = #{knowledgepointcourse,jdbcType=VARCHAR}",
        "where knowledgePointID = #{knowledgepointid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Knowledgepoint record);
}