package com.shop.data;

public class Item {
    int itemId;
    public String name;
    double price;
    boolean sold;
    boolean offered;
    double weeklyPayment;
    int term;
    double offer;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Item(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public boolean isOffered() {
        return offered;
    }

    public void setOffered(boolean offered) {
        this.offered = offered;
    }

    public double getWeeklyPayment() {
        return weeklyPayment;
    }

    public void setWeeklyPayment(double weeklyPayment) {
        this.weeklyPayment = weeklyPayment;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public double getOffer() {
        return offer;
    }

    public void setOffer(double offer) {
        this.offer = offer;
    }
}
