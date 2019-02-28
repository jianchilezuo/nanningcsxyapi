package ceinet.com.nanningcsxyapi.Service;

import ceinet.com.nanningcsxyapi.WebService.ApiWebService;
import ceinet.com.nanningcsxyapi.pojo.ApiScoModel;
import org.apiguardian.api.API;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ApiService<T> {



    /**
     * @Description: 一次推送所有自动算的最大时间段的数据到接口
     * @Param:
     * @return:
     * @Author: 张文龙
     * @Date: 2019/2/28
     */
    public boolean pushAllListByAutoMaxStatisTime() throws Exception;

    /**
     * @Description: 一次推送所有某时间段的数据到接口
     * @Param:
     * @return:
     * @Author: 张文龙
     * @Date: 2019/2/28
     */
    public boolean pushAllListByStatisTime(String statisTime) throws Exception;

    public boolean pushListByAutoMaxStatisTime(Class<T> clazz) throws Exception;

    public boolean pushListByStatisTime(Class<T> clazz, String statisTime) throws Exception;

    public boolean addList(List<ApiScoModel> apiScoModels);
}
