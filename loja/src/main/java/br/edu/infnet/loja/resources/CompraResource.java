package br.edu.infnet.loja.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.edu.infnet.loja.clients.ProdutoClient;
import br.edu.infnet.loja.resources.dto.ClienteDTO;
import br.edu.infnet.loja.resources.dto.CompraDTO;

@RestController
@RequestMapping("/compra")
public class CompraResource {
	
	private static final Logger LOG = LoggerFactory.getLogger(CompraResource.class.getName());

	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ProdutoClient cliente;
	
	@Value("${cliente.url}")
	private String clienteUrl;
	
	@PutMapping
	public void realizaCompra(@RequestBody CompraDTO compra) {
		System.out.println(compra);
//		
//		ResponseEntity<ClienteDTO> ret = 
//				restTemplate.exchange("http://cliente/clientes/su@email.com", HttpMethod.GET, null, ClienteDTO.class);
//		System.out.println(ret.getBody());
//		System.out.println("passou");
		
		ClienteDTO dto = restTemplate.getForObject(clienteUrl, ClienteDTO.class);
//		List<Produto> produtos = (List<Produto>) restTemplate.getForObject(catalogoUrl, List.class);
//		System.out.println(produtos);
		LOG.info(dto.toString());
		System.out.println(dto);
		
		System.out.println(cliente.getProdutos().getBody());
		LOG.info(cliente.getProdutos().getBody().toString());
		
		
	}
	
}
