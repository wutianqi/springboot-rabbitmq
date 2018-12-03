package com.wutqi.b.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 生产者
 */
@Component
public class FanoutProducer {
    /**
     * 注入amqpTempalte发送消息
     */
    @Autowired
    public AmqpTemplate template;

    public void send(String message){
        template.convertAndSend("fanoutExchange","", message);
        System.out.println("FanoutProducer send message " + message);
    }
}
