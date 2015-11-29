package com.csipro.soundcloud_dateh.main;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.csipro.soundcloud_dateh.R;
import com.csipro.soundcloud_dateh.interfaces.ApiEndpoints;
import com.csipro.soundcloud_dateh.models.Playlist;
import com.csipro.soundcloud_dateh.models.Track;

import java.util.ArrayList;
import java.util.Arrays;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by Charles on 29/11/15.
 */
public class PlaylistFragment extends Fragment {

    public static final String BASE_URL = " http://api.soundcloud.com";
    public static final String CLIENT_ID = "7e2cdc554af905789da2068bca36a1cd";
    ListView PlaylistListView;
    ArrayList<String> Playlist;
    private ArrayAdapter<String> adapter;

    public PlaylistFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.playlist_fragment, container, false);

        // Find the ListView resource.
        PlaylistListView = (ListView) rootView.findViewById(R.id.listView);
        Playlist = new ArrayList<>();

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

                //TODO temporal, just to get a visible playlist inside the application
                for (Track a : track.getTracks()) {
                    Playlist.add(a.getTitle());
                }

                adapter = new ArrayAdapter<String>(rootView.getContext(),
                        android.R.layout.simple_list_item_1,
                        android.R.id.text1,
                        Playlist);

                PlaylistListView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Throwable t) {
                // TODO throw error message
            }
        });


        return rootView;
    }
}
