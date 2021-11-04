package com.shop.model;

import com.shop.service.ItemService;

import java.util.ArrayList;
import java.util.List;

public class Employee{
    //Employee Attributes
    private String name;
    private int id;
    public List<Item> items=new ArrayList<>();
    //Employee Actions
    //add item
    public void addItem(Item i){
        items.add(i);
    }
    public void addItem(String name,double price){
        Item i=new Item(name, price);
        items.add(i);
    }
    public void addItem(int id){
        Item i=new Item(id);
        items.add(i);
    }
    //edit item
    public void editItem(Item item, String newName,double newPrice){
        item.name=newName;
        item.price = newPrice;
    }

    //accept or reject offers
    public void offerDecision(Item item, double offer, Customer customer){

    }

    // view all payments
    public void viewPayments(){

    }
}
