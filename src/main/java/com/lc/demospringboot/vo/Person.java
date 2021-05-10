package com.lc.demospringboot.vo;

import lombok.Data;

/**
 * @Author: heys
 * @Date: 2021/5/7 10:47
 * @Descr: $
 */
@Data
public class Person {

    private String id;

    private String name;

    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }


    //
}
