package com.examen.rest.microservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class PersonaNotFoundException extends RuntimeException {

	public PersonaNotFoundException(String message) {
		super(message);
	}
}
