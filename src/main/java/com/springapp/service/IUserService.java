package com.springapp.service;

import com.springapp.model.User;

/**
 * Created by cmatei on 16.02.2017.
 */
public interface IUserService extends IGenericService<User, Long> {

    User getById(int userId);
}
