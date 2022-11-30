package br.edu.infnet.loja.resources.dto;

public class ClienteDTO {

	private Long codigo;

	private String nome;

	private String email;

	private String endereco;
	
	public ClienteDTO() {
		// TODO Auto-generated constructor stub
	}

	public ClienteDTO(Long codigo, String nome, String email, String endereco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco + "]";
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
