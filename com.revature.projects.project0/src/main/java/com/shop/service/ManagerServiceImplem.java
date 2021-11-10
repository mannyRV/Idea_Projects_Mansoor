package com.shop.service;

import com.shop.model.Employee;
import com.shop.model.Manager;
import com.shop.repository.EmployeeRepository;

public class ManagerServiceImplem implements ManagerService{
    private EmployeeRepository employeeRepository;

    public ManagerServiceImplem(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public void hireEmployee(int id, String name) {
        Employee emp = new Employee(name,id);
        employeeRepository.save(emp);
    }

    @Override
    public void fireEmployee(Employee emp) {
        employeeRepository.remove(emp);
    }
}
