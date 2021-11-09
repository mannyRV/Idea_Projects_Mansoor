package com.shop.service;

import com.shop.model.Item;
import com.shop.model.Offer;

import java.util.List;

public interface EmployeeService {
    void addItem(Item item);
    void editItem(int id, String name, double price,int qty);
    void editPrice(int id, double price);
    void editName(int id, String name);
    List<Offer> viewOffers();
    void acceptOffer(Offer offer);
    void rejectOffer(Offer offer);
    List<String[]> viewPayments();
}
