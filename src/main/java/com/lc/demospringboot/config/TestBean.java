package com.lc.demospringboot.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Author: lichao
 * @Date: 2021/6/20 12:30
 * @Descr: $
 */
public class TestBean implements BeanNameAware, BeanFactoryAware, InitializingBean {

    private String name;
    @Override
    public void setBeanName(String name) {
        System.out.println("注入属性name");
        this.name = name;
    }
    //

    public void myInit(){
        System.out.println("【init-method】调用bean的init-method方法");
    }

    public void myDestory(){
        System.out.println("destory-method方法");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
