package agenda.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import agenda.gui.CadastroCliente;
import agenda.gui.TelaOS;

public class MenuPrincipal extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal window = new MenuPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblClientes_1 = new JLabel("MENU");
		lblClientes_1.setFont(new Font("Product Sans", Font.PLAIN, 20));
		lblClientes_1.setBounds(153, 11, 64, 39);
		frame.getContentPane().add(lblClientes_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 47, 319, 196);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnCadastroClientes = new JButton("Cadastrar Clientes");
		btnCadastroClientes.setFont(new Font("Product Sans", Font.BOLD, 12));
		btnCadastroClientes.setBounds(77, 11, 168, 55);
		panel.add(btnCadastroClientes);
		
		
		JButton btnListarClientes = new JButton("Listar Clientes");
		btnListarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaListaUsuarios telaLU = new TelaListaUsuarios();
				telaLU.setVisible(true);
			}
		});
		btnListarClientes.setFont(new Font("Product Sans", Font.BOLD, 12));
		btnListarClientes.setBounds(24, 143, 118, 23);
		panel.add(btnListarClientes);
		
		JButton btnAgendarServico = new JButton("Agendar Servi\u00E7o");
		btnAgendarServico.setFont(new Font("Product Sans", Font.BOLD, 12));
		btnAgendarServico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//Mudar para tela da ordem de servi
				TelaOS telaOS = new TelaOS();
				dispose();
				telaOS.setVisible(true);
			}
		});
		
		btnAgendarServico.setBounds(77, 77, 168, 55);
		panel.add(btnAgendarServico);
		
		JButton btnListarServicos = new JButton("Listar Servi\u00E7os");
		btnListarServicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaListaServico telaLR = new TelaListaServico();
				dispose();
				telaLR.setVisible(true);
			}
		});
		btnListarServicos.setFont(new Font("Product Sans", Font.BOLD, 12));
		btnListarServicos.setBounds(180, 143, 118, 23);
		panel.add(btnListarServicos);
		
		
		btnCadastroClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroCliente cadCliente = new CadastroCliente();
				dispose();
				cadCliente.setVisible(true);
			}
		});
		
		frame.setVisible(true);
	}
}

