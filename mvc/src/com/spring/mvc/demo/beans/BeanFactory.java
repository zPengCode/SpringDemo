package com.spring.mvc.demo.beans;

import com.spring.mvc.demo.service.IDemoService;
import com.spring.mvc.demo.service.impl.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class BeanFactory {

    @Bean
    public IDemoService getDemoService(){
        return new DemoServiceImpl();
    }
}
