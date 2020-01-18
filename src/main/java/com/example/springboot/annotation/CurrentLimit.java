package com.example.springboot.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author harryleng
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CurrentLimit {

    /**
     * 请求次数
     *
     * @return
     */
    int number();

    /**
     * 时间限制
     *
     * @return
     */
    long time();
}
