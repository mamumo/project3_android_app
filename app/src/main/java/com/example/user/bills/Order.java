package com.example.user.bills;

import java.util.ArrayList;

/**
 * Created by user on 23/08/2016.
 */
public class Order {
    private String name;
    private ArrayList<Item> items;

    public Order(String name) {
        this.name = name;
        this.items = ArrayList < Item > ();
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

    public int totalCostOfOrder() {
        int total = 0;
        for(Item item : items) {
            total += item.cost();
        }
        return total;
    }




}
