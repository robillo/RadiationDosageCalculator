package com.appbusters.robinkamboj.radiationdosagecalculator.view;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.appbusters.robinkamboj.radiationdosagecalculator.R;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.ArrayList;

public class AccidentsActivity extends AppCompatActivity {

    String[] accident_headers;      //for RV headings
    String[] accidents;             //for RV details
    RecyclerView rv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accidents);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //myths
//        accident_headers = getResources().getStringArray(R.array.accident_headers);
//        accidents = getResources().getStringArray(R.array.accident);
        //use these like accidents[0], accidents[1], ...


        rv2= (RecyclerView) findViewById(R.id.rv2);

        rv2.setLayoutManager(new LinearLayoutManager(this));

        parentExpandabledapter pea = new parentExpandabledapter(AccidentsActivity.this, generateList());//new parentExpandabledapter(MythActivity.this, generateList());
        pea.setCustomParentAnimationViewId(R.id.list_item_expand_arrow);
        pea.setParentClickableViewAnimationDefaultDuration();
        pea.setParentAndIconExpandOnClick(true);

        rv2.setAdapter(pea);

        setupActionBar();
    }

    private ArrayList<String> addTitle(){
        ArrayList<String>myList = new ArrayList<>();
        String[] arr =  getResources().getStringArray(R.array.accident_headers);
        for(int i=0;i<arr.length;i++){
            myList.add(arr[i]);
        }
        return myList;
    }

    private ArrayList<String> addData(){
        ArrayList<String>myList = new ArrayList<>();
        String[] arr =getResources().getStringArray(R.array.accident);
        for(int i=0;i<arr.length;i++){
            myList.add(arr[i]);
        }
        return myList;
    }


    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            // Show the Up button in the action bar.
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //nonspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_more) {
            return true;
        }
        if (id == R.id.action_logout) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private ArrayList<ParentObject> generateList() {
        //Log.d(TAG, "list_title.seize=== "+list_title.size()+" list.size == "+list_data.size());
        ArrayList<String> title_list = addTitle();
        ArrayList<String> data_list = addData();
        ArrayList<ParentObject> parentObjects = new ArrayList<>();
        for(int i=0;i<title_list.size();i++) {
            parentData pData = new parentData();
            ArrayList<Object> childList = new ArrayList<>();
            pData.setData(title_list.get(i).toString());
            // pData.setData("settedData");
            childList.add(new childData(data_list.get(i).toString()));

            pData.setChildObjectList(childList);
            parentObjects.add(pData);
        }
        return parentObjects;
    }
}
