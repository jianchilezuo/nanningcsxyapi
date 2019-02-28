package ceinet.com.nanningcsxyapi.WebService;

import ceinet.com.nanningcsxyapi.pojo.ApiPullDataModel;
import ceinet.com.nanningcsxyapi.pojo.ApiPushData;
import ceinet.com.nanningcsxyapi.pojo.ApiUserModel;
import ceinet.com.nanningcsxyapi.util.HttpRequest;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ApiWebService {
    private String access_token;
    @Value("${api.url}")
    private String urlIp;
    @Value("${api.username}")
    private String userName;
    @Value("${api.password}")
    private String password;
    @Value("${api.accesstokenurl}")
    private String accessTokenUrl;

    public ApiWebService() throws Exception {
        access_token = getAccessToken();
        if (access_token == null || access_token.equals("")) {
            throw new Exception("access_token 获取失败");
        }
    }

    private String getAccessToken() {
        ApiUserModel apiUserModel = new ApiUserModel();
        apiUserModel.setUsername(userName);
        apiUserModel.setPassword(password);
        String jsonString = JSON.toJSONString(apiUserModel);
        System.out.println(jsonString.toString());
        String apiUrl = urlIp+accessTokenUrl;
        String retrunStr = null;
        try {
            ApiPullDataModel rmodel = getDataModel(apiUrl,jsonString);
            if (rmodel != null && rmodel.getCode().equals("SUCCESS")) {
                return rmodel.getData().getAccess_token();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
    private  ApiPullDataModel getDataModel(String apiUrl,String jsonStrng) throws Exception {
        try {
            String retrunStr = HttpRequest.sendGet(apiUrl, jsonStrng);
            ApiPullDataModel rmodel = JSON.parseObject(retrunStr, ApiPullDataModel.class);
            return rmodel;
        } catch (Exception e) {
            e.printStackTrace();
            throw  new Exception("调用或者json解析异常");
        }

    }
    public boolean addStatisList(String apiUrl, ApiPushData apiPushData) throws Exception {
        String jsonString = JSON.toJSONString(apiPushData);

            ApiPullDataModel rmodel = getDataModel(apiUrl,jsonString);
            if (rmodel != null && rmodel.getCode().equals("SUCCESS")) {
                return true;
            }else {
                return  false;
            }
    }
}
