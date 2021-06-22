package com.lc.demospringboot.atomic;

import java.util.concurrent.*;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @Author: lichao
 * @Date: 2021/6/11 10:02
 * @Descr: $
 */
public class CountDownLatchDemo {
    //
    public static void main(String [] args) throws Exception{

        CountDownLatch countDownLatch =  new CountDownLatch(3);
        ExecutorService thread = MyThreadExecutors.getThreads();
        thread.execute(()->{
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println("Tom准备好了蛋糕！！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        });

        thread.execute(()->{
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println("Tom为蛋糕插上蜡烛！！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        });

        Task task = new Task();
        Future<Boolean> future = thread.submit(new FutureTask(task),false);
        System.out.println(future.get());

        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println("Tom叫来了Jerry！！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        }).start();

        countDownLatch.await();
        thread.shutdown();
        System.out.println("Jerry许愿吃蛋糕");
    }
}
