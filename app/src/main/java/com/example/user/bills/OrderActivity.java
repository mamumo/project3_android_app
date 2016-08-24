package com.example.user.bills;

import android.app.Activity;
import android.content.Context;
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


    Button mAddToOrder;
    ArrayList<String> mAdd = new ArrayList<String>();
    EditText mOrderInputText;
    EditText mOrderCost;
    ListView mShow;
    Button mGoToOrder;
    TextView mTotal;

    Order mOrder;


    SharedPreferences mSharedPreferences;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("OrderActivity:", "OrderActivity.onCreateCalled");
        setContentView(R.layout.activity_order);


        Intent user_activity = getIntent();
        Bundle extras = user_activity.getExtras();
        String name = extras.getString("name");//want to get the type back- getString/getInt

        mOrder = new Order(name);
        this.setTitle(name);

        mSharedPreferences = new SharedPreferences();

        mOrderInputText = (EditText)findViewById(R.id.order_input);
        mOrderCost = (EditText)findViewById(R.id.cost_input);
        mShow = (ListView)findViewById(R.id.listView);
        mAddToOrder = (Button)findViewById(R.id.add_to_order_button);
        mTotal = (TextView)findViewById(R.id.total_order_cost);





        mAddToOrder.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String getInput = mOrderInputText.getText().toString();
                String getCost = mOrderCost.getText().toString();

                float cost =  Float.parseFloat(getCost);

                String fullItem = getInput + " "+ "-"+" " + getCost;

                Item item = new Item(getInput, cost);

                mOrder.addToOrder(item);

                float totalCost = mOrder.totalCostOfOrder();

                String totalString = Float.toString(totalCost);

                Log.d("OrderActivity", totalString);

                mTotal.setText("Total: " + totalString);





                if(mAdd.contains(getInput)) {
                    Toast.makeText(getBaseContext(), "Another?", Toast.LENGTH_LONG).show();
            }
                else if (getInput == null || getInput.trim().equals("")) {
                    Toast.makeText(getBaseContext(), "What would you like?", Toast.LENGTH_LONG).show();
                }
                else{
                    mAdd.add(fullItem);
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(OrderActivity.this, android.R.layout.simple_list_item_1, mAdd);
                    mShow.setAdapter(adapter);
                    ((EditText)findViewById(R.id.order_input)).setText("");
                    ((EditText)findViewById(R.id.cost_input)).setText("");

//                    mSharedPreferences.save(OrderActivity.this, item);

                }
//

//
        }


    });
//        mGoToOrder.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v) {
//                Intent show_order = new Intent(OrderActivity.this, DisplayOrderActivity.class);
//                startActivity(show_order);
//            }
//
//
//        });



    }
}
