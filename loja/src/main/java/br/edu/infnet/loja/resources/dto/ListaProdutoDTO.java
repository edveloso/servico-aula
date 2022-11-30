package br.edu.infnet.loja.resources.dto;

import java.util.List;

public class ListaProdutoDTO {

	private List<Produto> produtos;

	
	public ListaProdutoDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public ListaProdutoDTO(List<Produto> produtos) {
		super();
		this.produtos = produtos;
	}



	@Override
	public String toString() {
		return "ListaProdutoDTO [produtos=" + produtos + "]";
	}



	public List<Produto> getProdutos() {
		return produtos;
	}



	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
}
