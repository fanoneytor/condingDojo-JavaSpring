package com.codingdojo.stefano.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.stefano.modelos.Hobby;
import com.codingdojo.stefano.modelos.Salon;
import com.codingdojo.stefano.modelos.Usuario;
import com.codingdojo.stefano.repositorios.RepositorioSalones;
import com.codingdojo.stefano.repositorios.RepositorioUsuarios;
import com.codingdojo.stefano.repositorios.RepositorioHobbies;

@Service
public class AppService {
	
	@Autowired
	private RepositorioUsuarios repoUsuarios;
	
	@Autowired
	private RepositorioSalones repoSalones;
	
	@Autowired
	private RepositorioHobbies repoHobbies;
	
	//Me regresa una lista con todos los usuarios
	public List<Usuario> findUsuarios(){
		return repoUsuarios.findAll();
	}
	
	//Guardamos un usuarios
	public Usuario saveUsuario(Usuario nuevoUsuario) {
		return repoUsuarios.save(nuevoUsuario);		
	}
	
	//Me regresa un usuario en base a su ID
	public Usuario findUsuario(Long id) {
		return repoUsuarios.findById(id).orElse(null);
	}
	
	//Borrar usuario en base a su ID
	public void deleteUsuario(Long Id) {
		repoUsuarios.deleteById(Id);
	}
	
	//Me regrese una lista con todos los salones
	public List<Salon> findSalones(){
		return repoSalones.findAll();		
	}
	
	//Regresa un salon en base a su id
	public Salon findSalon(Long id) {
		return repoSalones.findById(id).orElse(null);
	}
	
	//Me regrese un listado de usuarios que no tengan salon
	public List<Usuario> finUsuariosSinSalon(){
		return repoUsuarios.findBySalonIdIsNull();
	}	
	
	//Me regrese el listado de todos los hobbies
	public List<Hobby> findHobbies(){
		return repoHobbies.findAll();	
	}
	
	//Me regrese un Hobby en base a su id
	public Hobby finHobby(Long id){
		return repoHobbies.findById(id).orElse(null);
	}
	
	public void saveUsuarioHobby(Long user_id, Long hobby_id) {
		//Obtengo el objeto del usuario al que queremos agregar el hobby
		Usuario usuario = findUsuario(user_id);
		
		//Obtengo el Hobby
		Hobby hobby = finHobby(hobby_id);
		
		//Lista de hobbies
		List<Hobby> listaHobbies = usuario.getHobbies();
		listaHobbies.add(hobby);
		
		/*
		 * List<Usuario> listaUsuarios = hobby.getUsuario();
		 * listaUsuarios.add(usuario);
		 * repoHobbies.save(hobby);
		 * */
		
		repoUsuarios.save(usuario);
	}
	
	//Me regrese el listado de hobbies que un usuario especifico No tiene
	public List<Hobby> findHobbiesSinUsuario(Long user_id){
		//Obtenemos el objeto de usuario
		Usuario usuario = findUsuario(user_id);
		return repoHobbies.findByUsuariosNotContains(usuario);		
	}
}
