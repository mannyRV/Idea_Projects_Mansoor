package com.shop.repository;

import com.shop.model.Item;

import java.util.ArrayList;
import java.util.List;

class JdbcItemRepository {
    Item item;
    List<Item> itemList = new ArrayList<>();
    public void add(Item item){
        itemList.add(item);
    }

}
