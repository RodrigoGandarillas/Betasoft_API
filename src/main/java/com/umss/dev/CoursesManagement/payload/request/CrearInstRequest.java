package com.umss.dev.CoursesManagement.payload.request;

import java.util.Date;
import java.util.Set;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

import com.umss.dev.CoursesManagement.model.Curso;

public class CrearInstRequest {
	@NotBlank
	private String nombre;
	@NotBlank
	private String apellido_paterno;
	@NotBlank
	private String apellido_materno;
	@NotBlank
	private String email;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotBlank
	private Date fecha_nacimiento;
	@NotBlank
	private String area_especializacion;
	@NotBlank
	private String nivel_estudio;
	private Set<Curso> cursos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getArea_especializacion() {
		return area_especializacion;
	}

	public void setArea_especializacion(String area_especializacion) {
		this.area_especializacion = area_especializacion;
	}

	public String getNivel_estudio() {
		return nivel_estudio;
	}

	public void setNivel_estudio(String nivel_estudio) {
		this.nivel_estudio = nivel_estudio;
	}

	public Set<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}

}
