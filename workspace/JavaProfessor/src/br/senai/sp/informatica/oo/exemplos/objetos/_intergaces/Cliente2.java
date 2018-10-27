package br.senai.sp.informatica.oo.exemplos.objetos._intergaces;

class Cliente2  {
	private int codigo;
	private String nome;
	private String cpf;
	
	public Cliente2() {
	}

	public Cliente2(int codigo, String nome, String cpf) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
	}

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
		return "codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf ;
	}

	
}