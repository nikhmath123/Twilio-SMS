package com.twilio;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/text")
@RestController
public class Controller {

	public final Service service;

	@Autowired
	public Controller(Service service) {
		this.service = service;
	}
	
	@PostMapping
	public void sendText(@Valid @RequestBody TextMessageRequest textRequest) {
		service.sendText(textRequest);
	}
}
