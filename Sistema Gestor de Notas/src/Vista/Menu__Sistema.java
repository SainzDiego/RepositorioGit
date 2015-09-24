package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu__Sistema extends JFrame {

	private JPanel contentPane;

	
	public Menu__Sistema() {
		setTitle("ADMINISTRADOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 407, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnListaDocentes = new JTextPane();
		txtpnListaDocentes.setText("Lista Docentes");
		txtpnListaDocentes.setBounds(10, 49, 176, 133);
		contentPane.add(txtpnListaDocentes);
		
		JLabel lblUniversidadSalesianaDe = new JLabel("UNIVERSIDAD SALESIANA DE BOLIVIA");
		lblUniversidadSalesianaDe.setBounds(119, 11, 199, 14);
		contentPane.add(lblUniversidadSalesianaDe);
		
		JButton btnNewButton = new JButton("Nuevo Usuario");
		btnNewButton.setBounds(258, 91, 120, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modificar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(258, 125, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.setBounds(258, 159, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Salir");
		btnNewButton_3.setBounds(147, 193, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Registrar Docente");
		btnNewButton_4.setBounds(258, 57, 120, 23);
		contentPane.add(btnNewButton_4);
	}
}
