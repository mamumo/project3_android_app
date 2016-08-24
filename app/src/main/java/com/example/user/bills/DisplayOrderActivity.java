package com.example.user.bills;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by user on 23/08/2016.
 */
public class DisplayOrderActivity extends AppCompatActivity {

    TextView mTotalDisplay;
    JSONArray json;
    Order mOrder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        Log.d("DisplayOrder", "onCreateCalled");
        setContentView(R.layout.activity_display);

        mOrder = new Order("Order");

        mTotalDisplay = (TextView) findViewById(R.id.save_list);

        String savedText = SavedTextPreferences.getStoredText(this);

        if (savedText != null && !savedText.isEmpty()) {

//            mTotalDisplay.setText(savedText);
        }

        try {
            json = new JSONArray(savedText);
        } catch (Exception ex) {
            Log.e("DisplayOrderActivity: ", ex.getMessage());
        }
        Log.d("THE JSON STRING", savedText);

        for (int i = 0; i < json.length(); i++){

            JSONObject jsonItem;
            String name = "error parsing JSONArray";
            float secondCost = 10.0f;

            try {
                jsonItem = json.getJSONObject(i);

                name = jsonItem.getString("description");
                double cost = jsonItem.getDouble("cost");
                secondCost = (float) cost;

            } catch (Exception ex) {
                Log.e("DisplayOrderActivity: ", ex.getMessage());
                ex.printStackTrace();
            }

            Item item = new Item(name, secondCost);

            mOrder.addToOrder(item);

        }

        float total = mOrder.totalCostOfOrder();
        String totalString = Float.toString(total);

        mTotalDisplay.setText(totalString);


    }
}