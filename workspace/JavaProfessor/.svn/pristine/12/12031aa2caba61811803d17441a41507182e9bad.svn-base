package br.senai.sp.informatica.oo.resposta.ex04.model;

import java.time.LocalDate;

public class Alimenticio extends Produto {
	private LocalDate validade;
	private LocalDate producao;

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	public LocalDate getProducao() {
		return producao;
	}

	public void setProducao(LocalDate producao) {
		this.producao = producao;
	}

	@Override
	public String toString() {
		return super.toString() + String.format(" validade: %1$Td/%1$tm/%1$TY producao: %2$Td/%2$tm/%2$TY",
				validade, producao);
	}

}
