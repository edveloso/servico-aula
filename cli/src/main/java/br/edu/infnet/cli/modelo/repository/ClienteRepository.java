package br.edu.infnet.cli.modelo.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.cli.modelo.entidade.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{

	Cliente findByEmail(String email);
	
}
