package com.springapp.controller;

import com.springapp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    /*@Autowired
    private LoginService loginService;*/
    @Autowired
    LoginService loginService;

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(value = {"/login", "/"}, method = RequestMethod.GET)
    public String showLoginPage(ModelMap model) {
        model.put("message", "Hello world!");
        System.out.println("LoginController");
        return "login";
    }

    @RequestMapping(value = {"/login", "/"}, method = RequestMethod.POST)
    public String showWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        model.put("message", "Hello world!");
        if(!loginService.validateUser(name, password)) {
            model.put("errorMessage", "invalid user name/password");
            return "login";
        }

        model.put("name", name);
        System.out.println("LoginController");
        return "welcome";



    }


}