package agenda.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entidades.Cliente;
import entidades.OrdemServico;
import negocio.ControladorCliente;
import negocio.ControladorOrdemServico;

public class TelaListaServico extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListaServico frame = new TelaListaServico();
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
	public TelaListaServico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LISTAGEM DE SERVI\u00C7OS CADASTRADOS");
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
		for (OrdemServico tabela : ControladorOrdemServico.getInstancia().localizarTodos()) {
			tabela.toString();
			comboBox.addItem(tabela);
			
		}
		
	
		
		
		
		
	
		
		
	}
}
