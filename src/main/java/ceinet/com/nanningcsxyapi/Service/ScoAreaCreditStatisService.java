package ceinet.com.nanningcsxyapi.Service;

import ceinet.com.nanningcsxyapi.pojo.ScoAreaCreditInfoDistribution;
import ceinet.com.nanningcsxyapi.pojo.ScoAreaCreditStatis;

import java.util.List;

public interface ScoAreaCreditStatisService {

    int deleteByPrimaryKey(Integer fdid);

    int insert(ScoAreaCreditStatis record);

    int insertSelective(ScoAreaCreditStatis record);

    ScoAreaCreditStatis selectByPrimaryKey(Integer fdid);

    int updateByPrimaryKeySelective(ScoAreaCreditStatis record);

    int updateByPrimaryKey(ScoAreaCreditStatis record);

    List<ScoAreaCreditStatis> findListByStatisTime(String fdStatisTime);

    List<ScoAreaCreditStatis> findListByMaxStatisTime();
}
