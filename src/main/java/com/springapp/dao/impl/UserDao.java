package com.springapp.dao.impl;

import com.springapp.dao.IUserDao;
import com.springapp.model.User;
import org.springframework.stereotype.Repository;


import javax.persistence.*;

/**
 * Created by cmatei on 16.02.2017.
 */
@Repository("userDao")
public class UserDao extends GenericDao<User, Long> implements IUserDao{



   /* @Override
    public User getById(int userId) {

            String sql = "select * from users u where u.id = :userId";
            Query q = (Query) entityManager.createNativeQuery(sql, User.class).setParameter("userId", userId);


            return q;

    }*/


     @Override
    public User getById(int userId) {

         User user = null;
         try {
             String sql = "SELECT u FROM User u WHERE u.id=:userId";
             Query q = entityManager.createQuery(sql).setParameter("userId", userId);

             user = (User) q.getSingleResult();

         } catch (NoResultException e) {
            e.printStackTrace();
         }


         return user;


    }
}
