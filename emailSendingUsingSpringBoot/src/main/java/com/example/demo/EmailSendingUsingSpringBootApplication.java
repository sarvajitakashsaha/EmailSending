package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailSendingUsingSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailSendingUsingSpringBootApplication.class, args);
		System.out.println("email sender started");
	}

}
