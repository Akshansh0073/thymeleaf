package com.practice.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MyController {
	
	@RequestMapping(value= "/about", method=RequestMethod.GET)
	public String about(Model model) {
		
		System.out.println("Inside about handler ...");
		
		model.addAttribute("name", "Akshansh Sharma..");
		model.addAttribute("date", LocalDate.now() );
		
		return "about";
	}
	
	// Handling iteration
	@GetMapping("/example-loop")
	public String getMethodName(Model m) {
		
		//Send
		List<String> of = List.of("ankit","anchal","arun");
		m.addAttribute("names",of);
		
		return "iterate";
	}
	
	//handler for conditional
	@GetMapping("/condition")
	public String conditional(Model m) {
		
		System.out.println("Condition handler executed.....");
		
		m.addAttribute("isActive", false);
		m.addAttribute("gender","F");
		
		List<Integer> of = List.of(1);
		m.addAttribute("myList", of);
		
		return "condition";
	}
	

}
