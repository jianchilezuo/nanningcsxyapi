package ceinet.com.nanningcsxyapi.Service.impl;

import ceinet.com.nanningcsxyapi.Service.ScoRuleInfoStatisService;
import ceinet.com.nanningcsxyapi.Service.ScoServiceInterface;
import ceinet.com.nanningcsxyapi.annotation.ApiStaticAnnotation;
import ceinet.com.nanningcsxyapi.mapper.ScoRuleInfoStatisMapper;
import ceinet.com.nanningcsxyapi.pojo.ApiScoModel;
import ceinet.com.nanningcsxyapi.pojo.ScoRuleInfoStatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/** 
* @Description: 批量保存制度信息统计 
* @Param:  
* @return:  
* @Author: 张文龙
* @Date: 2019/3/1 
*/ 
@Service
@ApiStaticAnnotation(apiUrl = "/api/nncs/score/ruleInfoStatis/v1/batchSave")
public class ScoRuleInfoStatisServiceImpl implements ScoRuleInfoStatisService , ScoServiceInterface {

    @Autowired
    private ScoRuleInfoStatisMapper scoRuleInfoStatisMapper;

    @Override
    public int deleteByPrimaryKey(Integer fdid) {
        return scoRuleInfoStatisMapper.deleteByPrimaryKey(fdid);
    }

    @Override
    public int insert(ScoRuleInfoStatis record) {
        return scoRuleInfoStatisMapper.insert(record);
    }

    @Override
    public int insertSelective(ScoRuleInfoStatis record) {
        return scoRuleInfoStatisMapper.insertSelective(record);
    }

    @Override
    public ScoRuleInfoStatis selectByPrimaryKey(Integer fdid) {
        return scoRuleInfoStatisMapper.selectByPrimaryKey(fdid);
    }

    @Override
    public int updateByPrimaryKeySelective(ScoRuleInfoStatis record) {
        return scoRuleInfoStatisMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ScoRuleInfoStatis record) {
        return scoRuleInfoStatisMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ScoRuleInfoStatis> findListByStatisTime(String fdStatisTime) {
        return scoRuleInfoStatisMapper.findListByStatisTime(fdStatisTime);
    }

    @Override
    public List<ScoRuleInfoStatis> findListByMaxStatisTime() {
        return scoRuleInfoStatisMapper.findListByMaxStatisTime();
    }

    @Override
    public List<ApiScoModel> getListByAutoMaxStatisTime(String statisTime) {
        List<ScoRuleInfoStatis> scoAreaCreditIndexStatis=null;
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
                insert((ScoRuleInfoStatis)m);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw  new Exception("添加失败！");
        }
        return true;
    }
}
