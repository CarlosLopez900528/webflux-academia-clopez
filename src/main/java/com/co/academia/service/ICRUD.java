package com.co.academia.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICRUD<T, ID> {

	Mono<T> registar(T t);

	Mono<T> modificar(T t);

	Flux<T> listar();

	Mono<T> listarPorId(ID id);

	Mono<Void> eliminar(ID id);
}
