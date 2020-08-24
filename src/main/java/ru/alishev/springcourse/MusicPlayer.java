package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic")Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(MusicStyle musicStyle) {

        if (musicStyle == MusicStyle.ROCK) {
            playRandomMusic(music1.getMusicList());
        } else if (musicStyle == MusicStyle.CLASSICAL) {
            playRandomMusic(music2.getMusicList());
        }

//        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }

    private void playRandomMusic(List<String> list) {
        System.out.println("Playing: " + list.get(new Random().nextInt(3)));
    }
}
