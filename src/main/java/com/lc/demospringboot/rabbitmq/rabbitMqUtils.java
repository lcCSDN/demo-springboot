package com.lc.demospringboot.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Author: lichao
 * @Date: 2021/5/13 15:24
 * @Descr: $
 */
public class rabbitMqUtils {

    //获取connection连接
    public static Connection getConnection(){

        try {
            ConnectionFactory connectionFactory = new ConnectionFactory();
            connectionFactory.setHost("127.0.0.1");
            connectionFactory.setPort(8083);
            connectionFactory.setVirtualHost("/ems");
            connectionFactory.setUsername("ems");
            connectionFactory.setPassword("123");

            Connection connection =  connectionFactory.newConnection();

            return  connection;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        return null;
    }

    //关闭connection和channel连接

    public static void shutDown(Channel channel,Connection connection){

        try {
            if(channel != null) channel.close();
            if(connection != null) connection.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

    }
}
