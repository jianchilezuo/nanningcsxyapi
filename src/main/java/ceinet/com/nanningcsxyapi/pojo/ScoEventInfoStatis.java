package ceinet.com.nanningcsxyapi.pojo;

import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/02/27
*/
@Data
public class ScoEventInfoStatis implements  ApiScoModel {
    private Integer fdid;

    private Integer eventInfoTotal;

    private String statisTime;

    private Date updatetime;
}