package ceinet.com.nanningcsxyapi;

import ceinet.com.nanningcsxyapi.mapper.ScoAreaCreditIndexStatisMapper;
import ceinet.com.nanningcsxyapi.pojo.ScoAreaCreditIndexStatis;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NanningcsxyapiApplicationTests {

    @Autowired
    private ScoAreaCreditIndexStatisMapper scoAreaCreditIndexStatisMapper;
    @Test
    public void contextLoads() {
    }

    @Test
    public  void  fun1(){
        ScoAreaCreditIndexStatis scoAreaCreditIndexStatis=new ScoAreaCreditIndexStatis();
        scoAreaCreditIndexStatis.setAreaName("test1");
        scoAreaCreditIndexStatis.setCreditIndex(1);
        scoAreaCreditIndexStatis.setRankValue(100d);
        scoAreaCreditIndexStatis.setStatisTime("201902");
        scoAreaCreditIndexStatis.setUpdatetime(new Date());
        scoAreaCreditIndexStatisMapper.insert(scoAreaCreditIndexStatis);
    }

    @Test
    public  void  fun2(){
        List<ScoAreaCreditIndexStatis> listByStatisTime = scoAreaCreditIndexStatisMapper.findListByStatisTime("201902");
        for (ScoAreaCreditIndexStatis scoAreaCreditIndexStatis : listByStatisTime) {
            System.out.println(scoAreaCreditIndexStatis.toString());
        }

    }
}
