package com.springcontextexample.springcontext;

import com.springcontextexample.springcontext.mycontrollercontext.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication

public class SpringcontextApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringcontextApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello() );

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("----Primary Bean----");
		System.out.println(myController.sayHello());

		System.out.println("----PROPERTY----");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());


		System.out.println("---Setter Injection---");

		SetterInjectorController setterInjectorController = (SetterInjectorController) ctx.getBean("setterInjectorController");
		System.out.println(setterInjectorController.getGreeting());

		System.out.println("---Constructor Injection---");

		ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");
		System.out.println(constructorInjectionController.getGreeting());
	}

}
