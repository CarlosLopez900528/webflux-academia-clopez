package com.co.academia.model;

public class MatriculaItem {

	public MatriculaItem() {
	}

	public MatriculaItem(Integer numeroCurso, Curso curso) {
		this.numeroCurso = numeroCurso;
		this.curso = curso;
	}

	private Integer numeroCurso;

	private Curso curso;

	public Integer getNumeroCurso() {
		return numeroCurso;
	}

	public void setNumeroCurso(Integer numeroCurso) {
		this.numeroCurso = numeroCurso;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
