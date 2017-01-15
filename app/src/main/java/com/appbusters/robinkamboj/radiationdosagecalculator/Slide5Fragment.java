package com.appbusters.robinkamboj.radiationdosagecalculator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;


/**
 * A simple {@link Fragment} subclass.
 */
public class Slide5Fragment extends Fragment {

    ImageView imageView1;

    public Slide5Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_slide5, container, false);

        imageView1 = (ImageView) v.findViewById(R.id.imageView1);
        Glide.with(getActivity())
                .load("https://3.bp.blogspot.com/-QT1mOHf8qQg/WDDBacKnM1I/AAAAAAAAAIo/kwjDcLOnY1kzCZwB_MLJHYzY3nLwuv3fQCK4B/s400/Self-Driving-Car-867x450.jpg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.placeholder)
                .crossFade()
                .fitCenter()
                .into(imageView1);

        return v;
    }

}
