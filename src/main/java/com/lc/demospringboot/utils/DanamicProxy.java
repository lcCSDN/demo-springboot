package com.lc.demospringboot.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: heys
 * @Date: 2021/5/5 21:25
 * @Descr: $
 */
public class DanamicProxy implements InvocationHandler {

    private Object object;

    public Object DanamicProxy(Object object){
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//        if(method.getName() == "SystemPerson"){
//
//        }

        System.out.println(method.getName()+" "+method.getDefaultValue());

        System.out.println(args[0]+"同学没有违反过校规");
        method.invoke(object,args);
        System.out.println("给"+args[0]+"发放奖学金");
        return null;
    }
    //
}
