package ceinet.com.nanningcsxyapi.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class ApiModel {
    @Value("${api.url}")
    private String urlIp;
    @Value("${api.username}")
    private String userName;
    @Value("${api.password}")
    private String password;
    @Value("${api.accesstokenurl}")
    private String accessTokenUrl;
}
