package com.shop.model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private double offerAmount;
    List<Item> ownedItems= new ArrayList<>();
    List<Double> remainingPayments= new ArrayList<>();
    List<Item> items= new ArrayList<>();
    public Item viewItem(String name) { // should return a specific item form item list using name
            Item itm = (Item) items
                     .stream()
                     .filter(i->i.getName().equals(name));
            return itm;
    }

    public List<Item> viewItems() { // should return an item list
          return items;
    }

    public List<Item> viewOwned() {// should return a list of purchase items
          return ownedItems;
    }
    public List<Double> viewPlan() { // should return a list of double values representing payments per week till end of term
           return remainingPayments;
    }
}
