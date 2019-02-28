package ceinet.com.nanningcsxyapi.Service.impl;

import ceinet.com.nanningcsxyapi.Service.ScoAreaCreditIndexStatisService;
import ceinet.com.nanningcsxyapi.Service.ScoServiceInterface;
import ceinet.com.nanningcsxyapi.annotation.ApiStaticAnnotation;
import ceinet.com.nanningcsxyapi.mapper.ScoAreaCreditIndexStatisMapper;
import ceinet.com.nanningcsxyapi.pojo.ApiScoModel;
import ceinet.com.nanningcsxyapi.pojo.ScoAreaCreditIndexStatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@ApiStaticAnnotation(apiUrl = "")
public class ScoAreaCreditIndexStatisServiceImpl implements ScoAreaCreditIndexStatisService , ScoServiceInterface {

    @Autowired
    private ScoAreaCreditIndexStatisMapper scoAreaCreditIndexStatisMapper;

    @Override
    public int deleteByPrimaryKey(Integer fdid) {
        return scoAreaCreditIndexStatisMapper.deleteByPrimaryKey(fdid);
    }

    @Override
    public int insert(ScoAreaCreditIndexStatis record) {
        return scoAreaCreditIndexStatisMapper.insert(record);
    }

    @Override
    public int insertSelective(ScoAreaCreditIndexStatis record) {
        return scoAreaCreditIndexStatisMapper.insertSelective(record);
    }

    @Override
    public ScoAreaCreditIndexStatis selectByPrimaryKey(Integer fdid) {
        return scoAreaCreditIndexStatisMapper.selectByPrimaryKey(fdid);
    }

    @Override
    public int updateByPrimaryKeySelective(ScoAreaCreditIndexStatis record) {
        return scoAreaCreditIndexStatisMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ScoAreaCreditIndexStatis record) {
        return scoAreaCreditIndexStatisMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ScoAreaCreditIndexStatis> findListByStatisTime(String fdStatisTime) {
        return scoAreaCreditIndexStatisMapper.findListByStatisTime(fdStatisTime);
    }

    @Override
    public List<ScoAreaCreditIndexStatis> findListByMaxStatisTime() {
        return scoAreaCreditIndexStatisMapper.findListByMaxStatisTime();
    }

    @Override
    public List<ApiScoModel> getListByAutoMaxStatisTime(String statisTime) {
        List<ScoAreaCreditIndexStatis> scoAreaCreditIndexStatis=null;
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
                insert((ScoAreaCreditIndexStatis)m);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw  new Exception("添加失败！");
        }
        return true;
    }
}
