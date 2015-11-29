package com.csipro.soundcloud_dateh.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Charles on 27/11/15.
 */
public class Playlist {
    int id;
    String title;
    List<Track> tracks = new ArrayList<>();

    public Playlist(int id, String title, List<Track> tracks) {
        this.id = id;
        this.title = title;
        this.tracks = tracks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
}
