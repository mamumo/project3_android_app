package com.example.user.bills;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by user on 21/08/2016.
 */
public class EventActivity extends AppCompatActivity {

    TextView mSaveNameText;
    TextView mSaveEventText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Bills:", "EventActivity.onCreateCalled");
        setContentView(R.layout.activity_event);

        mSaveNameText = (TextView)findViewById(R.id.save_name);
        mSaveEventText = (TextView)findViewById(R.id.save_event);

        Intent event_activity = getIntent();
        Bundle extras = event_activity.getExtras();
        String name = extras.getString("name");//want to get the type back- getString/getInt
        mSaveNameText.setText(name);
        String event = extras.getString("event");//want to get the type back- getString/getInt
        mSaveEventText.setText(event);


    }
}
