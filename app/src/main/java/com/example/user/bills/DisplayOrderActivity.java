package com.example.user.bills;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by user on 23/08/2016.
 */
public class DisplayOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        Log.d("Event", "onCreateCalled");
        setContentView(R.layout.activity_display);

        String savedText = SharedPreferences.getStoredText(this);

        if (savedText != null && !savedText.isEmpty()) {
           // display saved user inpput
        }
}
