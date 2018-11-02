package br.senai.sp.informatica.oo.exemplos.objetos.agregacao.itemDePedido.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import br.senai.sp.informatica.oo.exemplos.objetos.agregacao.itemDePedido.model.ItemDePedido;
import br.senai.sp.informatica.oo.exemplos.objetos.agregacao.itemDePedido.model.Produto;
import br.senai.sp.informatica.oo.gui.lib.SwUtil;

@SuppressWarnings("serial")
public class CadastroDeItens extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnAdicionarProduto;
	private JLabel lblQtd;
	private JTextField tfQtd;
	private JButton btnIncluir;
	private JButton btnListar;
	private JButton btnSair;

	private List<ItemDePedido> itens = new ArrayList<>();
	private int numeroItem = 0;
	private Produto novoProduto = new Produto();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDeItens frame = new CadastroDeItens();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CadastroDeItens() {
		setTitle("Cadastro de Itens de Pedido");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 130);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnAdicionarProduto = new JButton("Adicionar Produto");
		btnAdicionarProduto.addActionListener(this);
		
		lblQtd = new JLabel("Qtd");
		
		tfQtd = new JTextField();
		tfQtd.setColumns(10);
		
		btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(this);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(this);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnIncluir)
							.addGap(64)
							.addComponent(btnListar))
						.addComponent(btnAdicionarProduto, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblQtd)
							.addGap(18)
							.addComponent(tfQtd, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnSair, Alignment.TRAILING))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAdicionarProduto)
						.addComponent(lblQtd)
						.addComponent(tfQtd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnIncluir)
						.addComponent(btnSair)
						.addComponent(btnListar))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	public void actionPerformed(ActionEvent evento) {
		Object botao = evento.getSource();
		
		if(botao.equals(btnAdicionarProduto)) {
			CadastroDeProduto dialog = new CadastroDeProduto(novoProduto);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);			
			dialog.setVisible(true);
		} else if(botao.equals(btnIncluir)) {
			String nome = novoProduto.getNome();
			double preco = novoProduto.getPrecoUnitario();
			if(nome != null && !nome.isEmpty() && preco != 0) {
				ItemDePedido novoItem = new ItemDePedido();
				novoItem.setNumero(++numeroItem);
				novoItem.setItem(novoProduto);
				novoItem.setQuantidade(Integer.parseInt(tfQtd.getText()));
				
				itens.add(novoItem);
				
				novoProduto = new Produto();
				SwUtil.limpa(this);
				btnAdicionarProduto.requestFocus();
			} else {
				JOptionPane.showMessageDialog(this, "É necessário determinar o nome o preço do Produto\n"
						+ "para a inclusão de um novo Item de Pedido");
			}
		} else if(botao.equals(btnListar)) {
			String msg = "Cadastro dos Itens do Pedito\n\n";
			for (ItemDePedido item : itens) {
				msg += item + "\n";
			}
			JOptionPane.showMessageDialog(this, msg);
		} else {
			System.exit(0);
		}
	}
}
