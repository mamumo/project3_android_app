package com.example.user.bills;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 23/08/2016.
 */
public class EventActivity extends AppCompatActivity {

    EditText mEventEditText;
    Button mNextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        Log.d("Event", "onCreateCalled");
        setContentView(R.layout.activity_event);


        mEventEditText = (EditText) findViewById(R.id.enter_event_text);
        mNextButton = (Button) findViewById(R.id.next_button);


        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String event = mEventEditText.getText().toString();
                Log.d("Event:", "Next button clicked");
                Log.d("Event:", "The event entered is '" + event + "'");


                Intent event_activity = new Intent(EventActivity.this, UserActivity.class);
                event_activity.putExtra("event", event);

                startActivity(event_activity);


            }
        });


    }
}
