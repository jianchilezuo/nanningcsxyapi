package ceinet.com.nanningcsxyapi.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/02/27
*/
@Data
public class ScoRuleInfoStatis  implements  ApiScoModel {
    @JSONField(serialize = false)
    private Integer fdid;

    private Integer ruleInfoTotal;

    private String statisTime;
    @JSONField(serialize = false)
    private Date updatetime;
}