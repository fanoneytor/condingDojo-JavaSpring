package com.codingdojo.stefano.controladores;

import java.util.List;

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

import com.codingdojo.stefano.modelos.Project;
import com.codingdojo.stefano.modelos.User;
import com.codingdojo.stefano.servicios.AppService;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	@Autowired
	private AppService servicio;
	
	@GetMapping("/new")
	public String newProject(@ModelAttribute("project") Project project,
							 HttpSession session) {
		//REVISAMOS LA SESION
		User currentUser = (User) session.getAttribute("userSession");
		
		if(currentUser == null) {
			return "redirect:/";
		}
		return "new.jsp";
	}
	
	@PostMapping("/create")
	public String createProject(@Valid @ModelAttribute("project") Project project,
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
			//Guardamos el proyecto
			Project nuevoProyecto = servicio.saveProject(project);
			//Agregamos a la lista de proyectos a los que me uni.
			User myUser = servicio.findUser(currentUser.getId()); 
			myUser.getProjectsJoined().add(nuevoProyecto);  //Agregamos a la lista de proyecto unidos 
			servicio.saveUsuario(myUser);
			return "redirect:/dashboard";
		}
		
	}
	
	@GetMapping("/join/{projectId}")
	public String join(@PathVariable("projectId") Long projectId,
					   HttpSession session) {
		//REVISAMOS LA SESION
		User currentUser = (User) session.getAttribute("userSession");
		
		if(currentUser == null) {
			return "redirect:/";
		}
		
		//Metodo en servicio que nos una al proyecto
		servicio.saveProjectUser(projectId, currentUser.getId());
		
		return"redirect:/dashboard";
		
	}
	
	@GetMapping("/leave/{projectId}")
	public String leave(@PathVariable("projectId") Long projectId,
						HttpSession session) {
		//REVISAMOS LA SESION
		User currentUser = (User) session.getAttribute("userSession");
		
		if(currentUser == null) {
			return "redirect:/";
		}
		
		//Metodo en Servicio que nos elimine un proyecto
		servicio.removeProjectUser(projectId, currentUser.getId());
		return"redirect:/dashboard";		
	}
	
	@GetMapping("/edit/{projectId}")
	public String edit(@PathVariable("projectId") Long id,
					   @ModelAttribute("project") Project project,
					   HttpSession session,
				   	   Model model) {
		//REVISAMOS LA SESION
		User currentUser = (User) session.getAttribute("userSession");
		
		if(currentUser == null) {
			return "redirect:/";
		}
		
		Project projectEdit = servicio.findProject(id);
		
		//revision que el id del lead coincida con el de la sesion.
		if(!currentUser.getId().equals(projectEdit.getLead().getId())) {
			return "redirect:/dashboard";			
		}
		
		model.addAttribute("project", projectEdit);
		return "edit.jsp";		
	}
	
	@PutMapping("/update")
	public String update(@Valid @ModelAttribute("project") Project project,
						 BindingResult result,
						 HttpSession session) {
		//REVISAMOS LA SESION
		User currentUser = (User) session.getAttribute("userSession");
		
		if(currentUser == null) {
			return "redirect:/";
		}
		
		if(result.hasErrors()) {
			return "edit.jsp";
		}else {
			//Los usuarios que forman parte del proyecto se agreguen de nuevo
			Project thisProject = servicio.findProject(project.getId());
			List<User> usersJoinProject = thisProject.getUsersJoined();
			project.setUsersJoined(usersJoinProject);
			servicio.saveProject(project);
			return "redirect:/dashboard";
		}		
	}	
}
