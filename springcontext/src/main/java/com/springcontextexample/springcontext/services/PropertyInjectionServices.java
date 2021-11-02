package com.springcontextexample.springcontext.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectionServices implements GreetingServices{
    @Override
    public String sayGreeting() {

        return "Hello World --Property";
    }
}
