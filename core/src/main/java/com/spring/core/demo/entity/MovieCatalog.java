package com.spring.core.demo.entity;

/**
 * @author zzp
 * @date 2020/7/8
 */
public class MovieCatalog {

    private String type;

    public MovieCatalog() {
    }

    public MovieCatalog(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return type + ": " + "MovieCatalog";
    }
}
