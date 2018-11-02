package br.senai.sp.informatica.oo.resposta.ex04.model;

public class Eletrodomestico extends Produto {
	private int codigoFornecedor;
	private String fornecedor;

	public int getCodigoFornecedor() {
		return codigoFornecedor;
	}

	public void setCodigoFornecedor(int codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public String toString() {
		return super.toString() + " cod. Forn: " + codigoFornecedor + " nome forn.: " + fornecedor;
	}
}
