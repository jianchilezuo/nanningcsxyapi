package ceinet.com.nanningcsxyapi;

import ceinet.com.nanningcsxyapi.Service.ApiService;
import ceinet.com.nanningcsxyapi.WebService.ApiWebService;
import ceinet.com.nanningcsxyapi.annotation.ApiStaticAnnotation;
import ceinet.com.nanningcsxyapi.mapper.ScoAreaCreditIndexStatisMapper;
import ceinet.com.nanningcsxyapi.pojo.ApiPullDataModel;
import ceinet.com.nanningcsxyapi.pojo.ApiUserModel;
import ceinet.com.nanningcsxyapi.pojo.ScoAreaCreditIndexStatis;
import ceinet.com.nanningcsxyapi.util.ClassUtil;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NanningcsxyapiApplicationTests {

    @Autowired
    private ScoAreaCreditIndexStatisMapper scoAreaCreditIndexStatisMapper;
    @Test
    public void contextLoads() {
    }

    @Test
    public  void  fun1(){
        ScoAreaCreditIndexStatis scoAreaCreditIndexStatis=new ScoAreaCreditIndexStatis();
        scoAreaCreditIndexStatis.setAreaName("test1");
        scoAreaCreditIndexStatis.setCreditIndex(1);
        scoAreaCreditIndexStatis.setRankValue(100d);
        scoAreaCreditIndexStatis.setStatisTime("201902");
        scoAreaCreditIndexStatis.setUpdatetime(new Date());
        scoAreaCreditIndexStatisMapper.insert(scoAreaCreditIndexStatis);
    }

    @Test
    public  void  fun2(){
        List<ScoAreaCreditIndexStatis> listByStatisTime = scoAreaCreditIndexStatisMapper.findListByStatisTime("201902");
        for (ScoAreaCreditIndexStatis scoAreaCreditIndexStatis : listByStatisTime) {
            System.out.println(scoAreaCreditIndexStatis.toString());
        }

    }
    @Test
    public  void  fun3() throws Exception {
        ApiWebService apiWebService=new ApiWebService();
//         apiWebService.getAccessToken();
    }
    @Test
    public  void  fun4(){
//        Annotation[] annotations = ScoAreaCreditIndexStatisMapper.class.getAnnotations();
//        for ( Annotation annotatedType :annotations) {
//            if(annotatedType.getClass()== ApiStaticAnnotation.class)
//                System.out.println(annotatedType.toString());
//        }
        boolean haveAnnotationClass = ClassUtil.isHaveAnnotationClass(ScoAreaCreditIndexStatisMapper.class, ApiStaticAnnotation.class);
        System.out.println(haveAnnotationClass);
    }
    @Test
    public  void  fun5(){
        List<Class<?>> allClassByPackageNameAndAnnotationClass = ClassUtil.getAllClassByPackageNameAndAnnotationClass("ceinet.com.nanningcsxyapi.mapper", ApiStaticAnnotation.class);
        for (Class<?> classByPackageNameAndAnnotationClass : allClassByPackageNameAndAnnotationClass) {
            System.out.println(classByPackageNameAndAnnotationClass.toString());
        }

    }
    @Autowired
    private ApiService apiService;
    @Test
    public  void  fun6() throws Exception {
        apiService.pushAllListByAutoMaxStatisTime();
    }

    @Test
    public  void  fun7(){

        ApiUserModel apiUserModel = new ApiUserModel();
        apiUserModel.setUsername("123");
        apiUserModel.setPassword("123");
        String jsonString = JSON.toJSONString(apiUserModel);

    }
}
