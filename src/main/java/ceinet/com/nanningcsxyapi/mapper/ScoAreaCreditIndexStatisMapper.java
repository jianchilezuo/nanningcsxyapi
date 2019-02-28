package ceinet.com.nanningcsxyapi.mapper;

import ceinet.com.nanningcsxyapi.pojo.ScoAreaCreditIndexStatis;

import java.util.List;

/**
* Created by Mybatis Generator 2019/02/27
*/
public interface ScoAreaCreditIndexStatisMapper {
    int deleteByPrimaryKey(Integer fdid);

    int insert(ScoAreaCreditIndexStatis record);

    int insertSelective(ScoAreaCreditIndexStatis record);

    ScoAreaCreditIndexStatis selectByPrimaryKey(Integer fdid);

    int updateByPrimaryKeySelective(ScoAreaCreditIndexStatis record);

    int updateByPrimaryKey(ScoAreaCreditIndexStatis record);

    List<ScoAreaCreditIndexStatis> findListByStatisTime(String fdStatisTime);

    List<ScoAreaCreditIndexStatis> findListByMaxStatisTime();
}