package ceinet.com.nanningcsxyapi.Service;

import ceinet.com.nanningcsxyapi.pojo.ScoAreaDishonestyEventStatis;

import java.util.List;

public interface ScoAreaDishonestyEventStatisService {

    int deleteByPrimaryKey(Integer fdid);

    int insert(ScoAreaDishonestyEventStatis record);

    int insertSelective(ScoAreaDishonestyEventStatis record);

    ScoAreaDishonestyEventStatis selectByPrimaryKey(Integer fdid);

    int updateByPrimaryKeySelective(ScoAreaDishonestyEventStatis record);

    int updateByPrimaryKey(ScoAreaDishonestyEventStatis record);

    List<ScoAreaDishonestyEventStatis> findListByStatisTime(String fdStatisTime);

    List<ScoAreaDishonestyEventStatis> findListByMaxStatisTime();
}
