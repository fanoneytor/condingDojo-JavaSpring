package com.codingdojo.stefano.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.stefano.modelos.Hobby;
import com.codingdojo.stefano.modelos.Usuario;


@Repository
public interface RepositorioHobbies extends CrudRepository<Hobby, Long>{
	
	List<Hobby> findAll();
	//Seleccionamos aquellos hobbies a los que el usuario no fue asignado
	List<Hobby> findByUsuariosNotContains(Usuario usuario);

}
