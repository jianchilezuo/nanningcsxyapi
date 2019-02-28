package ceinet.com.nanningcsxyapi.Service;

import ceinet.com.nanningcsxyapi.pojo.ScoAreaCreditIndexStatis;

import java.util.List;

public interface ScoAreaCreditIndexStatisService {

    int deleteByPrimaryKey(Integer fdid);

    int insert(ScoAreaCreditIndexStatis record);

    int insertSelective(ScoAreaCreditIndexStatis record);

    ScoAreaCreditIndexStatis selectByPrimaryKey(Integer fdid);

    int updateByPrimaryKeySelective(ScoAreaCreditIndexStatis record);

    int updateByPrimaryKey(ScoAreaCreditIndexStatis record);

    List<ScoAreaCreditIndexStatis> findListByStatisTime(String fdStatisTime);

    List<ScoAreaCreditIndexStatis> findListByMaxStatisTime();
}
