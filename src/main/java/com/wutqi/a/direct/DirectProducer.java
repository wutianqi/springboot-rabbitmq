package com.wutqi.a.direct;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 生产者
 */
@Component
public class DirectProducer {
    /**
     * 注入amqpTempalte发送消息
     */
    @Autowired
    public AmqpTemplate template;

    public void send(String message){
        template.convertAndSend("directExchange","directRoutingKey", message);
        System.out.println("Producer send message " + message);
    }
}
