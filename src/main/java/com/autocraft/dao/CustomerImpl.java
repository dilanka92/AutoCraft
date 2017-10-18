package com.autocraft.dao;

import com.autocraft.model.Customer;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("customerDao")
public class CustomerImpl extends AbstractDao<Integer, Customer> implements CustomerDao {
    CustomerImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Customer findById(int id) {
        return getByKey(id);
    }

    @Override
    public boolean saveCustomer(Customer customer) {
       return persist(customer);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Customer> findAllCustomers() {
        Criteria criteria = createEntityCriteria();
        return (List<Customer>) criteria.list();
    }
}
