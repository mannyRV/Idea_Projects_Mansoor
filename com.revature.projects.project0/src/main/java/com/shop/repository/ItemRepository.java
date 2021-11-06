package com.shop.repository;

import com.shop.model.Item;

import java.util.List;

public interface ItemRepository {
    void addItem();
    void editItem();
    void offerDecision();
    List<Item> viewAll();
    List<Double> viewPayments();
}
