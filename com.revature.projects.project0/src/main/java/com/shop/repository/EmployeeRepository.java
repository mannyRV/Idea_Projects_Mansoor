package com.shop.repository;

import com.shop.model.Employee;

public interface EmployeeRepository {
    void save(int id, String name);
    void remove(Employee emp);
}
