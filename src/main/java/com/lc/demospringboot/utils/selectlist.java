package com.lc.demospringboot.utils;

import java.lang.annotation.*;

/**
 * @Author: lichao
 * @Date: 2021/5/11 10:20
 * @Descr: $
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface selectlist {
    String value() default "";
}
