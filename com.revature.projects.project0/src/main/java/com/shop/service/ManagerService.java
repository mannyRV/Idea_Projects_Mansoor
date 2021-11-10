package com.shop.service;

import com.shop.model.Employee;
import com.shop.model.Manager;

import java.util.List;

public interface ManagerService{
//    List<Employee> viewEmployees();
    void hireEmployee(int id, String name);
    void fireEmployee(Employee emp);
}
