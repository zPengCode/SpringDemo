package com.spring.core.demo.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author zzp
 * @date 2020/7/8
 */
public class QualifierDemo {

    @Autowired
//    @Qualifier("first")
    @Qualifier("second")
    private MovieCatalog movieCatalog;

    @Override
    public String toString() {
        return movieCatalog.toString();
    }
}
