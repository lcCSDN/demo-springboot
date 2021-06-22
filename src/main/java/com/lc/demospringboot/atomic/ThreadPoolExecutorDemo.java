package com.lc.demospringboot.atomic;

import java.util.concurrent.*;

/**
 * @Author: lichao
 * @Date: 2021/6/15 17:21
 * @Descr: $
 */
public class ThreadPoolExecutorDemo {

    public static void main(String [] args){
        ExecutorService thread = MyThreadExecutors.getThreads();
        try {
            for(int i=1;i<10;i++){
                thread.execute(()->System.out.println(Thread.currentThread().getName()+"办理业务"));
            }
            thread.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //
}
