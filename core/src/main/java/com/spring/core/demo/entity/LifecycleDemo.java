package com.spring.core.demo.entity;

import org.springframework.context.Lifecycle;

/**
 * 没理解怎么使用
 * @author zzp
 * @date 2020/7/8
 */
public class LifecycleDemo implements Lifecycle {
    @Override
    public void start() {
        System.out.println("监听spring容器start");
    }

    @Override
    public void stop() {
        System.out.println("监听spring容器stop");
    }

    @Override
    public boolean isRunning() {
        System.out.println("是否在运行");
        return false;
    }
}
