package com.springapp.dao.impl;

import com.springapp.dao.IGenericDao;
import com.springapp.model.BaseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * Created by cmatei on 16.02.2017.
 */
public abstract class GenericDao<T extends BaseEntity, PK extends Serializable> implements IGenericDao<T, PK> {

    /** log variable for all child classes */
    protected final Logger log = LoggerFactory.getLogger(getClass());

    /** persistent class */
    private Class<T> persistentClass;

    /** entity manager */
    protected EntityManager entityManager;


    public GenericDao() {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    /**
     * Constructor that takes in a class type to persist.
     *
     * @param persistentClass
     *            the class type to persist
     */
    public GenericDao(Class<T> persistentClass) {
        this.persistentClass = persistentClass;

    }

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
