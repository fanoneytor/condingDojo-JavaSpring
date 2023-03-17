package com.codingdojo.stefano.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.stefano.models.Dojo;
import com.codingdojo.stefano.models.Ninja;
import com.codingdojo.stefano.repository.DojoRepository;
import com.codingdojo.stefano.repository.NinjaRepository;

@Service
public class AppService {
	
	@Autowired
	private NinjaRepository repoNinja;
	
	@Autowired
	private DojoRepository repoDojo;
	
	public List<Ninja> buscarNinjas(){
		return repoNinja.findAll();
	}
	
	public List<Dojo> buscarDojos(){
		return repoDojo.findAll();
	}
	
	public Dojo guardarDojo(Dojo nuevoDojo) {
		return repoDojo.save(nuevoDojo);
	}
	
	public Ninja guardarNinja(Ninja nuevoNinja) {
		return repoNinja.save(nuevoNinja);
	}
}
