package br.edu.infnet.cli.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.cli.modelo.entidade.Cliente;
import br.edu.infnet.cli.modelo.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente getClienteByEmail(String email) {
		Cliente cliente = clienteRepository.findByEmail(email);
		cliente.setEmail(cliente.getEmail() + " from instance 2");
		return cliente;
	}
	
	
	
	
}
