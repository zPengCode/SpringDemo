package com.spring.core.demo.type;

/**
 * @author zzp
 * @date 2020/7/13
 */
public class DependOnExoticType {

    private ExoticType exoticType;

    public void setExoticType(ExoticType exoticType) {
        this.exoticType = exoticType;
    }

    public ExoticType getExoticType() {
        return exoticType;
    }

    @Override
    public String toString() {
        return "DependOnExoticType{" +
                "exoticType=" + exoticType +
                '}';
    }
}
