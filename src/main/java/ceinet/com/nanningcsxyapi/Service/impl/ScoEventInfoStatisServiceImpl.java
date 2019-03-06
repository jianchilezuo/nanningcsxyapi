package ceinet.com.nanningcsxyapi.Service.impl;

import ceinet.com.nanningcsxyapi.Service.ScoEventInfoStatisService;
import ceinet.com.nanningcsxyapi.Service.ScoServiceInterface;
import ceinet.com.nanningcsxyapi.annotation.ApiStaticAnnotation;
import ceinet.com.nanningcsxyapi.mapper.ScoEventInfoStatisMapper;
import ceinet.com.nanningcsxyapi.pojo.ApiScoModel;
import ceinet.com.nanningcsxyapi.pojo.ScoEventInfoStatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/** 
* @Description: 批量保存事件信息统计
* @Param:  
* @return:  
* @Author: 张文龙
* @Date: 2019/3/1 
*/ 
@Service
@ApiStaticAnnotation(apiUrl = "/api/nncs/score/eventInfoStatis/v1/batchSave")
public class ScoEventInfoStatisServiceImpl implements ScoEventInfoStatisService , ScoServiceInterface {

    @Autowired
    private ScoEventInfoStatisMapper scoEventInfoStatisMapper;
    @Override
    public int deleteByPrimaryKey(Integer fdid) {
        return scoEventInfoStatisMapper.deleteByPrimaryKey(fdid);
    }

    @Override
    public int insert(ScoEventInfoStatis record) {
        return scoEventInfoStatisMapper.insert(record);
    }

    @Override
    public int insertSelective(ScoEventInfoStatis record) {
        return scoEventInfoStatisMapper.insertSelective(record);
    }

    @Override
    public ScoEventInfoStatis selectByPrimaryKey(Integer fdid) {
        return scoEventInfoStatisMapper.selectByPrimaryKey(fdid);
    }

    @Override
    public int updateByPrimaryKeySelective(ScoEventInfoStatis record) {
        return scoEventInfoStatisMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ScoEventInfoStatis record) {
        return scoEventInfoStatisMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ScoEventInfoStatis> findListByStatisTime(String fdStatisTime) {
        return scoEventInfoStatisMapper.findListByStatisTime(fdStatisTime);
    }

    @Override
    public List<ScoEventInfoStatis> findListByMaxStatisTime() {
        return scoEventInfoStatisMapper.findListByMaxStatisTime();
    }

    @Override
    public List<ApiScoModel> getListByAutoMaxStatisTime(String statisTime) {
        List<ScoEventInfoStatis> scoAreaCreditIndexStatis=null;
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
                insert((ScoEventInfoStatis)m);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw  new Exception("添加失败！");
        }
        return true;
    }
}
