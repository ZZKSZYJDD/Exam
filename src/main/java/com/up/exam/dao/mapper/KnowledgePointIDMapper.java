package com.up.exam.dao.mapper;

import java.util.List;

import com.up.exam.dao.dataobject.KnowledgePoint;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface KnowledgePointIDMapper {
    @Delete({
        "delete from KnowledgePointID",
        "where KnowledgePointIDID = #{KnowledgePointIDID,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String KnowledgePointIDID);

    @Insert({
        "insert into KnowledgePointID (KnowledgePointIDID, KnowledgePointIDName, ",
        "KnowledgePointIDCourse)",
        "values (#{KnowledgePointIDID,jdbcType=VARCHAR}, #{KnowledgePointIDName,jdbcType=VARCHAR}, ",
        "#{KnowledgePointIDCourse,jdbcType=VARCHAR})"
    })
    int insert(KnowledgePoint record);

    @Select({
        "select",
        "KnowledgePointIDID, KnowledgePointIDName, KnowledgePointIDCourse",
        "from KnowledgePointID",
        "where KnowledgePointIDID = #{KnowledgePointIDID,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="KnowledgePointIDID", property="KnowledgePointIDID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="KnowledgePointIDName", property="KnowledgePointIDName", jdbcType=JdbcType.VARCHAR),
        @Result(column="KnowledgePointIDCourse", property="KnowledgePointIDCourse", jdbcType=JdbcType.VARCHAR)
    })
    KnowledgePoint selectByPrimaryKey(String KnowledgePointIDID);

    @Select({
        "select",
        "KnowledgePointIDID, KnowledgePointIDName, KnowledgePointIDCourse",
        "from KnowledgePointID"
    })
    @Results({
        @Result(column="KnowledgePointIDID", property="KnowledgePointIDID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="KnowledgePointIDName", property="KnowledgePointIDName", jdbcType=JdbcType.VARCHAR),
        @Result(column="KnowledgePointIDCourse", property="KnowledgePointIDCourse", jdbcType=JdbcType.VARCHAR)
    })
    List<KnowledgePoint> selectAll();

    @Update({
        "update KnowledgePointID",
        "set KnowledgePointIDName = #{KnowledgePointIDName,jdbcType=VARCHAR},",
          "KnowledgePointIDCourse = #{KnowledgePointIDCourse,jdbcType=VARCHAR}",
        "where KnowledgePointIDID = #{KnowledgePointIDID,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(KnowledgePoint record);
}