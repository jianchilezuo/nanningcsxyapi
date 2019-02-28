package ceinet.com.nanningcsxyapi.pojo;

import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/02/27
*/
@Data
public class ScoAreaDishonestyEventStatis  implements  ApiScoModel{
    private Integer fdid;

    private String areaName;

    private Integer areaRank;

    private String industryName;

    private Integer industryRank;

    private String statisTime;

    private Date updatetime;
}