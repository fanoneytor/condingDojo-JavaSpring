package com.codingdojo.stefano.controladores;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/enviarOmikuji")
	public String enviarOmikuji(@RequestParam("numero") int numero,
								@RequestParam("nombreCiudad") String nombreCiudad,
								@RequestParam("nombrePersona") String nombrePersona,
								@RequestParam("profesion") String profesion,
								@RequestParam("serVivo") String serVivo,
								@RequestParam("algoBueno") String algoBueno,
								HttpSession session) {
		session.setAttribute("numero", numero);
		session.setAttribute("nombreCiudad", nombreCiudad);
		session.setAttribute("nombrePersona", nombrePersona);
		session.setAttribute("profesion", profesion);
		session.setAttribute("serVivo", serVivo);
		session.setAttribute("algoBueno", algoBueno);
		
		return "redirect:/show";
		
	}
	
	@RequestMapping("/show")
	public String mostrar(HttpSession session,
						  Model model) {
		model.addAttribute("numero", session.getAttribute("numero"));
		model.addAttribute("nombreCiuduad", session.getAttribute("nombreCiudad"));
		model.addAttribute("nombrePersona", session.getAttribute("nombrePersona"));
		model.addAttribute("profesion", session.getAttribute("profesion"));
		model.addAttribute("serVivo", session.getAttribute("serVido"));
		model.addAttribute("algoBueno", session.getAttribute("algoBueno"));
				
		
		return"/show.jsp";
	}

}
