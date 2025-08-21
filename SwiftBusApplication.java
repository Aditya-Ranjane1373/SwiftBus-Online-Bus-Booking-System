package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwiftBusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwiftBusApplication.class, args);
		
		System.out.println("<----------------Bus Application Run--------------------------->");
	}

}
