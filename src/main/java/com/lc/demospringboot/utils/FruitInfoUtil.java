package com.lc.demospringboot.utils;

import com.lc.demospringboot.vo.Comsuer;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: lichao
 * @Date: 2021/5/11 11:26
 * @Descr: 注解解析器
 */
public class FruitInfoUtil {
    public static Object getFruitInfo(Object object, List<Comsuer> comsuerList){

        Field[] fields = object.getClass().getDeclaredFields();

        //对数据进行分组
        Map<String,List<Comsuer>> map = comsuerList.stream().collect(Collectors.groupingBy(Comsuer::getType));

        Map<String,String> map5 =  comsuerList.stream().collect(Collectors.toMap(Comsuer::getId,Comsuer::getName,(n1,n2)->n1));
         System.out.println(map5+"list转map");


        Arrays.stream(fields).forEach(field -> {
            //获取到添加了selectlist注解的字段
            if(field.isAnnotationPresent(selectlist.class)){
                selectlist listAnnotation = field.getAnnotation(selectlist.class);
                String value =  listAnnotation.value();

                //获取到value上对应分组的list
                List<Comsuer> list = map.get(value);
                field.setAccessible(true);
                try {
                    field.set(object,list);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
        return object;
    }
    //
}
