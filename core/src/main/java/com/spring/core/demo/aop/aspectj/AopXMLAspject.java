package com.spring.core.demo.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author zzp
 * @date 2020/7/14
 */
public class AopXMLAspject {

    public void before(ProceedingJoinPoint joinPoint){
        System.out.println("joinPoint = " + joinPoint);
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("around == before");
        Object retVal = joinPoint.proceed();
        System.out.println("around == after");
        return retVal;
    }
}
