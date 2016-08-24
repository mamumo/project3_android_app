package com.example.user.bills;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by user on 23/08/2016.
 */
public class Order {
    private String name;
    private ArrayList<Item> items;

    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    public String getName() {
        return this.name;
    }

    public void setOrderName(String newName) {
        this.name = newName;
    }

    public int numberOfItems() {
        return items.size();
    }

    public void addToOrder(Item item) {
        items.add(item);

    }
//  Created BigDecimal round method in order to get the total method to return to 2 decimal places


    public static BigDecimal round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd;
    }

    public float totalCostOfOrder() {
        float total = 0f;

        for(Item item : items) {
            total += item.getItemCost();
        }
        BigDecimal result;
        result = round(total,2);

        String string_result = result.toString();

        float total_result =  Float.parseFloat(string_result);

        return total_result;
    }

//    Needed to alter below method to receive total amount to 2 decimal places.


//    public float totalCostOfOrder() {
//        float total = 0f;
//        for(Item item : items) {
//            total += item.getItemCost();
//        }
//        return total.;
//    }

//





}
