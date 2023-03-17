package com.codingdojo.stefano.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.stefano.modelos.Hobby;
import com.codingdojo.stefano.modelos.Usuario;
import com.codingdojo.stefano.servicios.AppService;

@Controller
public class ControladorHobbies {
	
	@Autowired
	private AppService servicio;
	
	@GetMapping("/asignar/{id}")
	public String asignar(@PathVariable("id") Long id,
						  Model model) {
		
		List<Hobby> hobbies = servicio.findHobbies();
		model.addAttribute("hobbies", hobbies);
		
		Usuario usuario = servicio.findUsuario(id);
		model.addAttribute("usuario", usuario);
		
		model.addAttribute("hobbiesNoPertenece", servicio.findHobbiesSinUsuario(id));
		
		return "/hobbies/assign.jsp";		
	}
	
	@PostMapping("/assignHobby")
	public String asignarHobby(@RequestParam("user_id") Long user_id,
							   @RequestParam("hobby_id") Long hobby_id) {
		servicio.saveUsuarioHobby(user_id, hobby_id);
		
		return("redirect:/dashboard");
	}	
}
