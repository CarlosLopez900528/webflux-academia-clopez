package com.co.academia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.academia.model.Matricula;
import com.co.academia.repo.IGenericRepo;
import com.co.academia.repo.IMatriculaRepo;
import com.co.academia.service.IMatriculaService;

@Service
public class MatriculaServiceImpl extends CRUDImpl<Matricula, String> implements IMatriculaService {

	@Autowired
	private IMatriculaRepo repo;

	@Override
	protected IGenericRepo<Matricula, String> getRepo() {
		return repo;
	}

}