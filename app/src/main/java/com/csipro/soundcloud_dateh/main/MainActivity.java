package com.csipro.soundcloud_dateh.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.csipro.soundcloud_dateh.R;
import com.csipro.soundcloud_dateh.interfaces.ApiEndpoints;
import com.csipro.soundcloud_dateh.models.Playlist;
import com.csipro.soundcloud_dateh.models.Track;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = " http://api.soundcloud.com";
    public static final String CLIENT_ID = "7e2cdc554af905789da2068bca36a1cd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiEndpoints api = retrofit.create(ApiEndpoints.class);

        Call<Playlist> call = api.getPlaylist("126991575", CLIENT_ID);
        call.enqueue(new Callback<Playlist>() {
            @Override
            public void onResponse(Response<Playlist> response, Retrofit retrofit) {
                Playlist track = response.body();
                System.out.println("Playlist_id:" + track.getId());
                System.out.println("Playlist title:" + track.getTitle());
                for (Track a : track.getTracks()) {
                    System.out.println(a.getTitle());
                    System.out.println(a.getGenre());
                }
            }

            @Override
            public void onFailure(Throwable t) {
                // Log error here since request failed
            }
        });

    }
}
