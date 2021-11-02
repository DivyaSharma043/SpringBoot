package com.springcontextexample.springcontext.mycontrollercontext;

import com.springcontextexample.springcontext.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller

public class PropertyInjectedController {
    @Qualifier("propertyInjectionServices")
    @Autowired
    public GreetingServices greetingServices;

    public String getGreeting()
    {
        return greetingServices.sayGreeting();
    }
}
