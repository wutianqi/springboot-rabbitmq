package com.wutqi.b.fanout;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 基础配置类
 */
@Configuration("fanoutRabbitConfig")
public class RabbitConfig {
    /**
     * 定义队列
     * @return
     */
    @Bean("fanoutBean")
    public Queue queue(){
        return new Queue("fanoutQueue",false,false,false);
    }

    /**
     * 定义队列2
     * @return
     */
    @Bean("fanoutBean2")
    public Queue queue2(){
        return new Queue("fanoutQueue2",false,false,false);
    }

    /**
     * 定义扇形交换机
     * @return
     */
    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanoutExchange",false,false);
    }

    /**
     * 定义交换机和队列之间的绑定关系
     * @return
     */
    @Bean("fanoutBind")
    public Binding binding(){
        return BindingBuilder.bind(queue()).to(fanoutExchange());
    }

    /**
     * 定义交换机和队列之间的绑定关系
     * @return
     */
    @Bean("fanoutBind2")
    public Binding binding2(){
        return BindingBuilder.bind(queue2()).to(fanoutExchange());
    }
}
