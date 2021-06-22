package com.lc.demospringboot.atomic;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * @Author: lichao
 * @Date: 2021/6/11 10:48
 * @Descr: $
 */
public class CyclicBarrerDemo {
    //
    public static void main(String [] args){
        CyclicBarrier cyclicBarrier = new CyclicBarrier(6,()->{System.out.println(Thread.currentThread().getId()+"所有人到齐，开始吃饭");});

        for (int i=0;i<6; i++){

            int finalI = i;
            new Thread(()->{
                try {
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(Thread.currentThread().getId()+"第"+ finalI +"个同学到餐厅准备吃饭");
                    cyclicBarrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }
}
