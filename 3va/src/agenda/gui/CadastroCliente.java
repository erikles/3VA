package agenda.gui;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import entidades.Cliente;
import negocio.ControladorCliente;

import javax.swing.JComboBox;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JTextPane;

public class CadastroCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNome;
	private JTextField txtRG;
	private JTextField txtCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CadastroCliente dial = new CadastroCliente();
			dial.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dial.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CadastroCliente() {
		setModal(true);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 713, 320);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 51, 380, 106);
		contentPanel.add(panel);
		panel.setLayout(null);
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(20, 11, 80, 14);
		panel.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(88, 8, 251, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblRG = new JLabel("RG:");
		lblRG.setBounds(20, 76, 80, 14);
		panel.add(lblRG);

		txtRG = new JTextField();
		txtRG.setBounds(88, 73, 251, 20);
		panel.add(txtRG);
		txtRG.setColumns(10);

		JLabel lblCPF_1 = new JLabel("CPF:");
		lblCPF_1.setBounds(20, 42, 80, 14);
		panel.add(lblCPF_1);

		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(88, 39, 251, 20);
		panel.add(txtCPF);

		JLabel lblNewLabel = new JLabel("Cadastro de Cliente");
		lblNewLabel.setFont(new Font("Product Sans", Font.BOLD, 17));
		lblNewLabel.setBounds(114, 11, 190, 29);
		contentPanel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 156, 370, 57);
		contentPanel.add(panel_1);

		JButton btnNewButton_1_1 = new JButton("Cadastrar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Cliente cliente = new Cliente();
				cliente.setNome(txtNome.getText());
				cliente.setCpf(txtCPF.getText());
				cliente.setRg(txtRG.getText());

				if (ControladorCliente.getInstancia().inserir(cliente)) {
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
					txtNome.setText("");
					txtCPF.setText("");
					txtRG.setText("");

				}

			}
		});
		btnNewButton_1_1.setBounds(117, 11, 116, 32);
		panel_1.add(btnNewButton_1_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 215, 380, 33);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton cancelButton = new JButton("Voltar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						MenuPrincipal telaPrincipal =  new MenuPrincipal();
						dispose(); telaPrincipal.setVisible(true); 
					
					}
					
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);

			}
		}
	}
}

