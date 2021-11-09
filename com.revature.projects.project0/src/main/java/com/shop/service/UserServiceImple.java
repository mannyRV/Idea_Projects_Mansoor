package com.shop.service;

import com.shop.exceptions.InvalidCredentialException;
import com.shop.exceptions.UserNotFoundException;
import com.shop.model.Customer;
import com.shop.model.User;
import com.shop.repository.UserRepository;

public class UserServiceImple implements UserService {
    private UserRepository userRepository;

    public UserServiceImple(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public void register(User user) {
        // hash password
        String bcryptHashString = BCrypt.withDefaults().hashToString(12, user.getPassword().toCharArray());
        user.setPassword(bcryptHashString);
        // save user in database
        userRepository.save(user);
    }

    @Override
    public Customer login(String email, String password) {
            Customer customer = userRepository.findByEmail(email);
            if (customer != null) {
                BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), customer.getPassword());
                if (result.verified) {
                    return customer;
                } else {
                    throw new InvalidCredentialException("incorrect user/password");
                }
            } else {
                throw new UserNotFoundException("No user found");
            }

        }
    }


