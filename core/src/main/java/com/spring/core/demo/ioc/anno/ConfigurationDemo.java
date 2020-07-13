package com.spring.core.demo.ioc.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author zzp
 * @date 2020/7/13
 */
@Configuration
@Import({SystemConfig.class})
public class ConfigurationDemo {

    @Bean
    public SystemServiceC getSystemServiceC(@Qualifier("systemServiceA1") SystemServiceA systemServiceA){
        System.out.println("getSystemServiceC");
        return new SystemServiceC(systemServiceA);
    }
}
