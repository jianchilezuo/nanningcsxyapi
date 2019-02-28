package ceinet.com.nanningcsxyapi.Service;

import ceinet.com.nanningcsxyapi.pojo.ApiScoModel;

import java.util.List;

public interface ScoService<T> {

   public List<ApiScoModel> getListByAutoMaxStatisTime(Class czz) throws IllegalAccessException, InstantiationException;

   public List<ApiScoModel> getListByAutoMaxStatisTime(Class czz ,String statisTime) throws IllegalAccessException, InstantiationException;

   public  boolean addList(List<ApiScoModel> ms);
}
