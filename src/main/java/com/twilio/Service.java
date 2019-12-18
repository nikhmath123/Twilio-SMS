package com.twilio;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

	private final TwilioTextSender twilioTextSender;
	
	@Autowired
	public Service(TwilioTextSender twilioTextSender) {
		this.twilioTextSender = twilioTextSender;
	}
	
	public void sendText(TextMessageRequest textRequest) {
		twilioTextSender.sendText(textRequest);
	}
}
