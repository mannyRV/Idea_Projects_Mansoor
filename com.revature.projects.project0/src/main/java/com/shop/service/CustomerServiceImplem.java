package com.shop.service;

import com.shop.model.Item;
import com.shop.repository.ItemRepository;

import java.util.List;

public class CustomerServiceImplem implements CustomerService {
    private ItemRepository itemRepository;
    CustomerServiceImplem(ItemRepository itemRepository){
        this.itemRepository=itemRepository;
    }

    @Override
    public List<Item> viewItems() {
        return itemRepository.viewAllItems();
    }

    @Override
    public void makeOffer(int itemId, int quantity, double amount, int customerId) {
        itemRepository.addOffer(itemId,quantity,amount,customerId);
    }

    @Override
    public void makePayment(double amount) {

    }
}
