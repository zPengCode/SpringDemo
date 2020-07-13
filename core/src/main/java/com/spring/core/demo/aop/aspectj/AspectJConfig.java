package com.spring.core.demo.aop.aspectj;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zzp
 * @date 2020/7/13
 */
@Configuration
// 启动AspectJ功能。 xml文件：<aop:aspectj-autoproxy/>
@EnableAspectJAutoProxy
@ComponentScan("com.spring.core.demo.aop")
public class AspectJConfig {
}
