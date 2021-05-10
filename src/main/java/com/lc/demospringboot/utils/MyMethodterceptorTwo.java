package com.lc.demospringboot.utils;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Author: lichao
 * @Date: 2021/5/7 16:55
 * @Descr: $
 */
public class MyMethodterceptorTwo implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("运行前增强");
        Object object = methodInvocation.proceed();
        return object;
    }
    //
}
