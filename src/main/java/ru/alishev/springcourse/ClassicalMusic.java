package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @Override
    public List<String> getMusicList() {
        return Arrays.asList("Vivaldi","Beethoven","Choppen");
    }
}
