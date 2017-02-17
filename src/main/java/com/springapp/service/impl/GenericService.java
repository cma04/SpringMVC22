package com.springapp.service.impl;

import com.springapp.dao.IGenericDao;
import com.springapp.model.BaseEntity;
import com.springapp.service.IGenericService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;


/**
 * Created by cmatei on 16.02.2017.
 */
@Transactional
public abstract class GenericService<T extends BaseEntity, PK extends Serializable> implements IGenericService<T, PK> {

    /** log variable for all child classes */
    protected final Logger log = LoggerFactory.getLogger(getClass());

    /**
     * GenericDao instance, set by constructor of this class
     */
    protected IGenericDao<T, PK> genericDao;

    public GenericService(IGenericDao<T, PK> genericDao) {
        this.genericDao = genericDao;
    }
}
