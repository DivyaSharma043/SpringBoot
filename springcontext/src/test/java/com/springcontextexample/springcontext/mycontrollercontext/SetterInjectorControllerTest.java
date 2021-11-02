package com.springcontextexample.springcontext.mycontrollercontext;

import com.springcontextexample.springcontext.services.ConstructorInjectionServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectorControllerTest {

    SetterInjectorController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectorController();
        controller.setGreetingServices(new ConstructorInjectionServices());
    }

    @Test
    void setGreetingServices() {
        System.out.println(controller.getGreeting());
    }
}