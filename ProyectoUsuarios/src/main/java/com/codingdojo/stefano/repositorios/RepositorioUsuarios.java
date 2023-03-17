package com.codingdojo.stefano.repositorios;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.stefano.modelos.Usuario;

@Repository
public interface RepositorioUsuarios extends CrudRepository <Usuario, Long> {
	List<Usuario> findAll();//SELECT * FROM usuarios
	
	List<Usuario> findByFirstName(String firstName);//SELECT * FROM usuarios WHERE first_name = '<'
	
	List<Usuario> findById(long id);//SELECT * FROM usuarios WHERE id = '<ID>'
	
	List<Usuario> findBySalonIdIsNull();//SELECT * FROM usuario WHERE classroom_id IS NULL
	
	//INSERT y UPDATE
	Usuario save(Usuario nuevoUsuario);
	
	void deleteById(long id);
	
}
