package com.avanade.artmachina.app.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.avanade.artmachina.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ArtworkFragment extends Fragment {


    public ArtworkFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_artwork, container, false);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

}
