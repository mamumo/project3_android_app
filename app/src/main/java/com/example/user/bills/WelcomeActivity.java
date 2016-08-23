package com.example.user.bills;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 23/08/2016.
 */
public class WelcomeActivity extends AppCompatActivity {

//    TextView mWelcomeText;
    Button mStartButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Welcome", "onCreateCalled");
        setContentView(R.layout.activity_welcome);


//        mWelcomeText = (TextView) findViewById(R.id.welcome);
        mStartButton = (Button) findViewById(R.id.start_button);
//        mSaveNameText = (TextView)findViewById(R.id.save_name);
//        mSaveEventText = (TextView)findViewById(R.id.save_event);


        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Welcome", "startButton clicked");

                Intent main_activity = new Intent(WelcomeActivity.this, EventActivity.class);
//                main_activity.putExtra("name", "Hi " + name + "!");
//                event_activity.putExtra("event", event);
//                event_activity.putExtra("date", date);

////
                startActivity(main_activity);


            }
        });
    }
}
