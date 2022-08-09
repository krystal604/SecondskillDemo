package com.example.webapp.RateLimiter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//服务限流
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RateLimiterAnnotation {
    /**
     * 限流服务名
     *
     * @return
     */
    String name();

    /**
     * 每秒限流次数
     *
     * @return
     */
    double count();
}
