package com.lc.demospringboot;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: lichao
 * @Date: 2021/5/7 13:34
 * @Descr: $
 */
public class StreamTest {

    public static void main(String[] args){
        List<String> list = new ArrayList<String>();

        list.add("张三");
        list.add("李四");
        list.add("李斯");
        list.add("王五");

        list.stream().forEach(s -> {
          if(s.equals("张三")){
              System.out.println(s);
          }
        });

        list.forEach(s -> System.out.println(s+"list"));

        Map map = new HashMap(7);

        map.put("l","李四");
        map.put("l2","莉丝");
        map.put("z","张三");


        Stream map1 = map.entrySet().stream();
//        Stream map2 = map1.filter(s2->s2.containsKey("l"));

        Stream<String> map2 = map.keySet().stream();

        map2.forEach(s->System.out.println(s+"key"));

        map.values().stream().forEach(s->System.out.println(s+"value"));

         map1.forEach(s ->System.out.println(s+"entry"));

        Stream<String> stream = Stream.of("1", "2", "3");
        Stream<Integer> integerStream = stream.map(str -> Integer.parseInt(str));
        integerStream.forEach(i-> System.out.println(i+"排序"));

        Stream list1 =  list.stream().filter(s -> s.equals("李四"));
        list1.forEach(s2 -> System.out.println(s2));

        List<String> list2 = new ArrayList<>();
        list.add("aaa bbb ccc");
        list.add("ddd eee fff");
        list.add("ggg hhh iii");

        Boolean b = list.stream().anyMatch(s->s.equals("ddd"));

        list = list.stream().map(s -> s.split(" ")).flatMap(Arrays::stream).collect(Collectors.toList());


        long l =  list.stream().count();
        System.out.println(list+"list999");

        String s = "sss";
        s.valueOf(1);
        System.out.println(s.equals("1")+"999");
    }

    //

    public static void get(String... num){

    }

    class Liest implements Cloneable{}
}


