package com.oasis.poc1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class POC1Controller {

	@GetMapping("/OASIS/POC1")
	public String welcomeMessage() {
		return "Hello From Core Web Application, OASIS - POC-1.";		
	}
}
