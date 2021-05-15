package com.lc.demospringboot.rabbitmq;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Author: lichao
 * @Date: 2021/5/13 14:07
 * @Descr: $
 */
public class provider {


    //RabbitMQ server生产消息
    @Test
    public void testSendMessage() throws IOException, TimeoutException{
        //创建连接rabbitMQ的连接工厂
        ConnectionFactory connectionFactory = new ConnectionFactory();
        //设置连接mq主机
        connectionFactory.setHost("127.0.0.1");
        //设置连接主机端口
        connectionFactory.setPort(8083);
        //设置连接虚拟主机
        connectionFactory.setVirtualHost("/ems");
        //设置访问虚拟主机的用户和密码
        connectionFactory.setUsername("ems");
        connectionFactory.setPassword("124");

        //获取连接对象
        Connection connection =  connectionFactory.newConnection();

        //获取连接通道
        Channel channel = connection.createChannel();

        //通道绑定对应的消息队列
        channel.queueDeclare("hello",false,false,false,null);

        //将消息放入队列中
        channel.basicPublish("","hello",null,"hello".getBytes());

        channel.close();
        connection.close();
    }
}
