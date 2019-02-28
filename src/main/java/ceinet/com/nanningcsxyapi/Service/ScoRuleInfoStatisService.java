package ceinet.com.nanningcsxyapi.Service;

import ceinet.com.nanningcsxyapi.pojo.ScoRuleInfoStatis;

import java.util.List;

public interface ScoRuleInfoStatisService {

    int deleteByPrimaryKey(Integer fdid);

    int insert(ScoRuleInfoStatis record);

    int insertSelective(ScoRuleInfoStatis record);

    ScoRuleInfoStatis selectByPrimaryKey(Integer fdid);

    int updateByPrimaryKeySelective(ScoRuleInfoStatis record);

    int updateByPrimaryKey(ScoRuleInfoStatis record);

    List<ScoRuleInfoStatis> findListByStatisTime(String fdStatisTime);

    List<ScoRuleInfoStatis> findListByMaxStatisTime();
}
