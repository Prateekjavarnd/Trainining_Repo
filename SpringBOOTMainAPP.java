package com.springboot.aop.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages={"com.springboot.aop.*"})
@Autoconfigure
public class Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
		
		System.out.println("Your Application is running::")

	}

}
