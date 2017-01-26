package com.appbusters.robinkamboj.radiationdosagecalculator.view;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.appbusters.robinkamboj.radiationdosagecalculator.R;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

/**
 * Created by rishabhshukla on 12/01/17.
 */

public class parentViewHolder extends ParentViewHolder {
    public TextView parentTV;
    public ImageView dropDownArrow;
    public parentViewHolder(View itemView) {
        super(itemView);

        parentTV = (TextView) itemView.findViewById(R.id.list_item_parent_tv);
        dropDownArrow = (ImageButton) itemView.findViewById(R.id.list_item_expand_arrow);
    }
}
