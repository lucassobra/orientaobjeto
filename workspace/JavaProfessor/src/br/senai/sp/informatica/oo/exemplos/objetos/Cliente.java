package br.senai.sp.informatica.oo.exemplos.objetos;

public class Cliente {
	private int codigo;
	private String nome;
	private String cpf;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	@Override
	public String toString() {
		return "Codigo: " + codigo + " Nome: " + nome + " CPF: " + cpf;
	}

	/*
	 * 
	 * 1234, Ciclano de Souza, 123.123.123-23
	 * 
	 *  Codigo: 1234 Nome: Ciclano de Souza CPF: 123.123.123-23
	 * 
	 */
	
}
