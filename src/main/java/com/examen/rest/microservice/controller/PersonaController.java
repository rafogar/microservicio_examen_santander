package com.examen.rest.microservice.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.examen.rest.microservice.exceptions.PersonaNotFoundException;
import com.examen.rest.microservice.model.Persona;
import com.examen.rest.microservice.service.PersonaServiceImpl;

@RestController
public class PersonaController {
	
	@Autowired
	private PersonaServiceImpl service;
	
	public PersonaController(PersonaServiceImpl service) {
		this.service = service;
	}

	@GetMapping("/persona")
	public String testPersona(){		
		return "Hola desde persona";		
	}
	
	@GetMapping("/personas")
	public List<Persona> retrieveAllPersonas(){		
		return service.findAll();		
	}
	
	@GetMapping("/personas/{id}")
	public Optional<Persona> retrievePersona(@PathVariable int id) {		
		Optional<Persona> persona = service.findOne(id);
		
		if(persona==null) 
			throw new PersonaNotFoundException("id:"+id);
		
		return persona;
	}
	
	//POST /users
	@PostMapping("/personas")
	public ResponseEntity<Persona> createUser(@RequestBody Persona persona) {
		Persona savedPersona = service.save(persona);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedPersona.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
}
