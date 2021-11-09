package com.shop.model;

public class Item {
    public int itemId;
    public String name;
    public double price;
    public int maxQuanitity;

    public Item(int itemId, String name, double price, int maxQuanitity) {
        this.itemId=itemId;
        this.name = name;
        this.price = price;
        this.maxQuanitity=maxQuanitity;
    }

    public Item() {
    }

    public Item(int itemId) {
        this.itemId = itemId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
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

    public int getMaxQuanitity() {
        return maxQuanitity;
    }

    public void setMaxQuanitity(int maxQuanitity) {
        this.maxQuanitity = maxQuanitity;
    }
    //    public boolean isSold() {
//        return sold;
//    }
//
//    public void setSold(boolean sold) {
//        this.sold = sold;
//    }
//
//    public boolean isOffered() {
//        return offered;
//    }
//
//    public void setOffered(boolean offered) {
//        this.offered = offered;
//    }
//
//    public double getWeeklyPayment() {
//        return weeklyPayment;
//    }
//
//    public void setWeeklyPayment(double weeklyPayment) {
//        this.weeklyPayment = weeklyPayment;
//    }
//
//    public int getTerm() {
//        return term;
//    }
//
//    public void setTerm(int term) {
//        this.term = term;
//    }
//
//    public double getOffer() {
//        return offer;
//    }
//
//    public void setOffer(double offer) {
//        this.offer = offer;
//    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxQuanitity=" + maxQuanitity +
                '}';
    }
}
