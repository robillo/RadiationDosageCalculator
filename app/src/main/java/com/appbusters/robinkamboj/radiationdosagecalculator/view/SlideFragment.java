package com.appbusters.robinkamboj.radiationdosagecalculator.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.appbusters.robinkamboj.radiationdosagecalculator.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;


/**
 * A simple {@link Fragment} subclass.
 */
public class SlideFragment extends Fragment {

    ImageView imageView1;

    public SlideFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_slide, container, false);

        imageView1 = (ImageView) v.findViewById(R.id.imageView1);
        Glide.with(this)
                .load("http://wallpapercave.com/wp/e1jWmMP.png")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .crossFade()
                .centerCrop()
                .into(imageView1);

        return v;
    }

}
