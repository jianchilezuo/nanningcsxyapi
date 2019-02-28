package ceinet.com.nanningcsxyapi.mapper;

import ceinet.com.nanningcsxyapi.pojo.ScoAreaCreditInfoDistribution;

import java.util.List;

/**
* Created by Mybatis Generator 2019/02/27
*/
public interface ScoAreaCreditInfoDistributionMapper {
    int deleteByPrimaryKey(Integer fdid);

    int insert(ScoAreaCreditInfoDistribution record);

    int insertSelective(ScoAreaCreditInfoDistribution record);

    ScoAreaCreditInfoDistribution selectByPrimaryKey(Integer fdid);

    int updateByPrimaryKeySelective(ScoAreaCreditInfoDistribution record);

    int updateByPrimaryKey(ScoAreaCreditInfoDistribution record);

    List<ScoAreaCreditInfoDistribution> findListByStatisTime(String fdStatisTime);

    List<ScoAreaCreditInfoDistribution> findListByMaxStatisTime();
}