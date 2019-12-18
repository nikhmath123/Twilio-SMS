package com.twilio;

import javax.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

public class TextMessageRequest {

	@NotBlank
	@Getter private final String phoneNumber;
	
	@NotBlank
	@Getter private final String message;
	
	public TextMessageRequest(@JsonProperty("phoneNumber") String phoneNumber, @JsonProperty("message") String message) {
		this.phoneNumber = phoneNumber;
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "TextMessageRequest{" + "phoneNumber=..." + '\'' + ", message ='" + message + '\'' + '}';
	}

}
