package com.shop.service;

import com.shop.model.Item;
import com.shop.model.Offer;
import com.shop.repository.ItemRepository;

import java.util.List;

public class EmployeeServiceImplem implements EmployeeService {
    private ItemRepository itemRepository;
    public EmployeeServiceImplem (ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    @Override
    public void addItem(String name, double price, int max_qty) {
        itemRepository.addItem(name,price,max_qty);
    }

    @Override
    public void editItem(int id, String name, double price,int qty) {
        itemRepository.editItem(id,name,price,qty);
    }

    @Override
    public void editPrice(int id, double price){
        itemRepository.editItem(id,price);
    }

    @Override
    public void editName(int id, String name){
        itemRepository.editItem(id,name);
    }

    @Override
    public void acceptOffer(Offer o){
        itemRepository.acceptOffer(o);
    }

    @Override
    public void rejectOffer(Offer o){
        itemRepository.rejectOffer(o);
    }

    @Override
    public List<Offer> viewOffers() {
        return itemRepository.viewOffers();
    }

    @Override
    public List<String[]> viewPayments() {
        return null;
    }
}
