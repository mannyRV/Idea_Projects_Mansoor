package com.shop.service;

import com.shop.model.Employee;

public interface ManagerService {
    void hireEmployee(int id, String name);
    void fireEmployee(Employee emp);
}
