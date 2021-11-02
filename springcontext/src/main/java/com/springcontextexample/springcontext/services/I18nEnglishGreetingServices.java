package com.springcontextexample.springcontext.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingServices implements GreetingServices{

    @Override
    public String sayGreeting() {

        return "Hello World --EN";
    }


}
