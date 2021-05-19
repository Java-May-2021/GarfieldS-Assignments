package com.garfields.routingone.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class DojoController {
	
	@RequestMapping("/dojo")
	public String DojoGreeting() {
		return "the dojo is awsome";
	}
	
	@RequestMapping("/dojo/{location}")
	public String LocationText(@PathVariable("location") String LocationData) { // if statement didnt work
		switch(LocationData) {
		case "burbank":
			return "Burbank Dojo is located in Southern California";
		case "san-jose":
			return "SJ dojo is the headquarters";
		default:
			return String.format(LocationData+" is pretty sweet!");
		}
	}

}


