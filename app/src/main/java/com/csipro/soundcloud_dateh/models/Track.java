package com.csipro.soundcloud_dateh.models;

/**
 * Created by Charles on 26/11/15.
 */
public class Track {
    int id;
    String title, genre, artwork_url, stream_url;

    public Track(int id, String title, String genre, String stream_url) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.artwork_url = stream_url;
        this.stream_url = stream_url;
    }

    public int getId() {
        return id;
    }

    public String getArtwork_url() {
        return artwork_url;
    }

    public void setArtwork_url(String artwork_url) {
        this.artwork_url = artwork_url;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStream_url() {
        return stream_url;
    }

    public void setStream_url(String stream_url) {
        this.stream_url = stream_url;
    }
}
