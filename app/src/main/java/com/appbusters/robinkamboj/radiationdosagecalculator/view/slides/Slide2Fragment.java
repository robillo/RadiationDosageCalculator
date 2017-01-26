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
import com.appbusters.robinkamboj.radiationdosagecalculator.view.MythActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;


/**
 * A simple {@link Fragment} subclass.
 */
public class Slide2Fragment extends Fragment {

    ImageView imageView1;
    Button button;

    public Slide2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_slide2, container, false);

        button = (Button) v.findViewById(R.id.myths);
        imageView1 = (ImageView) v.findViewById(R.id.imageView1);
        Glide.with(getActivity())
                .load("https://1.bp.blogspot.com/-fFIRzYUgPCo/WIo5b5mn3HI/AAAAAAAAAEI/NkNQUJ4yRNoVKZAAO5uhRNHwZq7Hz8hrQCLcB/s1600/4.jpg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .crossFade()
                .centerCrop()
                .into(imageView1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), MythActivity.class);
                startActivity(i);
            }
        });

        return v;
    }

}
