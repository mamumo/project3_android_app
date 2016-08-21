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

    TextView mSaveEventText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Bills:", "EventActivity.onCreateCalled");
        setContentView(R.layout.activity_event);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String event = extras.getString("event");
        mSaveEventText.setText(event);
    }
}
