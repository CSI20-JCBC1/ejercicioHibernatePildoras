package com.hibernate.dao;

import javax.persistence.*;


@Entity
@Table(name="empleado")
public class empleado {
	@Id
	@Column(name="id", unique=true, nullable=false)
	private Integer id;
	@Column(name="nombre",nullable=false)
	private String nombre;
	@Column(name="apellidos",nullable=false)
	private String apellidos;
	@Column(name="edad",nullable=false)
	private Integer edad;
	@Column(name="email",nullable=false)
	private String email;
	
	public empleado(Integer id, String nombre, String apellidos, Integer edad, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.email = email;
	}

	public empleado() {
		super();
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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
