package com.example.webapp.RateLimiter;

import com.google.common.util.concurrent.RateLimiter;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Aspect
@Component
public class RateLimiterAnnotationAspect {

    private ConcurrentMap<String, RateLimiter> rateLimiterMap = new ConcurrentHashMap<>();

    /**
     * Before.
     *
     * @param point the point
     */
    @Before("@annotation(com.example.webapp.RateLimiter.RateLimiterAnnotation)")
    public void before(JoinPoint point) {
        RateLimiterAnnotation rateLimiterAnnotation = this.getAnnotation(point, RateLimiterAnnotation.class);
        double rateLimitCount = rateLimiterAnnotation.count();
        String rateLimitName = rateLimiterAnnotation.name();
        if (rateLimiterMap.get(rateLimitName) == null) {
            rateLimiterMap.put(rateLimitName, RateLimiter.create(rateLimitCount));
        }
        rateLimiterMap.get(rateLimitName).acquire();
    }

    private <T extends Annotation> T getAnnotation(JoinPoint pjp, Class<T> clazz) {
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod();
        return method.getAnnotation(clazz);
    }
}
