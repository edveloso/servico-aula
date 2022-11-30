package br.edu.infnet.loja.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.infnet.loja.resources.dto.Produto;


@FeignClient("catalogo")
public interface ProdutoClient {

	@RequestMapping("/produtos")
	ResponseEntity<List<Produto>> getProdutos();
	
}
