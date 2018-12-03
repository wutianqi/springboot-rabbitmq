package com.wutqi.a.direct;

import com.wutqi.b.fanout.FanoutProducer;
import com.wutqi.c.topic.TopicProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicExchangeTest {

    @Autowired
    private TopicProducer producer;

    @Test
    public void contextLoads() {
        producer.send("topicExchange message test", "apple.orange.apple");
        producer.send("topicExchange message test2", "lazy.apple");
    }

}
