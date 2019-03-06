package ceinet.com.nanningcsxyapi.WebService;

import ceinet.com.nanningcsxyapi.pojo.ApiModel;
import ceinet.com.nanningcsxyapi.pojo.ApiPullDataModel;
import ceinet.com.nanningcsxyapi.pojo.ApiPushData;
import ceinet.com.nanningcsxyapi.pojo.ApiUserModel;
import ceinet.com.nanningcsxyapi.util.HttpRequest;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Service
public class ApiWebService {
    private String access_token;
    @Autowired
    private ApiModel apiModel;

    public ApiWebService() throws Exception {


    }

    @PostConstruct
    private void getAccessToken() throws Exception {
        ApiUserModel apiUserModel = new ApiUserModel();
        apiUserModel.setUsername(apiModel.getUserName());
        apiUserModel.setPassword(apiModel.getPassword());
        String jsonString = JSON.toJSONString(apiUserModel);
        System.out.println(jsonString);
        String apiUrl = apiModel.getUrlIp() + apiModel.getAccessTokenUrl();
        ApiPullDataModel rmodel = getDataModel(apiUrl, jsonString);
        if (rmodel != null && rmodel.getCode().equals("SUCCESS")) {
            access_token = rmodel.getData().getAccess_token();
        }
        if (access_token == null || access_token.equals("")) {
            throw new Exception("access_token 获取失败");
        }

    }

    private ApiPullDataModel getDataModel(String apiUrl, String jsonStrng) throws Exception {

        try {
            String retrunStr = HttpRequest.sendPost(apiUrl, jsonStrng);
            System.out.println(retrunStr.toString());
            ApiPullDataModel rmodel = JSON.parseObject(retrunStr, ApiPullDataModel.class);
            return rmodel;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("调用或者json解析异常");
        }

    }

    public boolean addStatisList(String apiUrl, ApiPushData apiPushData) throws Exception {

        String jsonString = JSON.toJSONString(apiPushData);
        System.out.println(jsonString.toString());
        ApiPullDataModel rmodel = getDataModel(apiUrl + "?access_token=" + access_token, jsonString);
        if (rmodel != null) {
            if (rmodel.getCode().equals("SUCCESS")){
                System.out.println(apiUrl+"推送成功！");
                return true;
            }
//            if(rmodel.getCode().equals(""))
            return  false;
        } else {
            return false;
        }
    }
}
