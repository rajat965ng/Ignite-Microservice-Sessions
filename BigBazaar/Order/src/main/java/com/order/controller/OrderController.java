package com.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

	
	@GetMapping("/sample/name")
	public String getOderName(){
		return "Non Veg Thali";
	}
	
}
