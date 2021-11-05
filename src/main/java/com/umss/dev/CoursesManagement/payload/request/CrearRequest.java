package com.umss.dev.CoursesManagement.payload.request;

import com.umss.dev.CoursesManagement.model.Instructor;

public class CrearRequest {

	private String nombre;
	private String descripcion;
	private String ubicacion;
	//private Long instructor;
	private Instructor instructor;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	public Instructor  getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor   instructor) {
		this.instructor = instructor;
	}
}