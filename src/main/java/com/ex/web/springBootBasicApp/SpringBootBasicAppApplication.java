package com.ex.web.springBootBasicApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBasicAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicAppApplication.class, args);
		System.out.println("This is First Boot Web App");
	}

}
