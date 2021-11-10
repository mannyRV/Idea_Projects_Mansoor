package com.shop.repository;

import com.shop.model.Item;
import com.shop.model.Offer;

import java.util.List;

public interface ItemRepository {
    void addItem(String name, double price, int max_inv);
    void removeItem(int id);
    void editItem(int id,String name, double price, int maxQuantity);
    void editItem(int id,String name);
    void editItem(int id, double price);
    void editItem(int id, int maxQuantity);
    void addOffer(int item_id,int quantity, double amount,int customer_id);
    List<Offer> viewOffers();
    Offer findOfferById(int id);
    void acceptOffer(Offer offer);
    void rejectOffer(Offer offer);
    List<Item> viewAllItems();
//    List<Double> viewPayments();
}
