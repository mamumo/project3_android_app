package com.example.user.bills;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by user on 22/08/2016.
 */
public class SharedPreferences {

    public static final String PREFS_NAME = "AOP_PREFS";
    public static final String PREFS_KEY = "AOP_PREFS_String";

    public SharedPreferences() {
        super();
    }

    public void save (Context context, String text) {
        android.content.SharedPreferences settings;
        android.content.SharedPreferences.Editor editor;

        settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        editor = settings.edit();

        editor.putString(PREFS_KEY, text);

        editor.commit();
    }

    public String getValue(Context context) {
        android.content.SharedPreferences settings;
        String text;

        //settings = PreferenceManager.getDefaultSharedPreferences(context);
        settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        text = settings.getString(PREFS_KEY, null);
        return text;
    }

    public void clearSharedPreference(Context context) {
        android.content.SharedPreferences settings;
        android.content.SharedPreferences.Editor editor;

        //settings = PreferenceManager.getDefaultSharedPreferences(context);
        settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        editor = settings.edit();

        editor.clear();
        editor.commit();
    }

    public void removeValue(Context context) {
        android.content.SharedPreferences settings;
        android.content.SharedPreferences.Editor editor;

        settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        editor = settings.edit();

        editor.remove(PREFS_KEY);
        editor.commit();
    }
}











//    public static void setStoredText(Context context, String text) {
//
//        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
//
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//
//        editor.putString(PREF_SAVEDTEXT, text);
//        editor.apply();
//    }
//
//    public static String getStoredText(Context context) {
//        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
//        return sharedPreferences.getString(PREF_SAVEDTEXT, null);
//    }
//}
