package com.twilio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.message.*;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class Application {
	
	public static final String ACCOUNT_SID = System.getenv("TWILIO_SID");
	public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH");

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		
	}

}
