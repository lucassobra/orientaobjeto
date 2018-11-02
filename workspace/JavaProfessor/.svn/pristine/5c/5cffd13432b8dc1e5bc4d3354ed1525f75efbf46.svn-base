package br.senai.sp.informatica.oo.resposta.ex04.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import br.senai.sp.informatica.oo.gui.lib.IntegerTextField;
import br.senai.sp.informatica.oo.gui.lib.LocalDateTextField;
import br.senai.sp.informatica.oo.gui.lib.NumberTextField;
import br.senai.sp.informatica.oo.gui.lib.OptionalTextField;
import br.senai.sp.informatica.oo.gui.lib.StatusValidador;
import br.senai.sp.informatica.oo.gui.lib.SwUtil;
import br.senai.sp.informatica.oo.gui.lib.VerificaInteiro;
import br.senai.sp.informatica.oo.gui.lib.VerificaLocalDate;
import br.senai.sp.informatica.oo.gui.lib.VerificaRegex;
import br.senai.sp.informatica.oo.gui.lib.VerificaValor;
import br.senai.sp.informatica.oo.resposta.ex04.model.Alimenticio;
import br.senai.sp.informatica.oo.resposta.ex04.model.Eletrodomestico;
import br.senai.sp.informatica.oo.resposta.ex04.model.Produto;

@SuppressWarnings("serial")
public class CadProdutos2 extends JFrame implements ActionListener, ChangeListener {

	private JPanel contentPane;
	private JLabel lblCd;
	private IntegerTextField tfCodigo;
	private JLabel lblDescr;
	private JTextField tfDescr;
	private JLabel lblValor;
	private NumberTextField tfValor;
	private JTabbedPane tabbedPane;
	private JPanel panelAliment;
	private JPanel panelEletro;
	private JLabel lblDateDeValidade;
	private LocalDateTextField tfValidade;
	private JLabel lblDataDeProduo;
	private LocalDateTextField tfProducao;
	private JLabel lblCdFornecedor;
	private IntegerTextField tfCodforn;
	private JLabel lblNomeFornecedor;
	private OptionalTextField tfNomeForn;
	private JButton btnInserir;
	private JButton btnListar;
	private JButton btnSair;
	
	private List<Produto> lista = new ArrayList<>();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadProdutos2 frame = new CadProdutos2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CadProdutos2() {
		setTitle("Cadastro de Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblCd = new JLabel("Cód.");
		
		tfCodigo = new IntegerTextField();
		tfCodigo.setInputVerifier(new VerificaInteiro());
		tfCodigo.setColumns(10);
		
		lblDescr = new JLabel("Descr.");
		
		tfDescr = new JTextField();
		tfDescr.setInputVerifier(new VerificaRegex(".*"));
		tfDescr.setColumns(10);
		
		lblValor = new JLabel("Valor");
		
		tfValor = new NumberTextField();
		tfValor.setInputVerifier(new VerificaValor());
		tfValor.setColumns(10);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addChangeListener(this);
		
		btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(this);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(this);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(tabbedPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(lblCd)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(lblDescr)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfDescr, GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(lblValor)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(btnInserir)
							.addGap(100)
							.addComponent(btnListar)
							.addPreferredGap(ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
							.addComponent(btnSair)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCd)
						.addComponent(tfCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDescr)
						.addComponent(tfDescr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblValor)
						.addComponent(tfValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnInserir)
						.addComponent(btnSair)
						.addComponent(btnListar))
					.addContainerGap())
		);
		
		panelAliment = new JPanel();
		tabbedPane.addTab("Alimentícios", null, panelAliment, null);
		
		lblDateDeValidade = new JLabel("Date de Validade");
		
		tfValidade = new LocalDateTextField();
		tfValidade.setInputVerifier(new VerificaLocalDate());
		tfValidade.setColumns(10);
		
		lblDataDeProduo = new JLabel("Data de Produção");
		
		tfProducao = new LocalDateTextField();
		tfProducao.setInputVerifier(new VerificaLocalDate());
		tfProducao.setColumns(10);
		
