package ru.alishev.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {

    @PostConstruct
    public void doInit() {
        System.out.println("ClassicalMusic init");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("ClassicalMusic destroy");
    }

    @Override
    public String getSong() {
        return "some classical music";
    }
}
