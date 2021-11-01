package com.springcontextexample.springcontext.mycontrollercontext;

import com.springcontextexample.springcontext.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectorControllerTest {

    SetterInjectorController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectorController();
        controller.setGreetingServices(new GreetingServicesImpl());
    }

    @Test
    void setGreetingServices() {
        System.out.println(controller.getGreeting());
    }
}