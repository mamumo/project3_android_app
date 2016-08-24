package com.example.user.bills;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

/**
 * Created by user on 23/08/2016.
 */
public class DisplayOrderActivity extends AppCompatActivity {

    private SharedPreferences mSharedPreferences;
    TextView mShowOrder;

    Activity context = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        Log.d("DisplayOrder", "onCreateCalled");
        setContentView(R.layout.activity_display);

        mSharedPreferences = new SharedPreferences();

        String saved_text = mSharedPreferences.getValue(context);

        mShowOrder = (TextView)findViewById(R.id.save_list);

        mShowOrder.setText(saved_text);

    }

//        @Override
//        public boolean onCreateOptionsMenu(Menu menu) {
//        getSupportMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
}
