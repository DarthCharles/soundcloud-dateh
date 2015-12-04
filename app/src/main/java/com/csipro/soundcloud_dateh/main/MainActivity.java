package com.csipro.soundcloud_dateh.main;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.csipro.soundcloud_dateh.R;

public class MainActivity extends AppCompatActivity implements PlaylistFragment.OnTrackSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void PlayTrack(String track) {
        PlayerFragment player = (PlayerFragment) getFragmentManager().findFragmentById(R.id.player);
        player.startPlaying(track);
    }
}
