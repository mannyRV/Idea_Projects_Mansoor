package com.shop.service;

import com.shop.model.Customer;
import com.shop.model.User;

public interface UserService {
    void register(User user);
    Customer login(String email, String password);

}
