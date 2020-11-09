package agenda.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import negocio.ControladorCliente;
import entidades.Cliente;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.List;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class TelaListaUsuarios extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListaUsuarios frame = new TelaListaUsuarios();
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
	public TelaListaUsuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LISTAGEM DE CLIENTES CADASTRADOS");
		lblNewLabel.setFont(new Font("Product Sans", Font.BOLD, 15));
		lblNewLabel.setBounds(37, 11, 298, 19);
		panel.add(lblNewLabel);
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal voltarMenu = new MenuPrincipal();
				dispose(); voltarMenu.setVisible(true); 
			}
		});
		btnVoltar.setBounds(275, 217, 89, 23);
		panel.add(btnVoltar);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(37, 62, 298, 32);
		panel.add(comboBox);
		
		comboBox.removeAllItems();
		for (Cliente tabela : ControladorCliente.getInstancia().localizarTodos()) {
			comboBox.addItem(tabela.toString());
			
		}
		
	
		
		
		
		
	
		
		
	}
}
