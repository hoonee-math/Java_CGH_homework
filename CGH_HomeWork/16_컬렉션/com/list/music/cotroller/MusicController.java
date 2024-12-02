package com.list.music.cotroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.list.music.model.vo.Music;

public class MusicController {
	List<Music> list = new ArrayList<Music>();
	public int addList(Music music) {
		list.add(music);
		return 1;
	}
	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}
	public List printAll() {
		return list;
	}
	public Music searchMusic(String title) {
		for(Music music : list) {
			if(music.getTitle().equals(title)) {
				return music;
			}
		}
		return null;
	}
	public Music removeMusic(String title) {
		for(Music music : list) {
			if(music.getTitle().equals(title)) {
				Music removedMusic = music;
				list.remove(music);
				return removedMusic;
			}
		}
		return null;
	}
	public Music setMusic(String title, Music music) {
		
	}
	public int descSinger() {
		
	}
}
