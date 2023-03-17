package com.codingdojo.stefano.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.stefano.modelos.Gasto;

@Repository
public interface GastosRepository extends CrudRepository<Gasto, Long> {
	
	List<Gasto> findAll();
	List<Gasto> findById(long id);
	

}
