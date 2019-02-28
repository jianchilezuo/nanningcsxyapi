package ceinet.com.nanningcsxyapi.pojo;

import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/02/27
*/
@Data
public class ScoRuleInfoStatis  implements  ApiScoModel {
    private Integer fdid;

    private Integer ruleInfoTotal;

    private String statisTime;

    private Date updatetime;
}