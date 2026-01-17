package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcUserAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcUserAppApplication.class, args);
		System.err.println("App is started");
	}

}
