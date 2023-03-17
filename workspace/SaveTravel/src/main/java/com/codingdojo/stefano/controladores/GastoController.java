package com.codingdojo.stefano.controladores;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.stefano.modelos.Gasto;
import com.codingdojo.stefano.servicios.AppService;

@Controller
public class GastoController {
	
	@Autowired
	private AppService service;
	
	@GetMapping("/dashboard")
	public String dashboard(@ModelAttribute("nuevoGasto") Gasto nuevoGasto,
						    Model model
							) {		
		model.addAttribute("gastos", service.findGastos());
			
		return("/dashboard.jsp");		
	}
	
	@PostMapping("/dashboard")
	public String agregarGasto(@Valid @ModelAttribute("nuevoGasto") Gasto nuevoGasto,
							   BindingResult result,
							   Model model
								) {

		if(result.hasErrors()) {
			model.addAttribute("gastos", service.findGastos());
			return("/dashboard.jsp");
		}else {
			service.saveGasto(nuevoGasto);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/show/{id}")
	public String mostrar(@PathVariable("id") Long id,
						  Model model) {
		model.addAttribute("gasto", service.findGasto(id));
		return ("show.jsp");		
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id,
						 Model model,
						 @ModelAttribute("gasto") Gasto gasto) {
		Gasto gastoEdit = service.findGasto(id);
		if(gastoEdit==null) {
			return "redirect:/dashboard";
		}else {
			model.addAttribute("gastos", gastoEdit);
			return "edit.jsp";
		}		
	}
	
	@PutMapping("/edit/{id}")
	public String update(@Valid @ModelAttribute("gasto") Gasto gasto,
						 BindingResult result,
						 Model model) {
		if(result.hasErrors()) {
			model.addAttribute("gastos", service.findGastos());
			return "edit.jsp";
		}else {
			service.saveGasto(gasto);
			return "redirect:/dashboard";
		}		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteGasto(@PathVariable("id") Long id) {
		service.deleteGasto(id);
		return "redirect:/dashboard";
	}
}
