package com.shop.repository;

import com.shop.model.Employee;
import com.shop.model.Manager;

import java.util.List;

public interface EmployeeRepository {
    Employee findByName(String name);
    void save(Employee emp);
    void remove(Employee emp);
//    List<Employee> viewAll();
}
