package com.springcontextexample.springcontext.mycontrollercontext;

import com.springcontextexample.springcontext.services.ConstructorInjectionServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingServices=new ConstructorInjectionServices();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}