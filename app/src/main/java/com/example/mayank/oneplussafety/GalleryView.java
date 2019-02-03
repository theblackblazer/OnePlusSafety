package com.example.mayank.oneplussafety;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mayank.oneplussafety.R;

/**
 * Created by ishu on 6/3/2016.
 */
public class GalleryView extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.content_navigation_complaint,null);
    }
}
