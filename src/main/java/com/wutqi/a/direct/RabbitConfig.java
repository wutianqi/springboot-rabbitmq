package com.wutqi.a.direct;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 基础配置类
 */
@Configuration("directRabbitConfig")
public class RabbitConfig {
    /**
     * 定义队列
     * @return
     */
    @Bean
    public Queue queue(){
        return new Queue("directQueue",false,false,false);
    }

    /**
     * 定义直连交换机
     * @return
     */
    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("directExchange",false,false);
    }

    /**
     * 定义交换机和队列之间的绑定关系
     * @return
     */
    @Bean
    public Binding binding(){
        return BindingBuilder.bind(queue()).to(directExchange()).with("directRoutingKey");
    }
}
