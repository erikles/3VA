package agenda.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import negocio.ControladorCliente;
import negocio.ControladorOrdemServico;
import entidades.Cliente;
import entidades.OrdemServico;
import java.awt.Component;
import javax.swing.Box;
import com.toedter.calendar.JCalendar;

public class TelaOS extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtTipoServico;
	private JTextField txtValorServico;
	private JTextField txtCPF;

	private static Cliente cliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TelaOS dialog = new TelaOS();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TelaOS() {

		setModal(true);
		setBounds(100, 100, 400, 600);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 384, 107);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);

		JLabel lblOS = new JLabel("Ordem de Servi\u00E7o");
		lblOS.setFont(new Font("Product Sans", Font.BOLD, 17));
		lblOS.setBounds(105, 11, 190, 29);
		contentPanel.add(lblOS);

		JLabel lblNomeCliente = new JLabel("Nome:");
		lblNomeCliente.setFont(new Font("Product Sans", Font.BOLD, 14));
		lblNomeCliente.setBounds(10, 88, 80, 14);
		contentPanel.add(lblNomeCliente);

		JLabel lblCPD = new JLabel("CPF:");
		lblCPD.setFont(new Font("Product Sans", Font.BOLD, 14));
		lblCPD.setBounds(10, 63, 80, 14);
		contentPanel.add(lblCPD);

		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(73, 61, 169, 20);
		contentPanel.add(txtCPF);

		JButton btnBuscarCpf = new JButton("Buscar CPF");
		btnBuscarCpf.setActionCommand("OK");
		btnBuscarCpf.setBounds(250, 60, 118, 23);
		contentPanel.add(btnBuscarCpf);

		JLabel lblResultNome = new JLabel("[Nome do cliente]");
		lblResultNome.setFont(new Font("Product Sans", Font.ITALIC, 14));
		lblResultNome.setBounds(73, 88, 295, 14);
		contentPanel.add(lblResultNome);

		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(39, 0, 1, 20);
		contentPanel.add(verticalStrut);

		// Buscar o CPF e preencher os campos com dados do cliente
		btnBuscarCpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				cliente = ControladorCliente.getInstancia().localizar(txtCPF.getText());
				lblResultNome.setText(cliente.getNome());

			}

		});

		JLabel lblTipoServico = new JLabel("Tipo de servi\u00E7o:");
		lblTipoServico.setFont(new Font("Product Sans", Font.BOLD, 14));
		lblTipoServico.setBounds(10, 114, 113, 14);
		getContentPane().add(lblTipoServico);

		txtTipoServico = new JTextField();
		txtTipoServico.setColumns(10);
		txtTipoServico.setBounds(75, 133, 166, 20);
		getContentPane().add(txtTipoServico);

		JLabel lblDescricao = new JLabel("Descricao do servi\u00E7o:");
		lblDescricao.setFont(new Font("Product Sans", Font.BOLD, 14));
		lblDescricao.setBounds(10, 164, 146, 14);
		getContentPane().add(lblDescricao);

		JTextArea txtAreaServico = new JTextArea();
		txtAreaServico.setWrapStyleWord(true);
		txtAreaServico.setBounds(70, 189, 281, 100);
		getContentPane().add(txtAreaServico);

		JLabel lblPrecoServico = new JLabel("Valor do Servi\u00E7o:");
		lblPrecoServico.setFont(new Font("Product Sans", Font.BOLD, 14));
		lblPrecoServico.setBounds(10, 300, 125, 14);
		getContentPane().add(lblPrecoServico);

		txtValorServico = new JTextField();
		txtValorServico.setColumns(10);
		txtValorServico.setBounds(70, 325, 166, 20);
		getContentPane().add(txtValorServico);

		JLabel lblDataDoAgendamento = new JLabel("Data do Agendamento do Servi\u00E7o:");
		lblDataDoAgendamento.setFont(new Font("Product Sans", Font.BOLD, 14));
		lblDataDoAgendamento.setBounds(10, 348, 231, 14);
		getContentPane().add(lblDataDoAgendamento);

		JCalendar calendar = new JCalendar();
		calendar.setBounds(70, 373, 205, 153);
		getContentPane().add(calendar);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				OrdemServico ordemS = new OrdemServico();

				ordemS.setCliente(cliente);
				ordemS.setValorTotal(Double.parseDouble(txtValorServico.getText()));
				ordemS.setDataAgendamento(calendar.getDate());

				if (ControladorOrdemServico.getInstancia().inserir(ordemS)) {
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
				}
			}

		});

		btnSalvar.setFont(new Font("Product Sans", Font.BOLD, 11));
		btnSalvar.setBounds(186, 527, 89, 23);
		getContentPane().add(btnSalvar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});
		btnCancelar.setFont(new Font("Product Sans", Font.BOLD, 11));
		btnCancelar.setBounds(285, 527, 89, 23);
		getContentPane().add(btnCancelar);
	}
}

