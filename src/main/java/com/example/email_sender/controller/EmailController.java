package com.example.email_sender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.email_sender.service.SendEmailService;

@RestController
public class EmailController {
	
	@Autowired
	private SendEmailService sendEmailService;
	
	@GetMapping("/send-email")
	public String sendEmail() {
		
		sendEmailService.sendEamil("olojedechristopher24@gmail.com", "Test Body", "Test Subject");
		
		return "Sent successfully";
	}
	

}
