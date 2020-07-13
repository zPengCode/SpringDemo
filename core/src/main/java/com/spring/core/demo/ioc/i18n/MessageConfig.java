package com.spring.core.demo.ioc.i18n;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zzp
 * @date 2020/7/13
 */
@Configuration
public class MessageConfig {

    @Bean
    public MessageSourceDemo getMessageSource(){
        return new MessageSourceDemo();
    }
}
