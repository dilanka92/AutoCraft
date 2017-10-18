package com.autocraft.service;

import com.autocraft.dao.CustomerDao;
import com.autocraft.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private final CustomerDao customerDao;

    @Autowired
    public CustomerServiceImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public Customer findById(int id) {
        return customerDao.findById(id);
    }

    @Override
    public boolean saveCustomer(Customer customer) {
        return customerDao.saveCustomer(customer);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        boolean status;
        try {
            Customer entity = customerDao.findById(customer.getCusId());
            if (entity != null) {
                entity.setcName(customer.getcName());
                entity.setcAddress(customer.getcAddress());
                entity.setcContact(customer.getcContact());
                entity.setcEmail(customer.getcEmail());
                entity.setNic(customer.getNic());

                status = true;
            } else {
                status = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            status = false;
        }
        return status;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerDao.findAllCustomers();
    }

    @Override
    public boolean isCustomerUnique(Integer cusId) {
        Customer customer = findById(cusId);
        return (customer.getCusId() == cusId);
    }

}
