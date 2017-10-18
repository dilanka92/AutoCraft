package com.autocraft.dao;

import java.io.Serializable;

import java.lang.reflect.ParameterizedType;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

abstract class AbstractDao<PK extends Serializable, T> {

    private final Class<T> persistentClass;

    @Autowired
    @SuppressWarnings("unchecked")
    AbstractDao(SessionFactory sessionFactory) {
        this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        this.sessionFactory = sessionFactory;
    }

    private final SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    T getByKey(PK key) {
        return (T) getSession().get(persistentClass, key);
    }

    boolean persist(T entity) {
        try {
            getSession().persist(entity);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    Criteria createEntityCriteria() {
        return getSession().createCriteria(persistentClass);
    }

}