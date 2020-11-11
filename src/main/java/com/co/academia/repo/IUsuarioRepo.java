package com.co.academia.repo;


import com.co.academia.model.Usuario;

import reactor.core.publisher.Mono;

public interface IUsuarioRepo extends IGenericRepo<Usuario, String>{
	
	Mono<Usuario> findOneByUsuario(String usuario);
}
