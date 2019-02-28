package ceinet.com.nanningcsxyapi.mapper;

import ceinet.com.nanningcsxyapi.pojo.ScoCreditInfoFineStatis;
import ceinet.com.nanningcsxyapi.pojo.ScoEventInfoStatis;

import java.util.List;

/**
* Created by Mybatis Generator 2019/02/27
*/
public interface ScoEventInfoStatisMapper {
    int deleteByPrimaryKey(Integer fdid);

    int insert(ScoEventInfoStatis record);

    int insertSelective(ScoEventInfoStatis record);

    ScoEventInfoStatis selectByPrimaryKey(Integer fdid);

    int updateByPrimaryKeySelective(ScoEventInfoStatis record);

    int updateByPrimaryKey(ScoEventInfoStatis record);

    List<ScoEventInfoStatis> findListByStatisTime(String fdStatisTime);

    List<ScoEventInfoStatis> findListByMaxStatisTime();
}