package com.springapp.controller;

import com.springapp.model.User;
import com.springapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.put("message", "ceva!");
        model.put("name", "ceva!");
        System.out.println("HelloController");
        int userid = 1;
        User user = userService.getById(userid);
        model.put("user", user);
        return "welcome";
    }


}