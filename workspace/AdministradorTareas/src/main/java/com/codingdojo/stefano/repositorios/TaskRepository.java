package com.codingdojo.stefano.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.stefano.modelos.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
	
	List<Task> findAll();

}
