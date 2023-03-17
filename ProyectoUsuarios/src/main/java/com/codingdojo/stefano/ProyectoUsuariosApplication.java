package com.codingdojo.stefano;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //Mostrar las rutas
public class ProyectoUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoUsuariosApplication.class, args);
	}
	
	/*@RequestMapping("/") //Version generica
	public String home() {
		return "¡Hola mundo con Spring!";
	}*/
}
