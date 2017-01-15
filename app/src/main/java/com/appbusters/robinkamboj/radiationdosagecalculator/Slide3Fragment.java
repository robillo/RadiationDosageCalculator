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
public class Slide3Fragment extends Fragment {

    ImageView imageView1;

    public Slide3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_slide3, container, false);

        imageView1 = (ImageView) v.findViewById(R.id.imageView1);
        Glide.with(getActivity().getApplicationContext())
                .load("http://hd.wallpaperswide.com/thumbs/safe_deposit_box_2-t2.jpg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.placeholder)
                .crossFade()
                .centerCrop()
                .into(imageView1);

        return v;
    }

}
