package com.codingdojo.stefano.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.stefano.modelos.Salon;

@Repository
public interface RepositorioSalones extends CrudRepository<Salon, Long> {
	
	List<Salon> findAll();

}
