package ceinet.com.nanningcsxyapi.Service;

import ceinet.com.nanningcsxyapi.pojo.ScoAreaDishonestyEventStatis;
import ceinet.com.nanningcsxyapi.pojo.ScoCreditInfoFineStatis;

import java.util.List;

public interface ScoCreditInfoFineStatisService {

    int deleteByPrimaryKey(Integer fdid);

    int insert(ScoCreditInfoFineStatis record);

    int insertSelective(ScoCreditInfoFineStatis record);

    ScoCreditInfoFineStatis selectByPrimaryKey(Integer fdid);

    int updateByPrimaryKeySelective(ScoCreditInfoFineStatis record);

    int updateByPrimaryKey(ScoCreditInfoFineStatis record);

    List<ScoCreditInfoFineStatis> findListByStatisTime(String fdStatisTime);

    List<ScoCreditInfoFineStatis> findListByMaxStatisTime();
}
