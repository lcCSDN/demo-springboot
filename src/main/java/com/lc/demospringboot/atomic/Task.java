package com.lc.demospringboot.atomic;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @Author: lichao
 * @Date: 2021/6/16 14:37
 * @Descr: $
 */
public class Task implements Callable {
    @Override
    public Boolean call() throws Exception {
        System.out.println("Tom想偷吃蛋糕，最后他偷吃了吗？？");
        TimeUnit.SECONDS.sleep(3);
        return false;
    }
    //
}
