package com.spring.core.demo.spel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zzp
 * @date 2020/7/13
 */
@Configuration
@ImportResource("config/applicationContext.xml")
public class SpelDemo {

    @Bean
    public PropertyValueTestBean getPropertyValueTestBean() {
        return new PropertyValueTestBean();
    }
}
