package teste;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		JOptionPane.showMessageDialog(null, "Bem vindo " + nome);
		
		String temp = JOptionPane.showInputDialog("Informe seu salario");
		double salario = Double.parseDouble(temp);
		
		salario = salario * 1.1;
		JOptionPane.showMessageDialog(null, "Seu salario é R$ " + salario);
	}

}
