package com.wutqi.b.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 */
@Component
public class FanoutConsumer {
    /**
     * 监听fanoutQueue队列中的消息
     * @param message
     */
    @RabbitListener(queues = "fanoutQueue")
    public void receiveQueue(String message){
        System.out.println("FanoutConsumer receive message " + message + "from fanoutQueue");
    }

    /**
     * 监听fanoutQueue2中的消息
     * @param message
     */
    @RabbitListener(queues = "fanoutQueue2")
    public void receiveQueue2(String message){
        System.out.println("FanoutConsumer receive message " + message + "from fanoutQueue2");
    }
}
