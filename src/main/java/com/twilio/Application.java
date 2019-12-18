package com.twilio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	public static final String ACCOUNT_SID = System.getenv("TWILIO_SID");
	public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH");

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		
	}

}
