package com.wutqi.c.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 生产者
 */
@Component
public class TopicProducer {
    /**
     * 注入amqpTempalte发送消息
     */
    @Autowired
    public AmqpTemplate template;

    public void send(String message, String patternRoutingKey){
        template.convertAndSend("topicExchange",patternRoutingKey, message);
        System.out.println("TopicProducer send message " + message);
    }
}
