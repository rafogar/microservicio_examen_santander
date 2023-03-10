package com.examen.rest.microservice.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

public class Persona {
	
	private Integer id;
	private String nombre;
	private String apellidos;
	private String rfc;
	private String curp;
	private Integer edad;
	private String sexo;
	private String nacionalidad;
			
	public Persona(Integer id, String nombre, String apellidos, String rfc, String curp, Integer edad, String sexo,
			String nacionalidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.rfc = rfc;
		this.curp = curp;
		this.edad = edad;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
	}
	
	public Persona() {	
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", rfc=" + rfc + ", curp="
				+ curp + ", edad=" + edad + ", sexo=" + sexo + ", nacionalidad=" + nacionalidad + "]";
	}
			
}
