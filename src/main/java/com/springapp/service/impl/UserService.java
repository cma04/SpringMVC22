package com.springapp.service.impl;

import com.springapp.dao.IUserDao;
import com.springapp.model.User;
import com.springapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by cmatei on 16.02.2017.
 */
@Transactional
@Service("userService")
public class UserService extends GenericService<User, Long> implements IUserService {

    private IUserDao userDao;

    @Autowired(required = true)
    public UserService(IUserDao userDao) {
        super(userDao);
        this.userDao = userDao;
    }

    @Override
    public User getById(int userId) {
        return userDao.getById(userId);
    }
}
