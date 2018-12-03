package com.wutqi.c.topic;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 */
@Component
public class TopicConsumer {
    /**
     * 监听topicQueue队列中的消息
     * @param message
     */
    @RabbitListener(queues = "topicQueue")
    public void receiveQueue(String message){
        System.out.println("TopicConsumer receive message " + message + "from topicQueue");
    }

    /**
     * 监听fanoutQueue2中的消息
     * @param message
     */
    @RabbitListener(queues = "topicQueue2")
    public void receiveQueue2(String message){
        System.out.println("TopicConsumer receive message " + message + "from topicQueue2");
    }
}
