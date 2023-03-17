package com.codingdojo.stefano.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.stefano.repositorios.GastosRepository;
import com.codingdojo.stefano.modelos.Gasto;

@Service
public class AppService {
	
	@Autowired
	private GastosRepository repoGasto;
	
	public List<Gasto> findGastos(){
		return repoGasto.findAll();		
	}
	
	//Guardamos un gasto
	public Gasto saveGasto(Gasto nuevoGasto) {
		return repoGasto.save(nuevoGasto);		
	}
	
	public Gasto findGasto(Long id) {
		return repoGasto.findById(id).orElse(null);
	}
	
	public void deleteGasto(Long id) {
		repoGasto.deleteById(id);		
	}
}
