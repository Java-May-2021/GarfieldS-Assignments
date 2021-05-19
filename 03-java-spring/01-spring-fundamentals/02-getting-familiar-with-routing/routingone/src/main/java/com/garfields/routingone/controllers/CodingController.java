package com.garfields.routingone.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String hello() {
		return "Hello Coding Dojo";
	}
	
	@RequestMapping("/python")
	public String pyhton() {
		return "Django was Awsoome!";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "java is better!";
	}


}
