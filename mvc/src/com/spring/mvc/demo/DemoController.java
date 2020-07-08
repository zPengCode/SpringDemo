package com.spring.mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/test01")
    public String test01(){
        return "hello world";
    }
}
