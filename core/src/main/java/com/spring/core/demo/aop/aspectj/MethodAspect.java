package com.spring.core.demo.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author zzp
 * @date 2020/7/13
 */
@Aspect
public class MethodAspect {

    /**
     * 方法匹配比如 public String package.method(String)
     */
    @Pointcut("execution(* *(..))")
    public void methodPoint(){}

    /**
     * 限定某个类型或者某个包下的类型
     */
    @Pointcut("within(com.spring.core.demo.aop..*)")
    public void point2(){}

    /**
     * 如果要代理的类没有实现某个接口，spring将使用cglib进行代理，使用this
     */
    @Pointcut("this(com.spring.core.demo.ioc.QualifierDemo)")
    public void point3(){}

    /**
     * 如果要代理的类实现某个接口，spring将使用动态代理，使用target
     */
    @Pointcut("target(com.spring.core.demo.ioc.genericity.IntegerStore)")
    public void point4(){}

    /**
     * 切点匹配包含指定注解的类
     */
    @Pointcut("@target(org.springframework.stereotype.Service)")
    public void point5(){}

    /**
     * 连接点包含指定注解的参数
     */
    @Pointcut("@args(com.spring.core.demo.ioc.anno.Entity)")
    public void point6(){}

    /**
     * 匹配某个连接点的包含指定的注解的类 等效于：
     * @Pointcut("within(@org.springframework.stereotype.Repository *)")
     */
    @Pointcut("@within(org.springframework.stereotype.Repository)")
    public void point7(){}

    /**
     * 匹配包含指定注解的连接点
     */
    @Pointcut("@annotation(com.spring.core.demo.ioc.anno.Log)")
    public void point8(){}

    /**
     * 切点表达式结合
     * @param joinPoint 切点
     */
    @Before("point8() && point5()")
    public void serviceLog(JoinPoint joinPoint){

    }

    @After("point8()")
    public void after(JoinPoint joinPoint){

    }
}
