package br.edu.infnet.cli.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.cli.modelo.entidade.Cliente;
import br.edu.infnet.cli.modelo.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/{email}")
	public Cliente getClientesByEmail(@PathVariable String email) {
		return clienteService.getClienteByEmail(email);
	}
	
}
