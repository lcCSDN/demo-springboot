package com.lc.demospringboot.controller;

import com.lc.demospringboot.interfaces.ComsureService;
import com.lc.demospringboot.interfaces.PersonService;
import com.lc.demospringboot.utils.FruitInfoUtil;
import com.lc.demospringboot.utils.selectlist;
import com.lc.demospringboot.vo.Comsuer;
import com.lc.demospringboot.vo.ComsuerMore;
import com.lc.demospringboot.vo.Persons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * @Author: lichao
 * @Date: 2021/5/8 14:29
 * @Descr: $
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private ComsureService comsureService;

    @RequestMapping("/getPerson")
    public void getPerson(){

        Persons persons = personService.getPerson();
        System.out.println(persons);
    }

    @RequestMapping("/comsuer")
    public String getComsuer(){
       List<Comsuer> comsuerList =  comsureService.getComsuers();
        ComsuerMore comsuerMore = new ComsuerMore();
        Map<String,List<Comsuer>> map =  comsuerList.stream().collect(Collectors.groupingBy(Comsuer::getType));
        Comparator<Comsuer> comsuerComparator =  (Comparator<Comsuer>) Comparator.comparing(Comsuer::getType);
        Optional<Comsuer> optionalComsuer =  comsuerList.stream().collect(maxBy(comsuerComparator));
        System.out.println(optionalComsuer+"comparator比较最大值");
        Optional<Comsuer> minByComsuer = comsuerList.stream().collect(minBy(comsuerComparator));
        String nameString = comsuerList.stream().map(Comsuer::getName).collect(Collectors.joining(","));

        System.out.println(nameString+"join拼接");

        comsuerList.stream().forEach(comsuer ->{
            try {

                Field field = comsuer.getClass().getDeclaredField("type");
                field.setAccessible(true);
                System.out.println(field.get(comsuer)+"field.get()");
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        });

        System.out.println(minByComsuer+"comparator找出最小值");

        comsuerMore = (ComsuerMore) FruitInfoUtil.getFruitInfo(comsuerMore,comsuerList);

        System.out.println(comsuerMore+"输出结果");
        return "index";
    }

    private class T {
    }
    //
}
