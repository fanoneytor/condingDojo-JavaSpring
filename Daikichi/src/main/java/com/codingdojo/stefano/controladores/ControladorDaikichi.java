package com.codingdojo.stefano.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class ControladorDaikichi {
	@GetMapping("/")
	public String saludo() {
		return "¡Bienvenido!";
	}
	
	@GetMapping("/today")
	public String mensaje() {
		return "¡Hoy encontrarás suerte en todos tus esfuerzos!";
	}
	
	@GetMapping("/travel/{ciudad}")
	public String travel(@PathVariable(value="ciudad") String city) {
		String resultado = "¡Felicitaciones! ¡Pronto viajarás a " + city + " !";
		return resultado;
	}
	
	@GetMapping("/lotto/{numero}")
	public String numero(@PathVariable(value="numero") int num) {
		if(num%2==0) {
			return "Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras";
		}else {
			return "Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigos";
		}		
	}
}
