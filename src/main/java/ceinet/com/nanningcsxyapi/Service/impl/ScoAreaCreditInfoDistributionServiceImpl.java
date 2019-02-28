package ceinet.com.nanningcsxyapi.Service.impl;

import ceinet.com.nanningcsxyapi.Service.ScoAreaCreditInfoDistributionService;
import ceinet.com.nanningcsxyapi.Service.ScoServiceInterface;
import ceinet.com.nanningcsxyapi.annotation.ApiStaticAnnotation;
import ceinet.com.nanningcsxyapi.mapper.ScoAreaCreditInfoDistributionMapper;
import ceinet.com.nanningcsxyapi.pojo.ApiScoModel;
import ceinet.com.nanningcsxyapi.pojo.ScoAreaCreditInfoDistribution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@ApiStaticAnnotation(apiUrl = "")
public class ScoAreaCreditInfoDistributionServiceImpl  implements ScoAreaCreditInfoDistributionService , ScoServiceInterface {

    @Autowired
    private ScoAreaCreditInfoDistributionMapper  scoAreaCreditInfoDistributionMapper;
    @Override
    public int deleteByPrimaryKey(Integer fdid) {
        return scoAreaCreditInfoDistributionMapper.deleteByPrimaryKey(fdid);
    }

    @Override
    public int insert(ScoAreaCreditInfoDistribution record) {
        return scoAreaCreditInfoDistributionMapper.insert(record);
    }

    @Override
    public int insertSelective(ScoAreaCreditInfoDistribution record) {
        return scoAreaCreditInfoDistributionMapper.insertSelective(record);
    }

    @Override
    public ScoAreaCreditInfoDistribution selectByPrimaryKey(Integer fdid) {
        return scoAreaCreditInfoDistributionMapper.selectByPrimaryKey(fdid);
    }

    @Override
    public int updateByPrimaryKeySelective(ScoAreaCreditInfoDistribution record) {
        return scoAreaCreditInfoDistributionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ScoAreaCreditInfoDistribution record) {
        return scoAreaCreditInfoDistributionMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ScoAreaCreditInfoDistribution> findListByStatisTime(String fdStatisTime) {
        return scoAreaCreditInfoDistributionMapper.findListByStatisTime(fdStatisTime);
    }

    @Override
    public List<ScoAreaCreditInfoDistribution> findListByMaxStatisTime() {
        return scoAreaCreditInfoDistributionMapper.findListByMaxStatisTime();
    }

    @Override
    public List<ApiScoModel> getListByAutoMaxStatisTime(String statisTime) {
        List<ScoAreaCreditInfoDistribution> scoAreaCreditIndexStatis=null;
        List<ApiScoModel> ms=new ArrayList<>();
        if(statisTime==null||statisTime.equals(""))
            scoAreaCreditIndexStatis=findListByMaxStatisTime();
        else
            scoAreaCreditIndexStatis=findListByStatisTime(statisTime);
        ms.addAll(scoAreaCreditIndexStatis);
        return  ms;
    }

    @Override
    public boolean addList(List<ApiScoModel> ms) throws Exception {
        try {
            for (ApiScoModel m : ms) {
                insert((ScoAreaCreditInfoDistribution)m);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw  new Exception("添加失败！");
        }
        return true;
    }
}
