package com.co.academia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.co.academia.model.Estudiante;
import com.co.academia.repo.IEstudianteRepo;
import com.co.academia.repo.IGenericRepo;
import com.co.academia.service.IEstudianteService;

import reactor.core.publisher.Flux;

@Service
public class EstudianteServiceImpl extends CRUDImpl<Estudiante, String> implements IEstudianteService {

	@Autowired
	private IEstudianteRepo repo;

	@Override
	protected IGenericRepo<Estudiante, String> getRepo() {
		return repo;
	}
	
	@Override
	public Flux<Estudiante> listarEdadDesendente(){
		return repo.findAll(Sort.by(Sort.Direction.DESC, "edad"));
	}

}