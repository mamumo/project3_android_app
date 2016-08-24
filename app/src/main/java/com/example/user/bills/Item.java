package com.example.user.bills;

import java.math.BigDecimal;

/**
 * Created by user on 23/08/2016.
 */
public class Item {

    private String description;
    private float cost;

    public Item(String description, float cost) {
        this.description = description;
        this.cost = cost;
    }

    protected String getItemDescription() {
        return this.description;
    }

    public void setItemDescription(String newDescription) {
        this.description = newDescription;
    }

    public float getItemCost() {
        return this.cost;
    }

    public void setItemCost(int newCost) {
        this.cost = newCost;
    }


}
