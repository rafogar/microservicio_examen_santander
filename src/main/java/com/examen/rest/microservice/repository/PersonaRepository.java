package com.examen.rest.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.rest.microservice.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
