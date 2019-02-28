package ceinet.com.nanningcsxyapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("ceinet.com.nanningcsxyapi.mapper")
@SpringBootApplication
public class NanningcsxyapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NanningcsxyapiApplication.class, args);
    }

}
