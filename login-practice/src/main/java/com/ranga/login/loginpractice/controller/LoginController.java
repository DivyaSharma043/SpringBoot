package com.ranga.login.loginpractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/controller")
public class LoginController {

    @Autowired
    LoginServices loginServices;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage( ModelMap model){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showWelcomePage( ModelMap model, @RequestParam String name , @RequestParam String password){

        boolean isvalidUser = loginServices.validateUser(name, password);
        if(isvalidUser) {
            model.put("name", name);
            model.put("password", password);
            return "welcome";
        }
        else
        {
            model.put("message", "Invalid Credentials");
            return "login";
        }
    }
}
