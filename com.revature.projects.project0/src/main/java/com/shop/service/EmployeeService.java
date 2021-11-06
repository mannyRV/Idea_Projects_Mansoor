package com.shop.service;

import com.shop.model.Item;

import java.util.List;

public interface EmployeeService {
    void addItem();
    void editItem();
    void decideOffer();
    List<String[]> viewPayments();
}
