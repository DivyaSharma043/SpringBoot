package com.springcontextexample.springcontext;

import com.springcontextexample.springcontext.mycontrollercontext.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringcontextApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringcontextApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
