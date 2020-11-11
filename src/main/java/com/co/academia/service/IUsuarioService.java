package com.co.academia.service;

import com.co.academia.security.User;
import com.co.academia.model.Usuario;

import reactor.core.publisher.Mono;

public interface IUsuarioService extends ICRUD<Usuario, String>{
	
	Mono<User> buscarPorUsuario(String usuario);
}
