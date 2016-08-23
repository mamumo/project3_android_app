//package com.example.user.bills;
//
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
// * Created by user on 20/08/2016.
// */
//public class Bills extends AppCompatActivity {
//
//    EditText mNameEditText;
//    EditText mEventEditText;
//    EditText mSelectDateText;
////    TextView mSaveNameText;
////    TextView mSaveEventText;
//    Button mSaveButton;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        Log.d("Bills", "onCreateCalled");
//        setContentView(R.layout.activity_main);
//
//        mNameEditText = (EditText)findViewById(R.id.enter_name_text);
//        mEventEditText = (EditText)findViewById(R.id.enter_event_text);
//        mSelectDateText = (EditText)findViewById(R.id.enter_date);
//        mSaveButton = (Button)findViewById(R.id.save_button);
////        mSaveNameText = (TextView)findViewById(R.id.save_name);
////        mSaveEventText = (TextView)findViewById(R.id.save_event);
//
//
//        mSaveButton.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            String name = mNameEditText.getText().toString();
//            Log.d("Bills:", "Save button clicked");
//            Log.d("Bills:", "The name entered is '" + name + "'");
//            String event = mEventEditText.getText().toString();
//            Log.d("Bills:", "The event entered is '" + event + "'");
//            String date = mSelectDateText.getText().toString();
//
//            Intent event_activity = new Intent(Bills.this, OrderActivity.class);
//            event_activity.putExtra("name", "Hi " + name + "!");
//            event_activity.putExtra("event", event);
//            event_activity.putExtra("date", date);
//
//////
//            startActivity(event_activity);
//
//
//
//
//
//
//        }
//        });
//
//
//    }
//}
