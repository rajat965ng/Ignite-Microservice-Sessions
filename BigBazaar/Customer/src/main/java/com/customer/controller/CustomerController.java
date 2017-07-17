package com.customer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Value("${welcome.label}")
	private String welcomeLabel;
	
	@GetMapping("/hello")
	public String helloCustomer(){
		return "Hello Customers !!";
	}
	
	@GetMapping("/welcome")
	public String welcomeCustomer(){
		return welcomeLabel;
	}
}
