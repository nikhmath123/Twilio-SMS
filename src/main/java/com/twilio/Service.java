package com.twilio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.stereotype.Service
public class Service {

	private final TextMessageSender textSender;
	
	@Autowired
	public Service(@Qualifier("twilio") TwilioTextSender textSender) {
		this.textSender = textSender;
	}
	
	public void sendText(TextMessageRequest textRequest) {
		textSender.sendText(textRequest);
	}
}
