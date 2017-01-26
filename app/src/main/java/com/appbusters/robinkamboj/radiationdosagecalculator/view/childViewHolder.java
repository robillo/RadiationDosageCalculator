package com.appbusters.robinkamboj.radiationdosagecalculator.view;

import android.view.View;
import android.widget.TextView;

import com.appbusters.robinkamboj.radiationdosagecalculator.R;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

/**
 * Created by rishabhshukla on 12/01/17.
 */

public class childViewHolder extends ChildViewHolder {
    public TextView childTV;

    public childViewHolder(View itemView) {
        super(itemView);

        childTV = (TextView) itemView.findViewById(R.id.list_item_child_tv);
    }
}
