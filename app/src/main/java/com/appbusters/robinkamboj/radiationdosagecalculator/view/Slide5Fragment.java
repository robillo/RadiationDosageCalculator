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
        Glide.with(getContext())
                .load("http://www.walldevil.com/wallpapers/a54/radiation-creature-mask.jpg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.placeholder)
                .crossFade()
                .centerCrop()
                .into(imageView1);

        return v;
    }

}
