package com.garfields.code.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/code")
	public String Code(Model model,HttpSession session,RedirectAttributes rAttributes) {
		if(session.getAttribute("KnowsCode") == null) {
			rAttributes.addFlashAttribute("error", "Continue training you do not know the way");
			return "redirect:/";			
		}
		if(session.getAttribute("KnowsCode") == "NO") {
			rAttributes.addFlashAttribute("error", "Continue training you do not know the way");
			return "redirect:/";			
		}
		return "code.jsp";
	
	}
	
	private Boolean CorrectCode(String guess) {
		return guess.equals("bushido");
	}
	
	@RequestMapping(value = "/attempt", method=RequestMethod.POST)
	public String Attempt(@RequestParam(value="guess") String guess, Model viewmodel, HttpSession session, RedirectAttributes rAttributes) {
		if(CorrectCode(guess)==true) {
			session.setAttribute("KnowsCode", "YES");
			return "redirect:/code";
		}else {
			rAttributes.addFlashAttribute("error", "Continue training you do not know the way");
			session.setAttribute("KnowsCode", "NO");
			return "redirect:/";
		}
	}

}
