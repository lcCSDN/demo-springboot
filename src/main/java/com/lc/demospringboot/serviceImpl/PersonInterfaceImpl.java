package com.lc.demospringboot.serviceImpl;

import com.lc.demospringboot.interfaces.PersonInterface;
import org.springframework.stereotype.Component;

/**
 * @Author: heys
 * @Date: 2021/5/5 18:40
 * @Descr: $
 */

@Component
public class PersonInterfaceImpl implements PersonInterface {


    @Override
    public void SystemPerson(String name) {
        System.out.println("该同学成绩优异获取奖学金"+name);
    }

}
