package com.example.user.bills;

/**
 * Created by user on 23/08/2016.
 */
public class Item {

    private String description;
    private int cost;

    public Item(String description, int cost) {
        this.description = description;
        this.cost = cost;
    }

    protected String getItemDescription() {
        return this.description;
    }

    public void setItemDescription(String newDescription) {
        this.description = newDescription;
    }

    public int getItemCost() {
        return this.cost;
    }

    public void setItemCost(int newCost) {
        this.cost = newCost;
    }


}
