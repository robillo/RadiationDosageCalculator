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
import com.appbusters.robinkamboj.radiationdosagecalculator.view.CalculateActivity;
import com.appbusters.robinkamboj.radiationdosagecalculator.view.RecoveryActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;


/**
 * A simple {@link Fragment} subclass.
 */
public class Slide4Fragment extends Fragment {

    ImageView imageView1;
    Button button;

    public Slide4Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_slide4, container, false);

        button = (Button) v.findViewById(R.id.recovery);
        imageView1 = (ImageView) v.findViewById(R.id.imageView1);
        Glide.with(getActivity())
                .load("http://www.healthywealthywonderful.com/wp-content/uploads/2014/12/HWW-Slide6.jpg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .crossFade()
                .centerCrop()
                .into(imageView1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), RecoveryActivity.class);
                startActivity(i);
            }
        });

        return v;
    }

}
