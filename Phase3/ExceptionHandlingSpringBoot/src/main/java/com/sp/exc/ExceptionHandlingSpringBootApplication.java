package com.sp.exc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sp.exc")
public class ExceptionHandlingSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionHandlingSpringBootApplication.class, args);
	}

}
