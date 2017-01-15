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
public class Slide4Fragment extends Fragment {

    ImageView imageView1;

    public Slide4Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_slide4, container, false);

        imageView1 = (ImageView) v.findViewById(R.id.imageView1);
        Glide.with(getActivity())
                .load("http://www.healthywealthywonderful.com/wp-content/uploads/2014/12/HWW-Slide6.jpg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.placeholder)
                .crossFade()
                .centerCrop()
                .into(imageView1);

        return v;
    }

}
