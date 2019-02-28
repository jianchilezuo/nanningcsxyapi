package ceinet.com.nanningcsxyapi.Service;
import ceinet.com.nanningcsxyapi.pojo.ScoEventInfoStatis;
import java.util.List;

public interface ScoEventInfoStatisService {

    int deleteByPrimaryKey(Integer fdid);

    int insert(ScoEventInfoStatis record);

    int insertSelective(ScoEventInfoStatis record);

    ScoEventInfoStatis selectByPrimaryKey(Integer fdid);

    int updateByPrimaryKeySelective(ScoEventInfoStatis record);

    int updateByPrimaryKey(ScoEventInfoStatis record);

    List<ScoEventInfoStatis> findListByStatisTime(String fdStatisTime);

    List<ScoEventInfoStatis> findListByMaxStatisTime();
}
