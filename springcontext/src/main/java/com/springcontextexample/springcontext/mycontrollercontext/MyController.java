package com.springcontextexample.springcontext.mycontrollercontext;

import com.springcontextexample.springcontext.services.GreetingServices;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public final GreetingServices greetingServices;

    public MyController(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String sayHello()
    {

        return greetingServices.sayGreeting();
    }
}
