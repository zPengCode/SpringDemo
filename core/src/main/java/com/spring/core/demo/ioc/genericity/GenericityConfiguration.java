package com.spring.core.demo.ioc.genericity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zzp
 * @date 2020/7/10
 */
@Configuration
public class GenericityConfiguration {

    @Bean
    public StringStore getStringStore(){
        return new StringStore();
    }

    @Bean
    public IntegerStore getIntegerStore(){
        return new IntegerStore();
    }
}
