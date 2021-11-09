package com.shop.service;

import com.shop.model.Item;
import com.shop.model.User;
import com.shop.repository.ItemRepository;

import java.util.List;

public class ItemServiceImplem implements ItemService{
    private ItemRepository itemRepository;
    private User user;

    public ItemServiceImplem(ItemRepository itemRepository){
        this.itemRepository=itemRepository;
    }

    @Override
    public List<Item> viewItems() {
        return itemRepository.viewAllItems();
    }

}
