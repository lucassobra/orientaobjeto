package br.senai.sp.informatica.oo.exemplos.objetos.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MinhaPrimeiraTela {
	public static void main(String[] args) {
		JFrame tela = new JFrame("Minha Primeira Tela");
		
		JPanel painel = new JPanel();
		painel.add(new JLabel("Nome"));
		JTextField tfNome = new JTextField(10);
		painel.add(tfNome);
		
		tela.add(painel, BorderLayout.CENTER);
		
		JButton btOk = new JButton("OK");
		btOk.addActionListener(ev -> {
				String nome = tfNome.getText();
				JOptionPane.showMessageDialog(tela, nome + 
						", cadastrado com sucesso");
				tfNome.setText("");
				tfNome.requestFocus();
			});
		
		tela.add(btOk, BorderLayout.SOUTH);
		tela.pack();
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
	}
}
