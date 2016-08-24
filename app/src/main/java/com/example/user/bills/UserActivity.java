//package com.example.user.bills;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//
///**
// * Created by user on 21/08/2016.
// */
//public class UserActivity extends AppCompatActivity {
//
//    EditText mNameEditText;
//    Button mNextButton;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//
//
//        super.onCreate(savedInstanceState);
//        Log.d("User", "onCreateCalled");
//        setContentView(R.layout.activity_user);
//
//
////        mNameEditText = (EditText) findViewById(R.id.enter_name_text);
////        mNextButton = (Button) findViewById(R.id.next_button);
//
//        Intent event_activity = getIntent();
//        Bundle extras = event_activity.getExtras();
//        String event = extras.getString("event");//want to get the type back- getString/getInt
//
//        this.setTitle(event);
//
//        mNextButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name = mNameEditText.getText().toString();
//                Log.d("Bills:", "Next button clicked");
//                Log.d("Bills:", "The name entered is '" + name + "'");
//
//
//                Intent user_activity = new Intent(UserActivity.this, OrderActivity.class);
//                user_activity.putExtra("name", name);
//
//                startActivity(user_activity);
//
//
//            }
//        });
//
//
//    }
//}
