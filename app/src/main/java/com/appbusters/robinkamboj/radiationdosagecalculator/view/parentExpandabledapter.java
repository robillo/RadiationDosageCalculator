package com.appbusters.robinkamboj.radiationdosagecalculator.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.appbusters.robinkamboj.radiationdosagecalculator.R;

import java.util.List;

/**
 * Created by rishabhshukla on 12/01/17.
 */

public class parentExpandabledapter extends ExpandableRecyclerAdapter<parentViewHolder,childViewHolder> {
    LayoutInflater mInflater;
    public parentExpandabledapter(Context context, List<ParentObject> parentItemList) {
        super(context, parentItemList);
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public parentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view = mInflater.inflate(R.layout.list_item_parent, viewGroup, false);
        return new parentViewHolder(view);
    }

    @Override
    public childViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view = mInflater.inflate(R.layout.list_item_child, viewGroup, false);
        return new childViewHolder(view);
    }
    @Override
    public void onBindParentViewHolder(parentViewHolder parentViewHolder, int i, Object o) {
        parentData pvn = (parentData) o;
        parentViewHolder.parentTV.setText(pvn.getData().toString());

    }

    @Override
    public void onBindChildViewHolder(childViewHolder childViewHolder, int i, Object o) {
        childData crimeChild = (childData) o;
        childViewHolder.childTV.setText(crimeChild.getData().toString());

    }


}