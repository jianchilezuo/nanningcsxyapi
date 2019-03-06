package ceinet.com.nanningcsxyapi.Service.impl;

import ceinet.com.nanningcsxyapi.Service.ScoAreaCreditStatisService;
import ceinet.com.nanningcsxyapi.Service.ScoServiceInterface;
import ceinet.com.nanningcsxyapi.annotation.ApiStaticAnnotation;
import ceinet.com.nanningcsxyapi.mapper.ScoAreaCreditStatisMapper;
import ceinet.com.nanningcsxyapi.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@ApiStaticAnnotation(apiUrl ="/api/nncs/score/areaCreditIndexStatis/v1/batchSave")
public class ScoAreaCreditStatisImpl implements ScoAreaCreditStatisService , ScoServiceInterface {

    @Autowired
    private ScoAreaCreditStatisMapper scoAreaCreditStatisMapper;


    @Override
    public int deleteByPrimaryKey(Integer fdid) {
        return scoAreaCreditStatisMapper.deleteByPrimaryKey(fdid);
    }

    @Override
    public int insert(ScoAreaCreditStatis record) {
        return scoAreaCreditStatisMapper.insert(record);
    }

    @Override
    public int insertSelective(ScoAreaCreditStatis record) {
        return scoAreaCreditStatisMapper.insertSelective(record);
    }

    @Override
    public ScoAreaCreditStatis selectByPrimaryKey(Integer fdid) {
        return scoAreaCreditStatisMapper.selectByPrimaryKey(fdid);
    }

    @Override
    public int updateByPrimaryKeySelective(ScoAreaCreditStatis record) {

        return scoAreaCreditStatisMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ScoAreaCreditStatis record) {
        return scoAreaCreditStatisMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ScoAreaCreditStatis> findListByStatisTime(String fdStatisTime) {
        return scoAreaCreditStatisMapper.findListByStatisTime(fdStatisTime);
    }

    @Override
    public List<ScoAreaCreditStatis> findListByMaxStatisTime() {
        return scoAreaCreditStatisMapper.findListByMaxStatisTime();
    }


    @Override
    public List<ApiScoModel> getListByAutoMaxStatisTime(String statisTime) {
        List<ScoAreaCreditStatis> list=null;
        List<ApiScoModel> ms=new ArrayList<>();
        if(statisTime==null||statisTime.equals(""))
            list=findListByMaxStatisTime();
        else
            list=findListByStatisTime(statisTime);
        ms.addAll(list);
        return  ms;
    }

    @Override
    public boolean addList(List<ApiScoModel> ms) throws Exception {
        try {
            for (ApiScoModel m : ms) {
                insert((ScoAreaCreditStatis)m);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw  new Exception("添加失败！");
        }
        return true;
    }
}
