package com.springcontextexample.springcontext.mycontrollercontext;

import com.springcontextexample.springcontext.services.GreetingServices;

public class SetterInjectorController {

    private GreetingServices greetingServices;

    public void setGreetingServices(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting()
    {
        return greetingServices.sayGreeting();
    }
}
