package com.lc.demospringboot.rabbitmq;


import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * @Author: lichao
 * @Date: 2021/5/13 15:36
 * @Descr: $
 */
public class rabbitMqComsuer {
    //
    public static void main(String[] args) throws Exception{
        Connection connection = rabbitMqUtils.getConnection();

        Channel channel = connection.createChannel();
//        参数1:队列名称
//        参数2:durable 队列是否持久化
//        参数3:exclvise 是否通道独占队列
//        参数4:autoDelect消息消费完是否自动关闭队列
//        参数5:额外附加参数
        channel.queueDeclare("hello",false,false,false,null);

        //参数1：消费队列名
//        参数2：开启消息的自动确认机制
//        参数3：消费消息的回调接口
        channel.basicConsume("hello",true,new DefaultConsumer(channel){
            @Override
            //最后一个参数，从消息队列中取出消息
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
//                super.handleDelivery(consumerTag, envelope, properties, body);
                System.out.println("==============="+new String(body));
            }
        });

//        消费者一般不关闭，一直监听消息队列
//        rabbitMqUtils.shutDown(channel,connection);
    }
}
