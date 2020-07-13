package com.spring.core.demo.ioc.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/**
 * @author zzp
 * @date 2020/7/13
 */
public class MessageSourceDemo {

    @Autowired
    private MessageSource messageSource;


    public void println(){
        String message = messageSource.getMessage("spring.demo.message.say_hello",new Object[]{"张"}, Locale.CHINA);
        System.out.println(message);
        System.out.println(new String(message.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8));
    }
}
