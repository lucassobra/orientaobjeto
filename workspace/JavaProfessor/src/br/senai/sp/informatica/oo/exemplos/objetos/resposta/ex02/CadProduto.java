package br.senai.sp.informatica.oo.exemplos.objetos.resposta.ex02;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

@SuppressWarnings({"serial", "rawtypes", "unchecked" })
public class CadProduto extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNome;
	private JTextField tfNome;
	private JLabel lblDescr;
	private JTextField tfDescr;
	private JLabel lblDataDeValidade;
	private JTextField tfData;
	private JLabel lblTipo;
	private JComboBox comboBox;
	private JButton btnSalvar;
	private JButton btnListar;
	private JButton btnSair;
	private JButton btnListarPorTipo;
	
	private List<Produto> lista = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadProduto frame = new CadProduto();
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
	public CadProduto() {
		setTitle("Cadastro de Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 209);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblNome = new JLabel("Nome");
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		
		lblDescr = new JLabel("Descr.");
		
		tfDescr = new JTextField();
		tfDescr.setColumns(10);
		
		lblDataDeValidade = new JLabel("Data de Validade");
		
		tfData = new JTextField();
		tfData.setColumns(10);
		
		lblTipo = new JLabel("Tipo");
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(TipoDeProduto.values()));
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		
		btnListar = new JButton("Listar por Nome");
		btnListar.addActionListener(this);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(this);
		
		btnListarPorTipo = new JButton("Listar por Tipo");
		btnListarPorTipo.addActionListener(this);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(8)
					.addComponent(btnSalvar)
					.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
					.addComponent(btnListar)
					.addGap(56)
					.addComponent(btnListarPorTipo)
					.addGap(39)
					.addComponent(btnSair)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNome)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDescr)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfDescr, GroupLayout.PREFERRED_SIZE, 464, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDataDeValidade)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfData, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblTipo)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)))
					.addGap(15))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(8, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDescr)
						.addComponent(tfDescr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDataDeValidade)
						.addComponent(tfData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTipo)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSalvar, Alignment.TRAILING)
						.addComponent(btnListar, Alignment.TRAILING)
						.addComponent(btnListarPorTipo, Alignment.TRAILING)
						.addComponent(btnSair, Alignment.TRAILING))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	public void actionPerformed(ActionEvent ev ) {
		Object botao = ev.getSource();

		if(botao.equals(btnSalvar)) {
			Produto produto = new Produto();
			produto.setNome(tfNome.getText());
			produto.setDescricao(tfDescr.getText());
			produto.setDataValidade(tfData.getText());
			produto.setTipo((TipoDeProduto)comboBox.getSelectedItem());
			
			lista.add(produto);
			
			tfNome.setText("");
			tfDescr.setText("");
			tfData.setText("");
			comboBox.setSelectedIndex(0);
			tfNome.requestFocus();
		} else if(botao.equals(btnListar)) {
			JOptionPane.showMessageDialog(this, "Lista de Produtos por Nome\n\n" +
					lista.stream()
						.sorted(Comparator.comparing(Produto::getNome))
						.map(Produto::toString)
						.collect(Collectors.joining("\n")));
		} else if(botao.equals(btnListarPorTipo)) {
			JOptionPane.showMessageDialog(this, "Lista de Produtos por Tipo e Nome\n\n" +
					lista.stream()
						.sorted(Comparator.comparing(Produto::getTipo)
								.thenComparing(Produto::getNome))
						.map(Produto::toString)
						.collect(Collectors.joining("\n")));
		} else {
			System.exit(0);
		}
	}
}
