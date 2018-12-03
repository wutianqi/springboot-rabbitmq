package com.wutqi.a.direct;

import com.wutqi.b.fanout.FanoutProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FanoutExchangeTest {

    @Autowired
    private FanoutProducer producer;

    @Test
    public void contextLoads() {
        producer.send("fanoutExchange message test");
    }

}
