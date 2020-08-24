package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doInit() {
        System.out.println("my init");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("my destroy");
    }

    @Override
    public String getSong() {
        return "some classical music";
    }
}
