package ceinet.com.nanningcsxyapi.mapper;

import ceinet.com.nanningcsxyapi.pojo.ScoAreaDishonestyEventStatis;

import java.util.List;

/**
* Created by Mybatis Generator 2019/02/27
*/
public interface ScoAreaDishonestyEventStatisMapper {
    int deleteByPrimaryKey(Integer fdid);

    int insert(ScoAreaDishonestyEventStatis record);

    int insertSelective(ScoAreaDishonestyEventStatis record);

    ScoAreaDishonestyEventStatis selectByPrimaryKey(Integer fdid);

    int updateByPrimaryKeySelective(ScoAreaDishonestyEventStatis record);

    int updateByPrimaryKey(ScoAreaDishonestyEventStatis record);

    List<ScoAreaDishonestyEventStatis> findListByStatisTime(String fdStatisTime);

    List<ScoAreaDishonestyEventStatis> findListByMaxStatisTime();
}