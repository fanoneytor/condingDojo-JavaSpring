package com.codingdojo.stefano.controladores;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.stefano.modelos.Task;
import com.codingdojo.stefano.modelos.User;
import com.codingdojo.stefano.servicios.AppService;

@Controller
@RequestMapping("/tasks")
public class TaskController {
	
	@Autowired
	private AppService service;
	
	String[] priorityList = {"Alta", "Media", "Baja"};
	
	@GetMapping("/new")
	public String nuevaTarea(@ModelAttribute("tarea") Task task,
							 Model model,
							 HttpSession session) {
		//REVISAMOS LA SESION
		User currentUser = (User) session.getAttribute("userSession");
		
		if(currentUser == null) {
			return "redirect:/";
		}
		model.addAttribute("usuarios", service.usuarios());
		model.addAttribute("priorityList", priorityList);
		return "nuevaTarea.jsp";		
	}
	
	@PostMapping("/create")
	public String crearTarea(@Valid @ModelAttribute("tarea") Task task,
							 BindingResult result,
							 Model model,
							 HttpSession session) {
		//REVISAMOS LA SESION
		User currentUser = (User) session.getAttribute("userSession");
		
		if(currentUser == null) {
			return "redirect:/";
		}
		
		//Revisamos si hay errores en el registro
		if(result.hasErrors()) {
			model.addAttribute("usuarios", service.usuarios());
			model.addAttribute("priorityList", priorityList);
			return "nuevaTarea.jsp";
		}else {
			service.guardarTarea(task);
			return "redirect:/tasks";
		}
	}
	
	@GetMapping("/{id}")
	public String detalle(@PathVariable("id") Long id,
						  Model model,
						  HttpSession session) {
		//REVISAMOS LA SESION
		User currentUser = (User) session.getAttribute("userSession");
		
		if(currentUser == null) {
			return "redirect:/";
		}
		model.addAttribute("tarea", service.tareaPorId(id));
		return "detalle.jsp";
	}
	
	@GetMapping("{id}/edit")
	public String editarTarea(@PathVariable("id") Long id,
							  Model model,
							  HttpSession session) {
		//REVISAMOS LA SESION
		User currentUser = (User) session.getAttribute("userSession");
		
		if(currentUser == null) {
			return "redirect:/";
		}
		
		//revision que el id del creador coincida con el de la sesion.
		if(!currentUser.getId().equals(service.tareaPorId(id).getCreator())) {
			return "redirect:/tasks";			
		}
		model.addAttribute("usuarios", service.usuarios());
		model.addAttribute("priorityList", priorityList);
		model.addAttribute("tarea", service.tareaPorId(id));
		return "editarTarea.jsp";
	}
	
	@PutMapping("/update")
	public String actualizarTarea(@Valid @ModelAttribute("tarea") Task task,
								  BindingResult result,
								  Model model,
								  HttpSession session) {		
		//REVISAMOS LA SESION
		User currentUser = (User) session.getAttribute("userSession");
		
		if(currentUser == null) {
			return "redirect:/";
		}
		
		//Revisamos si hay errores en el registro
		if(result.hasErrors()) {
			model.addAttribute("usuarios", service.usuarios());
			model.addAttribute("priorityList", priorityList);
			return "actualizarTarea.jsp";
		}else {
			service.guardarTarea(task);
			return "redirect:/tasks";
		}
	}
	
	@GetMapping("/{id}/delete")
	public String eliminarTarea(@PathVariable("id") Long id,
								HttpSession session) {
		//REVISAMOS LA SESION
		User currentUser = (User) session.getAttribute("userSession");
		
		if(currentUser == null) {
			return "redirect:/";
		}
				
		//Metodo en Servicio que nos elimine un proyecto
		service.eliminarTarea(id);
		return"redirect:/tasks";		
	}
}
