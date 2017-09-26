package com.autocraft.service;

import com.autocraft.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer findById(int id);

    boolean saveCustomer(Customer customer);

    boolean updateCustomer(Customer customer);

    List<Customer> findAllCustomers();

    boolean isCustomerUnique(Integer cusId);
}
