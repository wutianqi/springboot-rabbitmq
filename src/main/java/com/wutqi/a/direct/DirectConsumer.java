package com.wutqi.a.direct;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 */
@Component
public class DirectConsumer {
    /**
     * 监听directQueue中的消息
     * @param message
     */
    @RabbitListener(queues = "directQueue")
    public void receive(String message){
        System.out.println("DirectConsumer receive message " + message);
    }
}
