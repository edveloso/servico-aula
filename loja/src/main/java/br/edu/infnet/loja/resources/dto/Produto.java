package br.edu.infnet.loja.resources.dto;

public class Produto {

	private Long id;
	
	private String nome;
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	public Produto(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + "]";
	}
	
}
