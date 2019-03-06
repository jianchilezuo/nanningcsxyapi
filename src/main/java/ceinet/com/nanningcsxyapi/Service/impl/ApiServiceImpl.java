package ceinet.com.nanningcsxyapi.Service.impl;

import ceinet.com.nanningcsxyapi.Service.ApiService;
import ceinet.com.nanningcsxyapi.Service.ScoService;
import ceinet.com.nanningcsxyapi.Service.ScoServiceInterface;
import ceinet.com.nanningcsxyapi.WebService.ApiWebService;
import ceinet.com.nanningcsxyapi.annotation.ApiStaticAnnotation;
import ceinet.com.nanningcsxyapi.component.ApplicationContextUtil;
import ceinet.com.nanningcsxyapi.pojo.ApiModel;
import ceinet.com.nanningcsxyapi.pojo.ApiPushData;
import ceinet.com.nanningcsxyapi.pojo.ApiPushDataModel;
import ceinet.com.nanningcsxyapi.pojo.ApiScoModel;
import ceinet.com.nanningcsxyapi.util.ClassUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServiceImpl<T> implements ApiService<T> {

    @Autowired
    private ScoService scoService;

    @Autowired
    private ApiWebService apiWebService;

    /**
     * @Description: 一次推送所有自动算的最大时间段的数据到接口
     * @Param:
     * @return:
     * @Author: 张文龙
     * @Date: 2019/2/28
     */
    public boolean pushAllListByAutoMaxStatisTime() throws Exception {
        return pushAllListByStatisTime(null);
    }

    /**
     * @Description: 一次推送所有某时间段的数据到接口
     * @Param:
     * @return:
     * @Author: 张文龙
     * @Date: 2019/2/28
     */
    public boolean pushAllListByStatisTime(String statisTime) throws Exception {
        List<Class<?>> allClass = ClassUtil.getAllClassByPackageNameAndAnnotationClass("ceinet.com.nanningcsxyapi.Service.impl", ApiStaticAnnotation.class);
        for (Class clazz : allClass) {
            pushListByStatisTime(clazz,statisTime);
        }
        return true;
    }

    public boolean pushListByAutoMaxStatisTime(Class<T> clazz) throws Exception {
        return pushListByStatisTime(clazz,null);
    }
    public boolean pushListByStatisTime(Class<T> clazz, String statisTime)throws Exception  {
        List<ApiScoModel> list = null;
        ApiPushData apiPushData = new ApiPushData();
        ApiStaticAnnotation apiStaticAnnotation=null;
        if (statisTime == null || statisTime.equals("")) {
            list = scoService.getListByAutoMaxStatisTime(clazz);
        }else {
            list=scoService.getListByAutoMaxStatisTime(clazz,statisTime);
        }
        apiStaticAnnotation=clazz.getAnnotation(ApiStaticAnnotation.class);
        if(apiStaticAnnotation==null||apiStaticAnnotation.apiUrl().equals("")){
            throw  new Exception("apiStaticAnnotation注解失败或者apiStaticAnnotation的apiUrl为空！");
        }
        ApiPushDataModel  apiPushDataModel=new ApiPushDataModel();
        apiPushDataModel.setList(list);
        apiPushData.setData(apiPushDataModel);
        ApplicationContext applicationContext = ApplicationContextUtil.getApplicationContext();
        ApiModel bean = applicationContext.getBean(ApiModel.class);
        if(!apiWebService.addStatisList(bean.getUrlIp()+apiStaticAnnotation.apiUrl(),apiPushData)){
            throw  new Exception("推送数据失败！");
        }
        return true;
    }
    public boolean addList(List<ApiScoModel> apiScoModels) throws Exception {
        return scoService.addList(apiScoModels);
    }
}
