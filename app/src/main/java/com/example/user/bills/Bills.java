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
 * Created by user on 20/08/2016.
 */
public class Bills extends AppCompatActivity {

    EditText mNameEditText;
    EditText mEventEditText;
    TextView mSaveNameText;
    Button mSaveButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Bills", "onCreateCalled");
        setContentView(R.layout.activity_main);

        mNameEditText = (EditText)findViewById(R.id.enter_name_text);
        mEventEditText = (EditText)findViewById(R.id.enter_event_text);
        mSaveButton = (Button)findViewById(R.id.save_button);
        mSaveNameText = (TextView)findViewById(R.id.save_name);


        mSaveButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = mNameEditText.getText().toString();
            Log.d("Bills:", "Save button clicked");
            Log.d("Bills:", "The name entered is '" + name + "'");
            mSaveNameText.setText(name);
            String event = mEventEditText.getText().toString();


            Intent intent = new Intent(Bills.this, EventActivity.class);
            intent.putExtra("event", event);
            startActivity(intent);



        }
        });


    }
}
