package com.lc.demospringboot.utils.annotation;

import java.lang.annotation.*;

/**
 * @Author: lichao
 * @Date: 2021/5/12 16:05
 * @Descr: $
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
@Documented
public @interface userNoNull {
    String name() default "";



}
