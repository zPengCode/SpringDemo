package com.spring.core.demo.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;

/**
 * @author zzp
 * @date 2020/7/14
 */
@Aspect
public class ConcurrentOperationExecutor implements Ordered {

    private static final int DEFAULT_MAX_RETRIES = 2;

    private int maxRetries = DEFAULT_MAX_RETRIES;

    private int order = 1;

    public int getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public int getOrder() {
        return order;
    }

    @Around("com.spring.core.demo.aop.aspectj.MethodAspect.point8()")
    public Object doConcurrentOperator(ProceedingJoinPoint joinPoint) throws Throwable {
        int currentAttempt = 0;
        Exception exception;
        do {
            currentAttempt++;
            try {
                return joinPoint.proceed();
            } catch (Exception e) {
                exception = e;
            }
        } while (currentAttempt < maxRetries);
        throw exception;
    }
}
