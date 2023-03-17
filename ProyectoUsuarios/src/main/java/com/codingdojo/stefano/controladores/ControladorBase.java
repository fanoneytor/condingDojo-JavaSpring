package com.codingdojo.stefano.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //Dicta que la clase es un controlador -> API
@RequestMapping("/usuarios")
public class ControladorBase {
	
	//@RequestMapping(value="/", method=RequestMethod.GET)
	@GetMapping("/")
	public String home() {
		return "Hola desde mi controlador";
	}
	
	@GetMapping("/despliega")
	public String despliegaUsuarios() {
		String usuarios[] = {"Elena de Troya", "Juana de Arco", "Pablo Picasso"};
		String respuesta = "";
		
		for(int i=0; i<usuarios.length; i++) {
			respuesta += "<h2>" + usuarios[i]+ "</h2>";			
		}
		return respuesta;
	}
	
	@GetMapping("/hello")
	public String helloNombre(@RequestParam(value="nombre") String name) {
		String respuesta = "<h1> ¡Hola " + name + "!</h1>";
		return respuesta;		
	}
	
	@GetMapping("/hello2")
	public String helloNombreApellido(@RequestParam(value = "nombre") String name,
									  @RequestParam(value = "apellido", required=false, defaultValue="") String last_name) {
		String respuesta  = "<h1> ¡Hola " + name + " "+ last_name + "!</h1>";
		return respuesta;
		
	}
	
	@GetMapping(value={"/hello/{nombre}", "/hello/{nombre}/{apellido}"})
	public String helloPath(@PathVariable(value="nombre") String name,
							@PathVariable(value="apellido", required = false) String last_name) {
		String respuesta  = "<h1> ¡Hola " + name + " "+ last_name + "!</h1>";
		return respuesta;
	}	
}
