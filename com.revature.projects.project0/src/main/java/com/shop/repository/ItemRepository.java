package com.shop.repository;

import com.shop.model.Item;
import com.shop.model.Offer;

import java.util.List;

public interface ItemRepository {
    void addItem(Item item);
    void editItem(int id,String name, double price);
    void editItem(int id,String name);
    void editItem(int id, double price);
    List<Offer> viewOffers();
    void acceptOffer(Offer offer);
    void rejectOffer(Offer offer);
    List<Item> viewAllItems();
    List<Double> viewPayments();
}
