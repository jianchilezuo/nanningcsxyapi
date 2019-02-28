package ceinet.com.nanningcsxyapi.Service;

import ceinet.com.nanningcsxyapi.pojo.ScoAreaCreditInfoDistribution;

import java.util.List;

public interface ScoAreaCreditInfoDistributionService {

    int deleteByPrimaryKey(Integer fdid);

    int insert(ScoAreaCreditInfoDistribution record);

    int insertSelective(ScoAreaCreditInfoDistribution record);

    ScoAreaCreditInfoDistribution selectByPrimaryKey(Integer fdid);

    int updateByPrimaryKeySelective(ScoAreaCreditInfoDistribution record);

    int updateByPrimaryKey(ScoAreaCreditInfoDistribution record);

    List<ScoAreaCreditInfoDistribution> findListByStatisTime(String fdStatisTime);

    List<ScoAreaCreditInfoDistribution> findListByMaxStatisTime();
}
