package com.examen.rest.microservice.service;

import java.util.List;
import java.util.Optional;

import com.examen.rest.microservice.model.Persona;

public interface PersonaService {
	
	Optional<Persona> findOne(int id);
	
	List<Persona> findAll();
}

