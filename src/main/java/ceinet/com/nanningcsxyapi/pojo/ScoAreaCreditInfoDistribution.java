package ceinet.com.nanningcsxyapi.pojo;

import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/02/27
*/
@Data
public class ScoAreaCreditInfoDistribution implements  ApiScoModel {
    private Integer fdid;

    private String areaName;

    private Double govAffairsIntegrityEventScore;

    private Double govAffairsIntegrityRuleScore;

    private Double bizCreditEventScore;

    private Double bizCreditRuleScore;

    private Double societyIntegrityEventScore;

    private Double societyIntegrityRuleScore;

    private Double judicaturePublicTrustEventScore;

    private Double judicaturePublicTrustRuleScore;

    private String statisTime;

    private Date updatetime;
}