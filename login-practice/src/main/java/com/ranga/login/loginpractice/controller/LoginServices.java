package com.ranga.login.loginpractice.controller;

import org.springframework.stereotype.Service;

@Service
public class LoginServices {

    public boolean validateUser(String userid, String password)
    {
    return  userid.equalsIgnoreCase("divya") && password.equalsIgnoreCase("password");
    }
}
