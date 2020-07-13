package com.spring.core.demo.ioc.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author zzp
 * @date 2020/7/13
 */
@Configuration
@PropertySource("config/config.properties")
public class AppPropertyConfig {

    @Autowired
    Environment environment;

    public boolean contain(String key){
        String s = environment.getProperty(key);
        System.out.println(s);
        return s != null;
    }

}
