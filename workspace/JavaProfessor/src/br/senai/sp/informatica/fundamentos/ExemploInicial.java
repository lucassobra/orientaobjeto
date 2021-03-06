package br.senai.sp.informatica.fundamentos;

import javax.swing.JOptionPane;

public class ExemploInicial {
	public static void main(String[] args) {
		try {
			String nome = JOptionPane.showInputDialog("Informe seu nome");
			JOptionPane.showMessageDialog(null, "Bem Vindo!, " + nome);

			String temp = JOptionPane.showInputDialog("Informe seu salário");
			double salario = Double.parseDouble(temp);

			salario = salario * 1.1;

			JOptionPane.showMessageDialog(null, "Seu salário é R$" + salario);
			System.out.println("Passou aqui");
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "O salário informado é inválido");
		} finally {
			System.out.println("Fim");
		}
	}
}
