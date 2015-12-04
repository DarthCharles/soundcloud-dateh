package com.csipro.soundcloud_dateh.main;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.csipro.soundcloud_dateh.R;

/**
 * Created by Charles on 29/11/15.
 */
public class PlayerFragment extends Fragment {
    TextView SongName, ArtistName;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.player_fragment, container, false);
        SongName = (TextView) rootView.findViewById(R.id.song_name);

        ArtistName = (TextView) rootView.findViewById(R.id.artist_name);

        return rootView;
    }

    public void startPlaying(String track) {
        SongName.setText(track);
        SongName.setSelected(true);
    }
}
