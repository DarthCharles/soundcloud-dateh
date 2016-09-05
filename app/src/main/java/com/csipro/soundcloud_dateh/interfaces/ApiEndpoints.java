package com.csipro.soundcloud_dateh.interfaces;

import com.csipro.soundcloud_dateh.models.Playlist;
import com.csipro.soundcloud_dateh.models.Track;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by Charles on 29/11/15.
 */

public interface ApiEndpoints {
    @GET("/tracks/{id}")
    Call<Track> getTrack(@Path("id") String id,
                         @Query("client_id") String client_id);

    @GET("/playlists/{id}")
    Call<Playlist> getPlaylist(@Path("id") String id,
                               @Query("client_id") String client_id);
}
