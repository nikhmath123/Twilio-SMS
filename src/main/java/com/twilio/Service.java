package com.twilio;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

	private final TextMessageSender textSender;
	
	@Autowired
	public Service(TwilioTextSender textSender) {
		this.textSender = textSender;
	}
	
	public void sendText(TextMessageRequest textRequest) {
		textSender.sendText(textRequest);
	}
}
