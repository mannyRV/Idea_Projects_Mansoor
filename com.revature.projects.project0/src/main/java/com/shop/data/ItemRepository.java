package com.shop.data;

import java.util.ArrayList;
import java.util.List;

class ItemRepository {
    Item item;
    List<Item> itemList = new ArrayList<>();
    public void add(Item item){
        itemList.add(item);
    }

}
