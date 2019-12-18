package com.twilio;

import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
public class TwilioConfiguration {

	@Getter @Setter private String ACCOUNT_SID = System.getenv("TWILIO_SID");
	@Getter @Setter private String AUTH_TOKEN = System.getenv("TWILIO_AUTH");
	@Getter @Setter private String trialNumber;
	
	public TwilioConfiguration() {
		
	}
	
}
