package com.spring.core.demo.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author zzp
 * @date 2020/7/13
 */
public class PropertyValueTestBean {

    @Value("${spring.demo.param1}")
    private String param;

    @Override
    public String toString() {
        ExpressionParser parser = new SpelExpressionParser();
        System.out.println( "====> "  + parser.parseExpression("#this").getValue());
        return param;
    }
}
