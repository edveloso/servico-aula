package br.edu.infnet.loja.resources.dto;

import java.util.ArrayList;
import java.util.List;

public class CompraDTO {
	
	private List<ItemProdutoDTO> itens;

	private EnderecoDTO endereco;

	public CompraDTO() {
	}

	public boolean adicionarItemProduto(ItemProdutoDTO produto) {
		if(itens == null) {
			itens = new ArrayList<>();
		}
		return itens.add(produto);
	}
	
	public List<ItemProdutoDTO> getItens() {
		return itens;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}

	public void setItens(List<ItemProdutoDTO> itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
		return "CompraDTO [itens=" + itens + ", endereco=" + endereco + "]";
	}
	
}
