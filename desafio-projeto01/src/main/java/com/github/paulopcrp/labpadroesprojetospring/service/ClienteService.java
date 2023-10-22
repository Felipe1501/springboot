package com.github.paulopcrp.labpadroesprojetospring.service;

import com.github.paulopcrp.labpadroesprojetospring.model.Cliente;

/*
 * @author paulopcrp
 * */

public interface ClienteService {
	Iterable<Cliente> buscarTodos();
	Cliente buscarPorId(Long id);
	void inserir(Cliente cliente);
	void atualizar(Long id, Cliente cliente);
	void deletar(Long id);

}
