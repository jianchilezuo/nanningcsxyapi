package ceinet.com.nanningcsxyapi.Service.impl;

import ceinet.com.nanningcsxyapi.Service.ScoCreditInfoFineStatisService;
import ceinet.com.nanningcsxyapi.Service.ScoServiceInterface;
import ceinet.com.nanningcsxyapi.annotation.ApiStaticAnnotation;
import ceinet.com.nanningcsxyapi.mapper.ScoCreditInfoFineStatisMapper;
import ceinet.com.nanningcsxyapi.pojo.ApiScoModel;
import ceinet.com.nanningcsxyapi.pojo.ScoCreditInfoFineStatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@ApiStaticAnnotation(apiUrl = "")
public class ScoCreditInfoFineStatisServiceImpl implements ScoCreditInfoFineStatisService , ScoServiceInterface {
    @Autowired
    private ScoCreditInfoFineStatisMapper scoCreditInfoFineStatisMapper;

    @Override
    public int deleteByPrimaryKey(Integer fdid) {
        return scoCreditInfoFineStatisMapper.deleteByPrimaryKey(fdid);
    }

    @Override
    public int insert(ScoCreditInfoFineStatis record) {
        return scoCreditInfoFineStatisMapper.insert(record);
    }

    @Override
    public int insertSelective(ScoCreditInfoFineStatis record) {
        return scoCreditInfoFineStatisMapper.insertSelective(record);
    }

    @Override
    public ScoCreditInfoFineStatis selectByPrimaryKey(Integer fdid) {
        return scoCreditInfoFineStatisMapper.selectByPrimaryKey(fdid);
    }

    @Override
    public int updateByPrimaryKeySelective(ScoCreditInfoFineStatis record) {
        return scoCreditInfoFineStatisMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ScoCreditInfoFineStatis record) {
        return scoCreditInfoFineStatisMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ScoCreditInfoFineStatis> findListByStatisTime(String fdStatisTime) {
        return scoCreditInfoFineStatisMapper.findListByStatisTime(fdStatisTime);
    }

    @Override
    public List<ScoCreditInfoFineStatis> findListByMaxStatisTime() {
        return scoCreditInfoFineStatisMapper.findListByMaxStatisTime();
    }

    @Override
    public List<ApiScoModel> getListByAutoMaxStatisTime(String statisTime) {
        List<ScoCreditInfoFineStatis> scoAreaCreditIndexStatis=null;
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
                insert((ScoCreditInfoFineStatis)m);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw  new Exception("添加失败！");
        }
        return true;
    }
}
