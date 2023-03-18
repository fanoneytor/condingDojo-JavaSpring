package com.codingdojo.stefano.servicios;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.stefano.modelos.Book;
import com.codingdojo.stefano.modelos.LoginUser;
import com.codingdojo.stefano.modelos.User;
import com.codingdojo.stefano.repositorios.BookRepository;
import com.codingdojo.stefano.repositorios.UserRepository;

@Service
public class AppService {
	
	@Autowired
	private UserRepository repoUser;
	
	@Autowired
	private BookRepository repoBook;
	
	//Funcion que registra un usuario
	public User register(User nuevoUsuario, BindingResult result) {
		
		//Comparando las contraseñas		
		if(!nuevoUsuario.getPassword().equals(nuevoUsuario.getConfirm())){
			result.rejectValue("password", "Matches", "Las contraseñas no coinciden.");				
		}
		
		//Revisar si el correo electronico ya existe
		String nuevoEmail = nuevoUsuario.getEmail();
		if(repoUser.findByEmail(nuevoEmail).isPresent()) {
			result.rejectValue("email", "Unique", "El correo electronico ya fue ingresado previamente.");
		}
		
		if(result.hasErrors()) {
			return null;
		}else {
			//Encriptar la contraseña
			String contraEncriptada = BCrypt.hashpw(nuevoUsuario.getPassword(), BCrypt.gensalt());
			nuevoUsuario.setPassword(contraEncriptada);
			return repoUser.save(nuevoUsuario);
		}
	}
	
	//Funcion de inicio de sesion
	public User login(LoginUser nuevoLogin, BindingResult result) {
		
		//Buscamos por correo electronico
		Optional<User> posibleUsuario = repoUser.findByEmail(nuevoLogin.getEmail());
		
		if(!posibleUsuario.isPresent()) {
			result.rejectValue("email", "Unique", "El correo no esta registrado");
			return null;
		}
		
		User userLogin = posibleUsuario.get(); //Usuario que me regresa mi BD	
		if(!BCrypt.checkpw(nuevoLogin.getPassword(), userLogin.getPassword())) {
			result.rejectValue("password", "Matches", "Contraseña Invalida!");
		}	
		
		if(result.hasErrors()) {
			return null;
		}else {
			return userLogin;
		}
	}
	
	//Guarda objeto de libro en base de datos	
	public Book saveBook(Book nuevoLibro) {
		return repoBook.save(nuevoLibro);				
	}
	
	//Guarda en BD los cambios de usuario
	public User saveUsuario(User user) {
		return repoUser.save(user);
	}	
	
	public List<Book> libros(){
		return repoBook.findAll();
	}
	
	public Book libroPorId(Long id) {
		return repoBook.findById(id).orElse(null);
	}
	
	public void eliminarLibro(Long id) {
		repoBook.deleteById(id);
	}
}
