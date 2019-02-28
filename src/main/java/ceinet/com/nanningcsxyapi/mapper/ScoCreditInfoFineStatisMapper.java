package ceinet.com.nanningcsxyapi.mapper;

import ceinet.com.nanningcsxyapi.pojo.ScoCreditInfoFineStatis;

import java.util.List;

/**
* Created by Mybatis Generator 2019/02/27
*/
public interface ScoCreditInfoFineStatisMapper {
    int deleteByPrimaryKey(Integer fdid);

    int insert(ScoCreditInfoFineStatis record);

    int insertSelective(ScoCreditInfoFineStatis record);

    ScoCreditInfoFineStatis selectByPrimaryKey(Integer fdid);

    int updateByPrimaryKeySelective(ScoCreditInfoFineStatis record);

    int updateByPrimaryKey(ScoCreditInfoFineStatis record);

    List<ScoCreditInfoFineStatis> findListByStatisTime(String fdStatisTime);

    List<ScoCreditInfoFineStatis> findListByMaxStatisTime();
}