		GroupLayout gl_panelAliment = new GroupLayout(panelAliment);
		gl_panelAliment.setHorizontalGroup(
			gl_panelAliment.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAliment.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelAliment.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelAliment.createSequentialGroup()
							.addComponent(lblDateDeValidade)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfValidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelAliment.createSequentialGroup()
							.addComponent(lblDataDeProduo)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfProducao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(158, Short.MAX_VALUE))
		);
		gl_panelAliment.setVerticalGroup(
			gl_panelAliment.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAliment.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelAliment.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDateDeValidade)
						.addComponent(tfValidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelAliment.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDataDeProduo)
						.addComponent(tfProducao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(104, Short.MAX_VALUE))
		);
		panelAliment.setLayout(gl_panelAliment);
		
		panelEletro = new JPanel();
		tabbedPane.addTab("Eletrodomésticos", null, panelEletro, null);
		
		lblCdFornecedor = new JLabel("Cód. do Fornecedor");
		
		tfCodforn = new IntegerTextField();
		tfCodforn.setInputVerifier(new VerificaInteiro());
		tfCodforn.setColumns(10);
		
		lblNomeFornecedor = new JLabel("Nome do Fornecedor");
		
		tfNomeForn = new OptionalTextField();
		tfNomeForn.setInputVerifier(new VerificaRegex(".*"));
		tfNomeForn.setColumns(10);
		
		GroupLayout gl_panelEletro = new GroupLayout(panelEletro);
		gl_panelEletro.setHorizontalGroup(
			gl_panelEletro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEletro.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelEletro.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelEletro.createSequentialGroup()
							.addComponent(lblCdFornecedor)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfCodforn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelEletro.createSequentialGroup()
							.addComponent(lblNomeFornecedor)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfNomeForn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(158, Short.MAX_VALUE))
		);
		gl_panelEletro.setVerticalGroup(
			gl_panelEletro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEletro.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelEletro.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCdFornecedor)
						.addComponent(tfCodforn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelEletro.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomeFornecedor)
						.addComponent(tfNomeForn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(104, Short.MAX_VALUE))
		);
		panelEletro.setLayout(gl_panelEletro);
		contentPane.setLayout(gl_contentPane);
		
		setLocationRelativeTo(null);
		getRootPane().setDefaultButton(btnInserir);
		ajustaTela(false);
	}
	
	public void actionPerformed(ActionEvent ev) {
		Object botao = ev.getSource();
		
		if(botao.equals(btnInserir)) {
			StatusValidador verificacao = SwUtil.verificaStatus(this);
			if(verificacao.equals(StatusValidador.OK)) {
				Object aba = tabbedPane.getSelectedComponent();

				if(aba.equals(panelAliment)) {
					salvarProduto(new Alimenticio());
				} else {
					salvarProduto(new Eletrodomestico());
				}
				
				SwUtil.limpa(this);
				tfCodigo.requestFocus();
			} else if(verificacao.equals(StatusValidador.EM_BRANCO)) {
				JOptionPane.showMessageDialog(this, "Existem campos em BRANCO");
			} else {
				JOptionPane.showMessageDialog(this, "Existem campos com ERRO");
			}
		} else if(botao.equals(btnListar)) {
			JOptionPane.showMessageDialog(this,	"Cadastro de Produtos\n\n" +
						lista.stream()
							.map(Produto::toString)
							.collect(Collectors.joining("\n")));
		} else {
			System.exit(0);
		}
	}

	private void salvarProduto(Produto prod) {
		prod.setCodigo(tfCodigo.getValue());
		prod.setDescricao(tfDescr.getText());
		prod.setValor(tfValor.getValue());

		if(prod instanceof Alimenticio) {
			Alimenticio alimenticio = (Alimenticio)prod;
			alimenticio.setValidade(tfValidade.getValue());
			alimenticio.setProducao(tfProducao.getValue());
		} else {
			Eletrodomestico eletrodomestico = (Eletrodomestico)prod;
			eletrodomestico.setCodigoFornecedor(tfCodforn.getValue());
			eletrodomestico.setFornecedor(tfNomeForn.getText());
		}
		
		lista.add(prod);
	}
	
	@Override
	public void stateChanged(ChangeEvent evento) {
		if(tfNomeForn != null) {
			Object aba = tabbedPane.getSelectedComponent();
			
			if(aba.equals(panelAliment)) {
				ajustaTela(false);
			} else {
				ajustaTela(true);
			}
		}
	}
	
	private void ajustaTela(boolean valor) {
		tfValidade.setOptional(valor);
		tfProducao.setOptional(valor);
		
		tfCodforn.setOptional(!valor);
		tfNomeForn.setOptional(!valor);

	}
}
