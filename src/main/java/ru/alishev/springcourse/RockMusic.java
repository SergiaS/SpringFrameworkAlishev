package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    @Override
    public List<String> getMusicList() {
        return Arrays.asList("Metallica","Stratovarius","Therion");
    }
}
