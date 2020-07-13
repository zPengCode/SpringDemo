package com.spring.core.demo.ioc.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zzp
 * @date 2020/7/13
 */
@Configuration
public class SystemConfig {

    @Bean("systemServiceA1")
    public SystemServiceA getSystemServiceA1(SystemServiceB systemServiceB){
        System.out.println("getSystemServiceA1");
        return new SystemServiceA(systemServiceB);
    }

    @Bean("systemServiceA2")
    public SystemServiceA getSystemServiceA2(){
        System.out.println("getSystemServiceA2");
        // 同理与参数形式，再次获取SystemServiceB没有产生新的实例
        return new SystemServiceA(getSystemServiceB());
    }


    @Bean
    public SystemServiceB getSystemServiceB(){
        System.out.println("getSystemServiceB");
        return new SystemServiceB();
    }
}
