package com.codingdojo.stefano.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.stefano.modelos.Usuario;
import com.codingdojo.stefano.servicios.AppService;

@RestController
@RequestMapping("/api")
public class ControladorUsuariosAPI {
	
	@Autowired
	private AppService servicio;
	
	@GetMapping("/usuarios")
	public List<Usuario> muestraUsuarios(){
		return servicio.findUsuarios();				
	}
	
	@PostMapping("/usuarios")
	public Usuario crear(@RequestParam("firstName") String firstName,
						 @RequestParam("lastName") String lastName,
						 @RequestParam("email") String email,
						 @RequestParam("password") String password) {
		Usuario nuevoUsuario = new Usuario(firstName, lastName, email, password);
		return servicio.saveUsuario(nuevoUsuario);		
	}
	
	@GetMapping("/usuarios/{id}")
	public Usuario mostrar(@PathVariable("id") Long id) {
		return servicio.findUsuario(id);
	}
	
	@DeleteMapping("/usuarios/{id}")
	public void borrar(@PathVariable("id") Long id) {
		servicio.deleteUsuario(id);
	}
	
	@PutMapping("/usuarios/{id}")
	public Usuario actualizar(@PathVariable("id") long id,
							  @RequestParam("firstName") String firstName,
							  @RequestParam("lastName") String lastName,
							  @RequestParam("email") String email,
							  @RequestParam("password") String password) {
		Usuario usuarioActualizado = new Usuario(id, firstName, lastName, email, password);
		return servicio.saveUsuario(usuarioActualizado);
	}
	
	@GetMapping("/usuarios2")
	public ResponseEntity<List<Usuario>> muestraUsuarios2(){
		List<Usuario> usuarios = servicio.findUsuarios();
		
		return new ResponseEntity<>(usuarios, HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/usuarios/nuevo")
	public ResponseEntity<Usuario> nuevoUsuario(@RequestBody Usuario nuevoUsuario){
		System.out.println(nuevoUsuario.getFirstName());
		System.out.println(nuevoUsuario.getLastName());
		
		servicio.saveUsuario(nuevoUsuario);
		
		return new ResponseEntity<>(nuevoUsuario, HttpStatus.CREATED);
	}
	
}
