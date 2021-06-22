package com.lc.demospringboot;

import com.lc.demospringboot.interfaces.PersonInterface;
import com.lc.demospringboot.serviceImpl.PersonInterfaceImpl;
import com.lc.demospringboot.utils.DanamicProxy;
import com.lc.demospringboot.utils.MyMethodterceptor;
import com.lc.demospringboot.vo.PersonPenter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.core.env.Environment;

import java.util.stream.Stream;

@SpringBootApplication
@MapperScan(basePackages = "com.lc.demospringboot.mapper;com.lc.demospringboot.login.mapper")
public class DemoSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringbootApplication.class, args);
        System.out.println("ssssssddd");
        int [] x = new int []{1,2};
//        PersonInterfaceImpl personInterfaceImpl = new PersonInterfaceImpl();
//
//        PersonInterface personProxy = (PersonInterface) new DanamicProxy().DanamicProxy(personInterfaceImpl);
//
//        personProxy.SystemPerson("王五");

//          cglib调用
//        Enhancer enhancer = new Enhancer();
//
//        //目标类class
//        enhancer.setSuperclass(PersonPenter.class);
//        //怎样去增强这个目标类，引入代理类即实现了methodInterceptor接口
//        enhancer.setCallback(new MyMethodterceptor());
//
//        //生成代理对象
//        PersonPenter personPenter =(PersonPenter) enhancer.create();

//        personPenter.OutPerson();

    }

}
