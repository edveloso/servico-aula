package br.edu.infnet.loja.resources.dto;

public class ItemProdutoDTO {

	private Long id;
	private Long quantidade;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "ItemProdutoDTO [id=" + id + ", quantidade=" + quantidade + "]";
	}
	
}
