package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
	List<Music> list;

	public MusicPlayer(List<Music> list) {
		this.list = list;
	}

	@Value("${musicPlayer.name}")
	private String name;

	@Value("${musicPlayer.volume}")
	private int volume;

	public String getName() {
		return name;
	}

	public int getVolume() {
		return volume;
	}

	public String playMusic() {
		return "Playing: " + list.get(new Random().nextInt(list.size())).getSong();
	}
}
