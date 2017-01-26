package com.appbusters.robinkamboj.radiationdosagecalculator.view.slides;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.appbusters.robinkamboj.radiationdosagecalculator.R;
import com.appbusters.robinkamboj.radiationdosagecalculator.view.AccidentsActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;


/**
 * A simple {@link Fragment} subclass.
 */
public class Slide3Fragment extends Fragment {

    ImageView imageView1;
    Button button;

    public Slide3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_slide3, container, false);

        button = (Button) v.findViewById(R.id.precautions);
        imageView1 = (ImageView) v.findViewById(R.id.imageView1);
        Glide.with(getActivity().getApplicationContext())
                .load("https://4.bp.blogspot.com/-PQ2dFPxs6dA/WIo5arONKII/AAAAAAAAAD8/_KPNyZuSY0IOhtZf7h2ByJWd7xvWZMjZgCLcB/s1600/3.jpg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .crossFade()
                .centerCrop()
                .into(imageView1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), AccidentsActivity.class);
                startActivity(i);
            }
        });

        return v;
    }

}
