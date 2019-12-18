package com.twilio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twilio.rest.api.v2010.account.Message;

import com.twilio.type.PhoneNumber;

@Service
public class TwilioTextSender implements TextMessageSender {
	
	@SuppressWarnings("unused")
	private final TwilioConfiguration twilioConfig;
	
	@Autowired
	public TwilioTextSender(TwilioConfiguration twilioConfig) {
		this.twilioConfig = twilioConfig;
	}

	@Override
	public void sendText(TextMessageRequest textRequest) {
		
		if(isPhoneNumberValid(textRequest.getPhoneNumber())) {
			Message.creator(new PhoneNumber(textRequest.getPhoneNumber()),
					new PhoneNumber(twilioConfig.getTrialNumber()), 
					textRequest.getMessage());
		}
		else {
			throw new IllegalArgumentException("Phone number is invalid.");
		}
		
	}

	private boolean isPhoneNumberValid(String phoneNumber) {
		return true;
	}

}
