package com.appbusters.robinkamboj.radiationdosagecalculator;



//This is the class to check if the app is lauched for hte first time ( whether to display intro slider or not )

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context _context;

    //shared preferences mode
    int PRIVATE_MODE = 0;

    //SharedPreferences file name
    private static final String PREF_NAME = "appbusters-welcome";
    private static final String IS_FIRST_TIME_LAUNCHED = "IsFirstTimeLaunched";

    public PrefManager(Context context){
        this._context = context;
        preferences = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = preferences.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime){
        editor.putBoolean(IS_FIRST_TIME_LAUNCHED, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch(){
        return preferences.getBoolean(IS_FIRST_TIME_LAUNCHED, true);
    }
}
