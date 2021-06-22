package com.lc.demospringboot.atomic;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @Author: lichao
 * @Date: 2021/6/11 09:51
 * @Descr: $
 */
public class semaphoreDemo {
    //
    public static void main(String [] args){

        Semaphore semaphore = new Semaphore(3);
        for (int i=0; i<6; i++){
            int finalI = i;
            new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println("第"+ finalI +"辆车占到车位");
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                    System.out.println("第"+finalI+"辆车停三秒后离开停车场");
                }
            }).start();
        }
    }
}
