package com.autocraft.dao;

import com.autocraft.model.Customer;

import java.util.List;

public interface CustomerDao {

    Customer findById(int id);

    boolean saveCustomer(Customer customer);

    List<Customer> findAllCustomers();
}
