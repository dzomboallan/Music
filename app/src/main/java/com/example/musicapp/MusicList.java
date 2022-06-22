package com.example.musicapp;

import android.net.Uri;

public class MusicList {

    private String artis, title, duration;
    private boolean isPlaying;
    private Uri musicFile;

    public MusicList(String artis, String title, String duration, boolean isPlaying, Uri musicFile) {
        this.artis = artis;
        this.title = title;
        this.duration = duration;
        this.isPlaying = isPlaying;
        this.musicFile = musicFile;
    }

    public String getArtis() {
        return artis;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public Uri getMusicFile() {
        return musicFile;
    }

    public void setMusicFile(Uri musicFile) {
        this.musicFile = musicFile;
    }
}
