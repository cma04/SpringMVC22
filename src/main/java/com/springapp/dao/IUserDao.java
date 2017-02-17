package com.springapp.dao;

import com.springapp.model.User;

import javax.management.Query;

/**
 * Created by cmatei on 16.02.2017.
 */
public interface IUserDao extends IGenericDao<User, Long>{

    User getById(int userId);
}
