package com.promineotech.socialMediApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.promineo.socialMediaApi")
@SpringBootApplication

public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
