package ceinet.com.nanningcsxyapi.Service.impl;

import ceinet.com.nanningcsxyapi.Service.ScoService;
import ceinet.com.nanningcsxyapi.Service.ScoServiceInterface;
import ceinet.com.nanningcsxyapi.mapper.*;
import ceinet.com.nanningcsxyapi.pojo.ApiScoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoServiceImpl implements ScoService {

   private  ScoServiceInterface scoServiceInterface=null;

    @Override
    public List<ApiScoModel> getListByAutoMaxStatisTime(Class czz) throws IllegalAccessException, InstantiationException {
        scoServiceInterface=(ScoServiceInterface)czz.newInstance();
        return scoServiceInterface.getListByAutoMaxStatisTime(null);
    }

    @Override
    public List<ApiScoModel> getListByAutoMaxStatisTime(Class czz ,String statisTime) throws IllegalAccessException, InstantiationException {
        scoServiceInterface=(ScoServiceInterface)czz.newInstance();
        return scoServiceInterface.getListByAutoMaxStatisTime(null);
    }

    @Override
    public boolean addList(List ms) {
        return false;
    }
}
