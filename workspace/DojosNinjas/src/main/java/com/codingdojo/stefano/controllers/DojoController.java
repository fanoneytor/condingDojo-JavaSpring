package com.codingdojo.stefano.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.stefano.models.Dojo;
import com.codingdojo.stefano.services.AppService;

@Controller
public class DojoController {
	
	@Autowired
	private AppService service;
	
	@GetMapping("/")
	public String index() {
		return "dashboard.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard.jsp";
	}
	
	@GetMapping("/dojos/new")
	public String nuevoDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "/dojos/new.jsp";
	}
	
	@PostMapping("/dojos/create")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo,
							 BindingResult result) {
		if(result.hasErrors()) {
			return "/dojos/new.jsp";
		}else {
			service.guardarDojo(dojo);			
			return"redirect:/dashboard";
		}		
	}
}
