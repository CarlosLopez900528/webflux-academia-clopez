package com.co.academia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.academia.model.Curso;
import com.co.academia.repo.ICursoRepo;
import com.co.academia.repo.IGenericRepo;
import com.co.academia.service.ICursoService;

@Service
public class CursoServiceImpl extends CRUDImpl<Curso, String> implements ICursoService {

	@Autowired
	private ICursoRepo repo;

	@Override
	protected IGenericRepo<Curso, String> getRepo() {
		return repo;
	}

}