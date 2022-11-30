package br.edu.infnet.loja.resources.dto;

public class EnderecoDTO {

	private String rua;
	private Long numero;
	private String estado;
	
	public EnderecoDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public EnderecoDTO(String rua, Long numero, String estado) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.estado = estado;
	}



	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "EnderecoDTO [rua=" + rua + ", numero=" + numero + ", estado=" + estado + "]";
	}
	
	
	
}
