package br.senai.sp.informatica.oo.exemplos.objetos.agregacao.itemDePedido.model;

import lombok.Data;

@Data
public class Produto {
	private String nome;
	private String descricao;
	private double precoUnitario;
}
