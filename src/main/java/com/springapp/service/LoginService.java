package com.springapp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("loginService")
public class LoginService {
    public boolean validateUser(String user, String password) {
        return user.equalsIgnoreCase("user") && password.equals("noob");
    }

}