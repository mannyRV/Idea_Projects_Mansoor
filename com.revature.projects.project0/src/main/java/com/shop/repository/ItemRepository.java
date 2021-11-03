package com.shop.repository;

import java.util.List;

public interface ItemRepository {
    void addItem();
    void editItem();
    void offerDecision();
    List<Double> viewPayments();
}
