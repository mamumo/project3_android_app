package com.example.user.bills;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by user on 21/08/2016.
 */
public class OrderActivity extends AppCompatActivity {

//    TextView mSaveNameText;
    Button mAddToOrder;
    ArrayList<String> mAdd = new ArrayList<String>();
    EditText mOrderInputText;
    EditText mOrderCost;
    ListView mShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Bills:", "OrderActivity.onCreateCalled");
        setContentView(R.layout.activity_order);




        Intent event_activity = getIntent();
        Bundle extras = event_activity.getExtras();
        String event = extras.getString("event");//want to get the type back- getString/getInt


        this.setTitle(event);


        mOrderInputText = (EditText)findViewById(R.id.order_input);
        mOrderCost = (EditText)findViewById(R.id.cost_input);
        mShow = (ListView)findViewById(R.id.listView);
        mAddToOrder = (Button)findViewById(R.id.add_to_order_button);

        mAddToOrder.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String getInput = mOrderInputText.getText().toString();
                String getCost = mOrderCost.getText().toString();

                if(mAdd.contains(getInput)) {
                    Toast.makeText(getBaseContext(), "Another?", Toast.LENGTH_LONG).show();
            }
                else if (getInput == null || getInput.trim().equals("")) {
                    Toast.makeText(getBaseContext(), "What would you like?", Toast.LENGTH_LONG).show();
                }
                else{
                    String fullItem = getInput + " " + getCost;
                    mAdd.add(fullItem);
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(OrderActivity.this, android.R.layout.simple_list_item_1, mAdd);
                    mShow.setAdapter(adapter);
                    ((EditText)findViewById(R.id.order_input)).setText("");
                    ((EditText)findViewById(R.id.cost_input)).setText("");
                }
//                Context context = v.getContext();
//                SavedOrderPreferences.setStoredText(context,getInput);

//
//                mOrderInputText.setText(getInput);
//                Context context = v.getContext();
//                SavedOrderPreferences.setStoredText(context,getInput);
//                Log.d("OrderActivity: ", "SavedOrderPreferences.setStoredText called");
        };
    });

    }
}
