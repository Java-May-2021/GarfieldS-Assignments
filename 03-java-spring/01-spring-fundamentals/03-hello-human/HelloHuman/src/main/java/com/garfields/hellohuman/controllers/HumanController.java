package com.garfields.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HumanController {
	
	@RequestMapping("/")
    public String index(@RequestParam(value="q", required=false) String name, Model model) {
		if(name!= null) {
			model.addAttribute("Identity", name);
			System.out.println("User "+ name);
			return "index.jsp";			
		}
		model.addAttribute("Identity", "Human");
		System.out.println("User Human");
		return "index.jsp";	
    }

}
