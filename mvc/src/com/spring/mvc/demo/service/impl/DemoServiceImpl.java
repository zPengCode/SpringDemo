package com.spring.mvc.demo.service.impl;

import com.spring.mvc.demo.service.IDemoService;

public class DemoServiceImpl implements IDemoService {
    @Override
    public String getDemoString() {
        return "hello world";
    }
}
