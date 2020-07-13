package com.spring.core.demo.ioc.anno;

/**
 * @author zzp
 * @date 2020/7/13
 */
public class SystemServiceA {
    private SystemServiceB systemServiceB;

    public SystemServiceA(SystemServiceB systemServiceB) {
        this.systemServiceB = systemServiceB;
    }

    @Override
    public String toString() {
        return "Bean SystemServiceA";
    }
}
