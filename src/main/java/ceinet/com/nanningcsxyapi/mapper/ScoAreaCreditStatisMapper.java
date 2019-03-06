package ceinet.com.nanningcsxyapi.mapper;

import ceinet.com.nanningcsxyapi.pojo.ScoAreaCreditInfoDistribution;
import ceinet.com.nanningcsxyapi.pojo.ScoAreaCreditStatis;

import java.util.List;

/**
* Created by Mybatis Generator 2019/03/06
*/
public interface ScoAreaCreditStatisMapper {
    int deleteByPrimaryKey(Integer fdid);

    int insert(ScoAreaCreditStatis record);

    int insertSelective(ScoAreaCreditStatis record);

    ScoAreaCreditStatis selectByPrimaryKey(Integer fdid);

    int updateByPrimaryKeySelective(ScoAreaCreditStatis record);

    int updateByPrimaryKey(ScoAreaCreditStatis record);

    List<ScoAreaCreditStatis> findListByStatisTime(String fdStatisTime);

    List<ScoAreaCreditStatis> findListByMaxStatisTime();
}