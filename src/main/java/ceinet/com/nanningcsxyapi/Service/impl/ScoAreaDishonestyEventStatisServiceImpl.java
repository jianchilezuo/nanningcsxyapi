package ceinet.com.nanningcsxyapi.Service.impl;

import ceinet.com.nanningcsxyapi.Service.ScoAreaDishonestyEventStatisService;
import ceinet.com.nanningcsxyapi.Service.ScoServiceInterface;
import ceinet.com.nanningcsxyapi.annotation.ApiStaticAnnotation;
import ceinet.com.nanningcsxyapi.mapper.ScoAreaDishonestyEventStatisMapper;
import ceinet.com.nanningcsxyapi.pojo.ApiScoModel;
import ceinet.com.nanningcsxyapi.pojo.ScoAreaDishonestyEventStatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/** 
* @Description: 批量保存区域失信事件统计
* @Param:  
* @return:  
* @Author: 张文龙
* @Date: 2019/3/1 
*/ 
@Service
@ApiStaticAnnotation(apiUrl = "/api/nncs/score/areaDishonestyEventStatis/v1/batchSave")
public class ScoAreaDishonestyEventStatisServiceImpl implements ScoAreaDishonestyEventStatisService , ScoServiceInterface {

    @Autowired
    private ScoAreaDishonestyEventStatisMapper scoAreaDishonestyEventStatisMapper;
    @Override
    public int deleteByPrimaryKey(Integer fdid) {
        return scoAreaDishonestyEventStatisMapper.deleteByPrimaryKey(fdid);
    }

    @Override
    public int insert(ScoAreaDishonestyEventStatis record) {
        return scoAreaDishonestyEventStatisMapper.insert(record);
    }

    @Override
    public int insertSelective(ScoAreaDishonestyEventStatis record) {
        return scoAreaDishonestyEventStatisMapper.insert(record);
    }

    @Override
    public ScoAreaDishonestyEventStatis selectByPrimaryKey(Integer fdid) {
        return scoAreaDishonestyEventStatisMapper.selectByPrimaryKey(fdid);
    }

    @Override
    public int updateByPrimaryKeySelective(ScoAreaDishonestyEventStatis record) {
        return scoAreaDishonestyEventStatisMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ScoAreaDishonestyEventStatis record) {
        return scoAreaDishonestyEventStatisMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ScoAreaDishonestyEventStatis> findListByStatisTime(String fdStatisTime) {
        return scoAreaDishonestyEventStatisMapper.findListByStatisTime(fdStatisTime);
    }

    @Override
    public List<ScoAreaDishonestyEventStatis> findListByMaxStatisTime() {
        return scoAreaDishonestyEventStatisMapper.findListByMaxStatisTime();
    }

    @Override
    public List<ApiScoModel> getListByAutoMaxStatisTime(String statisTime) {
        List<ScoAreaDishonestyEventStatis> scoAreaCreditIndexStatis=null;
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
                insert((ScoAreaDishonestyEventStatis)m);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw  new Exception("添加失败！");
        }
        return true;
    }
}
