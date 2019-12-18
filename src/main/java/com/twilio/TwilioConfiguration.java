package com.twilio;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioConfiguration {

	private String ACCOUNT_SID = System.getenv("TWILIO_SID");
	private String AUTH_TOKEN = System.getenv("TWILIO_AUTH");
	private String trialNumber;
	
	public TwilioConfiguration() {
		
	}
	
	public String getAccountSID() {
		return ACCOUNT_SID;
	}
	
	public String getAuthToken() {
		return AUTH_TOKEN;
	}
	
	public String getTrialNumber() {
		return trialNumber;
	}
	
	public void setAccountSID(String accountSID) {
		this.ACCOUNT_SID = accountSID;
	}
	
	public void setAuthToken(String authToken) {
		this.AUTH_TOKEN = authToken;
	}
	
	public void setTrialNumber(String trialNumber) {
		this.trialNumber = trialNumber;
	}
}
