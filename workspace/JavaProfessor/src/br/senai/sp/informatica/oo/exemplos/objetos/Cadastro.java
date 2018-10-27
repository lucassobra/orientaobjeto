package br.senai.sp.informatica.oo.exemplos.objetos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Cadastro extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JLabel lblCdigo;
	private JTextField tfCodigo;
	private JLabel lblNome;
	private JTextField tfNome;
	private JLabel lblCpf;
	private JTextField tfCPF;
	private JButton btnSalvar;
	private JButton btnListar;
	private JButton btnSair;
	
	// TODO: declarar uma lista para armazenar os clientes
	private List<Cliente> lista = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 213);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblCdigo = new JLabel("Código");
		
		tfCodigo = new JTextField();
		tfCodigo.setColumns(10);
		
		lblNome = new JLabel("Nome");
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		
		lblCpf = new JLabel("CPF");
		
		tfCPF = new JTextField();
		tfCPF.setColumns(10);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		
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
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblCdigo)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(tfCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNome)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(tfNome, GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)))
							.addGap(8))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblCpf)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfCPF, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnSalvar)
							.addGap(93)
							.addComponent(btnListar)
							.addPreferredGap(ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
							.addComponent(btnSair)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCdigo)
						.addComponent(tfCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCpf)
						.addComponent(tfCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnSair)
						.addComponent(btnListar))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	public void actionPerformed(ActionEvent ev) {
		Object botao = ev.getSource();
		
		if(botao.equals(btnSalvar)) { 
			// TODO: obter os campos da tela para criar um objeto cliente
			//       e armazenar a lista
			Cliente cliente = new Cliente();
			
			cliente.setCodigo(Integer.parseInt(tfCodigo.getText()));
			cliente.setNome(tfNome.getText());
			cliente.setCpf(tfCPF.getText());
			
			lista.add(cliente);
			
			// Limpar os dados da Tela
			tfCodigo.setText("");
			tfNome.setText("");
			tfCPF.setText("");
			tfCodigo.requestFocus();
		} else if(botao.equals(btnListar)) {
			// Ordenar a lista de Clientes
			Collections.sort(lista, 
					Comparator.comparing(Cliente::getCodigo)
							.thenComparing(Cliente::getNome)
					);
			
			// TODO: relacionar todos os clientes cadastrados e
			//       apresentar na tela
			String msg = "Cadastro de Clientes\n\n";
			for (Cliente cliente : lista) {
				msg += cliente + "\n";
			}
			JOptionPane.showMessageDialog(this, msg);
		} else {
			System.exit(0);
		}
	}
}
