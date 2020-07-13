package com.spring.core.demo.ioc.anno;

/**
 * @author zzp
 * @date 2020/7/13
 */
public class SystemServiceC {

    private SystemServiceA systemServiceA;

    public SystemServiceC(SystemServiceA systemServiceA) {
        this.systemServiceA = systemServiceA;
    }

    @Override
    public String toString() {
        return "Bean SystemServiceC";
    }
}
