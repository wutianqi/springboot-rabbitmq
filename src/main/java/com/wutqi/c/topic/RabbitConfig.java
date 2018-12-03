package com.wutqi.c.topic;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 基础配置类
 */
@Configuration("topicRabbitConfig")
public class RabbitConfig {
    /**
     * 定义队列
     * @return
     */
    @Bean("topicBean")
    public Queue queue(){
        return new Queue("topicQueue",false,false,false);
    }

    /**
     * 定义队列2
     * @return
     */
    @Bean("topicBean2")
    public Queue queue2(){
        return new Queue("topicQueue2",false,false,false);
    }

    /**
     * 定义主题交换机
     * @return
     */
    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("topicExchange",false,false);
    }

    /**
     * 定义交换机和队列之间的绑定关系
     * @return
     */
    @Bean("topicBind")
    public Binding binding(){
        return BindingBuilder.bind(queue()).to(topicExchange()).with("*.orange.*");
    }

    /**
     * 定义交换机和队列之间的绑定关系
     * @return
     */
    @Bean("topicBind2")
    public Binding binding2(){
        return BindingBuilder.bind(queue2()).to(topicExchange()).with("lazy.#");
    }
}
