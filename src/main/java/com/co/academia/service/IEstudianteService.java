package com.co.academia.service;

import com.co.academia.model.Estudiante;

import reactor.core.publisher.Flux;

public interface IEstudianteService extends ICRUD<Estudiante, String> {

	Flux<Estudiante> listarEdadDesendente();

}
