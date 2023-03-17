package org.tnsif.sprinwebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {
	
	@RequestMapping("/message")
	public String message()
	{
		return "Welcome to B35";
	}

}
