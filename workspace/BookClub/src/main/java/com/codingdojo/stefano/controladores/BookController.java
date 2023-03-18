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

import com.codingdojo.stefano.modelos.Book;
import com.codingdojo.stefano.modelos.User;
import com.codingdojo.stefano.servicios.AppService;

@Controller
@RequestMapping("books")
public class BookController {
	
	@Autowired
	private AppService service;
	
	@GetMapping("/new")
	public String nuevoLibro(@ModelAttribute("book") Book book,
							 HttpSession session) {
		//REVISAMOS LA SESION
		User currentUser = (User) session.getAttribute("userSession");
		
		if(currentUser == null) {
			return "redirect:/";
		}
		return "new.jsp";		
	}
	
	@PostMapping("/create")
	public String crearLibro(@Valid @ModelAttribute("book") Book book,
							 BindingResult result,
							 HttpSession session) {
		//REVISAMOS LA SESION
		User currentUser = (User) session.getAttribute("userSession");
		
		if(currentUser == null) {
			return "redirect:/";
		}
		
		//Revisamos si hay errores en el registro
		if(result.hasErrors()) {
			return "new.jsp";
		}else {
			service.saveBook(book);
			return "redirect:/books";
		}		
	}
	
	@GetMapping("/{idBook}")
	public String detalleLibro(@PathVariable("idBook") Long id,
							   HttpSession session,
							   Model model) {
		//REVISAMOS LA SESION
		User currentUser = (User) session.getAttribute("userSession");
		
		if(currentUser == null) {
			return "redirect:/";
		}
		
		model.addAttribute("book", service.libroPorId(id));		
		return "detalleLibro.jsp";
	}
	
	@GetMapping("/edit/{idBook}")
	public String editarLibro(@PathVariable("idBook") Long id,
							  @ModelAttribute("book") Book book,
							  HttpSession session,
							  Model model) {
		//REVISAMOS LA SESION
		User currentUser = (User) session.getAttribute("userSession");
		
		if(currentUser == null) {
			return "redirect:/";
		}
		
		Book bookEdit = service.libroPorId(id);
		
		//revision que el id del usuario que posteo coincida con el de la sesion.
		if(!currentUser.getId().equals(bookEdit.getUserPosted().getId())) {
			return "redirect:/books";			
		}
		
		model.addAttribute("book", bookEdit);
		return "editarLibro.jsp";		
	}
	
	@PutMapping("/update")
	public String actualizarLibro(@Valid @ModelAttribute("book") Book book,
								  BindingResult result,
								  HttpSession session) {
		//REVISAMOS LA SESION
		User currentUser = (User) session.getAttribute("userSession");
		
		if(currentUser == null) {
			return "redirect:/";
		}
		
		//Revisamos si hay errores en el registro
		if(result.hasErrors()) {
			return "editarLibro.jsp";
		}else {
			service.saveBook(book);
			return "redirect:/books";
		}		
	}
	
	@GetMapping("/delete/{idBook}")
	public String eliminarLibro(@PathVariable("idBook") Long id,
								HttpSession session) {
		//REVISAMOS LA SESION
		User currentUser = (User) session.getAttribute("userSession");
		
		if(currentUser == null) {
			return "redirect:/";
		}
		
		service.eliminarLibro(id);
		return"redirect:/books";		
	}
}
