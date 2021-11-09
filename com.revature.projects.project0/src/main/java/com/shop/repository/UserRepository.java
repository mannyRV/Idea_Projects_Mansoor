package com.shop.repository;

import com.shop.model.Customer;
import com.shop.model.User;

public interface UserRepository {
    void save(User user);
    Customer findByEmail(String email);

}
