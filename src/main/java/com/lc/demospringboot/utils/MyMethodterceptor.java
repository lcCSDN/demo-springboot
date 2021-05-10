package com.lc.demospringboot.utils;



import com.lc.demospringboot.vo.Person;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: heys
 * @Date: 2021/5/6 18:19
 * @Descr: $
 */
@Component
public class MyMethodterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("method"+method.getName());

        System.out.println("objects"+objects);
        Object object = methodProxy.invokeSuper(o,objects);

        Person[] arr = {new Person("陈奕迅",40),
                new Person("钟汉良",39),
                new Person("杨千嬅",38)};


        //对年龄进行排序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        Arrays.sort(arr,( p1, p2)-> p1.getAge()-p2.getAge()
        );


        System.out.println("cglib增强");
        return object;
    }



    //
}
