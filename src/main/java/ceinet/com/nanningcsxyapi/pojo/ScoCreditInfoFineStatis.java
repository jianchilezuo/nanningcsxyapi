package ceinet.com.nanningcsxyapi.pojo;

import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/02/27
*/
@Data
public class ScoCreditInfoFineStatis  implements  ApiScoModel {
    private Integer fdid;

    private String creditInfoClassify;

    private Double fineValue;

    private Double badnessValue;

    private String statisTime;

    private Date updatetime;
}