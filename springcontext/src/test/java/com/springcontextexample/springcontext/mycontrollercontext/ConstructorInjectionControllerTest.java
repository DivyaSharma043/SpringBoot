package com.springcontextexample.springcontext.mycontrollercontext;

import org.junit.jupiter.api.Test;

class ConstructorInjectionControllerTest {

    ConstructorInjectionController controller;

//    @BeforeEach
//    void setUp() {
//        controller = new ConstructorInjectionController(new GreetingServicesImpl());
//    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}