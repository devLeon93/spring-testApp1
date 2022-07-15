package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    //private Music music;

    List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;


    public MusicPlayer() {
    }

    // IoC - Inversion of Control
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusicList(){
        for(Music m : musicList){
            System.out.println("Playing: " + m.getSong());
        }



    }


}
