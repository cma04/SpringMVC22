package com.springapp.dao;

import com.springapp.model.BaseEntity;

import java.io.Serializable;

/**
 * Created by cmatei on 16.02.2017.
 */
public interface IGenericDao<T extends BaseEntity, PK extends Serializable> {
}
