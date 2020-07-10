package com.spring.core.demo;

import org.springframework.context.ApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        ApplicationContext context =
                ContextLoader.load();

    }
}
