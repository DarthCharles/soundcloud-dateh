package com.csipro.soundcloud_dateh.main;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.csipro.soundcloud_dateh.R;

/**
 * Created by Charles on 29/11/15.
 */
public class PlayerFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.player_fragment, container, false);
        return rootView;
    }
}
