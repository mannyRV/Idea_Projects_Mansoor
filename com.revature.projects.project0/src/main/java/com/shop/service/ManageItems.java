package com.shop.service;

import com.shop.data.Item;

import java.util.ArrayList;
import java.util.List;

public interface ManageItems {
    default void addItem(){}
    default void editItem(){}
    default void offerDecision(){}
    default double[] viewPayments(){}

}
