package com.codingdojo.stefano.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.stefano.servicios.AppService;


@Controller
public class ControladorSalones {
	
	@Autowired
	private AppService servicio;
	
	@GetMapping("/salones")
	public String salones(Model model) {
		
		model.addAttribute("salones", servicio.findSalones());
		
		return ("/salones/index.jsp");
	}
	
	@GetMapping("/salon/{id}")
	public String show(@PathVariable("id") Long id,
					   Model model) {
		model.addAttribute("salon", servicio.findSalon(id));
		return "/salones/show.jsp";		
	}
}
