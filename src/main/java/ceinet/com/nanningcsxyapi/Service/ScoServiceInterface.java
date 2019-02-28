package ceinet.com.nanningcsxyapi.Service;

import ceinet.com.nanningcsxyapi.pojo.ApiScoModel;

import java.util.List;

public interface ScoServiceInterface {


    public List<ApiScoModel> getListByAutoMaxStatisTime(String statisTime);

    public  boolean addList(List<ApiScoModel> ms) throws Exception;
}
