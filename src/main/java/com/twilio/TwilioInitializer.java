package com.twilio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioInitializer {

	private static TwilioConfiguration twilioConfig;

	@Autowired
	public TwilioInitializer(TwilioConfiguration twilioConfig) {
		this.twilioConfig = twilioConfig;
		Twilio.init(twilioConfig.getAccountSID(), twilioConfig.getAuthToken());
	}
	
}
