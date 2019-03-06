package ceinet.com.nanningcsxyapi.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/03/06
*/
@Data
public class ScoAreaCreditStatis  implements  ApiScoModel {
    @JSONField(serialize = false)
    private Integer fdid;

    private String areaName;

    private Integer creditEventTotal;

    private Integer creditRuleTotal;

    private String statisTime;
    @JSONField(serialize = false)
    private Date updatetime;
}