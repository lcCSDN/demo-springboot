package com.lc.demospringboot.atomic;

import java.util.Objects;
import java.util.concurrent.*;

/**
 * @Author: lichao
 * @Date: 2021/6/16 11:04
 * @Descr: $
 */
public class MyThreadExecutors {
    private volatile static ThreadPoolExecutor executorService;
    private MyThreadExecutors(){}
    //
    public static ExecutorService getThreads(){
        if(executorService == null){
            synchronized (MyThreadExecutors.class){
                if(executorService ==null){
                    executorService = new ThreadPoolExecutor(
                            2,
                            5,
                            1L,
                            TimeUnit.SECONDS,
                            new LinkedBlockingDeque<>(3),
                            Executors.defaultThreadFactory(),
                            new ThreadPoolExecutor.DiscardPolicy());
                }
            }
        }

        return executorService;
    }
}
