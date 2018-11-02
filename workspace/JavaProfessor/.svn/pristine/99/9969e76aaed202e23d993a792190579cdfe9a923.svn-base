package br.senai.sp.informatica.oo.exemplos.objetos.agregacao.itemDePedido.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import br.senai.sp.informatica.oo.exemplos.objetos.agregacao.itemDePedido.model.Produto;

@SuppressWarnings("serial")
public class CadastroDeProduto extends JDialog implements ActionListener {
	private final JPanel contentPanel = new JPanel();
	private JTextField tfNome;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTextArea tfDesc;
	private JLabel lblPreo;
	private JTextField tfPreco;
	private JButton btnSalvar;
	private JButton btnFechar;

	private NumberFormat formataNumero = NumberFormat.getNumberInstance();
	
	{
		formataNumero.setMaximumFractionDigits(2);
		formataNumero.setMinimumFractionDigits(2);
	}
	
	private Produto meuProduto;

	public CadastroDeProduto(Produto prod) {
		setModal(true);
		setTitle("Cadastro de Produto");
		setBounds(100, 100, 450, 334);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblNome = new JLabel("Nome");
		tfNome = new JTextField();
		tfNome.setColumns(10);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Descri\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		lblPreo = new JLabel("Preço");
		
		tfPreco = new JTextField();
		tfPreco.setColumns(10);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		
		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(this);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblNome)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblPreo)
							.addGap(18)
							.addComponent(tfPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(btnSalvar)
							.addPreferredGap(ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
							.addComponent(btnFechar)))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPreo)
						.addComponent(tfPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnFechar))
					.addContainerGap())
		);
		
		scrollPane = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		tfDesc = new JTextArea();
		scrollPane.setViewportView(tfDesc);
		panel.setLayout(gl_panel);
		contentPanel.setLayout(gl_contentPanel);

		meuProduto = prod;
		tfNome.setText(meuProduto.getNome());
		tfDesc.setText(meuProduto.getDescricao());
		tfPreco.setText(formataNumero.format(meuProduto.getPrecoUnitario()));
	}

	public void actionPerformed(ActionEvent evento) {
		Object botao = evento.getSource();
		try {
			if(botao.equals(btnSalvar)) {
				meuProduto.setNome(tfNome.getText());
				meuProduto.setDescricao(tfDesc.getText());
				meuProduto.setPrecoUnitario(formataNumero.parse(tfPreco.getText()).doubleValue());
			}
			
			setVisible(false);
		} catch(ParseException ex) {
			JOptionPane.showMessageDialog(this, "Preço inválido");
		}
	}
}









