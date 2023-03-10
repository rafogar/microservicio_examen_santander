package com.examen.rest.microservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.rest.microservice.model.Persona;
import com.examen.rest.microservice.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {
	
//	@Autowired
//    private PersonaRepository personaRepository;
	
	private static List<Persona> personas = new ArrayList<>();
	
	private static int personasCount = 0;
	
	static {
		personas.add(new Persona(++personasCount, "Pedro", "Gutierrez", "OIGRRFC", "OIGRCURP",35,"Masculino","Mexicana"));
		personas.add(new Persona(++personasCount, "Andres", "Molina", "MOLARFC", "MOKACURP",28,"Masculino","Mexicana"));
		personas.add(new Persona(++personasCount, "Ramon", "Fernandez", "FERRRFC", "FERRCURP",45,"Masculino","Mexicana"));
	}
	
	public List<Persona> findAll() {
		return personas;
	}

	public Persona save(Persona persona) {
		persona.setId(++personasCount);
		personas.add(persona);
		return persona;
	}

	public Optional<Persona> findOne(int id) {
		Predicate<? super Persona> predicate = persona -> persona.getId().equals(id); 
		return Optional.of(personas.stream().filter(predicate).findFirst().orElse(null));
	}	

}
