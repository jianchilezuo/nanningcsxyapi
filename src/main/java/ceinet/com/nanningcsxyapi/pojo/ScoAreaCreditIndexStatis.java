package ceinet.com.nanningcsxyapi.pojo;

import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/02/27
*/
@Data
public class ScoAreaCreditIndexStatis implements    ApiScoModel {
    private Integer fdid;

    private String areaName;

    private Double rankValue;

    private Integer creditIndex;

    private String statisTime;

    private Date updatetime;


}