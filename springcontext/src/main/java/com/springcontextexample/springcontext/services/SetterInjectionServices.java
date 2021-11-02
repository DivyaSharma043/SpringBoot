package com.springcontextexample.springcontext.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectionServices implements GreetingServices {
    @Override
    public String sayGreeting() {

        return "Hello World --Setter";
    }
}
