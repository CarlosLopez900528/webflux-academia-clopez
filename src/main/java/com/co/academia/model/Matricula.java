package com.co.academia.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Matricula {

	@Id
	private String id;

	@Field(name = "fechaMatricula")
	private LocalDateTime fechaMatricula = LocalDateTime.now();

	private Estudiante estudiante;

	private List<MatriculaItem> items;

	@Field(name = "estado")
	private boolean estado;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public List<MatriculaItem> getItems() {
		return items;
	}

	public void setItems(List<MatriculaItem> items) {
		this.items = items;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
