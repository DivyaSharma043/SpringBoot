package com.springcontextexample.springcontext.mycontrollercontext;

import com.springcontextexample.springcontext.services.GreetingServices;

public class PropertyInjectedController {

    public GreetingServices greetingServices;
    public String getGreeting()
    {
        return greetingServices.sayGreeting();
    }
}
