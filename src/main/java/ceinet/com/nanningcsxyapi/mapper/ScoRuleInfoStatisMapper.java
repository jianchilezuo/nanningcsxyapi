package ceinet.com.nanningcsxyapi.mapper;

import ceinet.com.nanningcsxyapi.pojo.ScoRuleInfoStatis;

import java.util.List;

/**
* Created by Mybatis Generator 2019/02/27
*/
public interface ScoRuleInfoStatisMapper {
    int deleteByPrimaryKey(Integer fdid);

    int insert(ScoRuleInfoStatis record);

    int insertSelective(ScoRuleInfoStatis record);

    ScoRuleInfoStatis selectByPrimaryKey(Integer fdid);

    int updateByPrimaryKeySelective(ScoRuleInfoStatis record);

    int updateByPrimaryKey(ScoRuleInfoStatis record);

    List<ScoRuleInfoStatis> findListByStatisTime(String fdStatisTime);

    List<ScoRuleInfoStatis> findListByMaxStatisTime();
}