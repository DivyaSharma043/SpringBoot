package com.springcontextexample.springcontext.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectionServices implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello World --Constructor";
    }
}
