package br.facisa.si.map.composite;

public class Jogador extends Component{
	
	private Integer numero;
	
	private String nome;

	public Jogador(Integer numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	

}
