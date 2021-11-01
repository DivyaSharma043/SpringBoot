package com.springcontextexample.springcontext.mycontrollercontext;

import com.springcontextexample.springcontext.services.GreetingServices;

public class ConstructorInjectionController {

    private final GreetingServices greetingServices;

    public ConstructorInjectionController(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting(){
        return greetingServices.sayGreeting();
    }
}
