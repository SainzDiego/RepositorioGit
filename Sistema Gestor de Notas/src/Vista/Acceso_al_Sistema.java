package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Acceso_al_Sistema extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceso_al_Sistema frame = new Acceso_al_Sistema();
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
	public Acceso_al_Sistema() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Acceso_al_Sistema.class.getResource("/Inagenes/inicio.png")));
		setTitle("Acceso al Sistema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(56, 131, 46, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContracea = new JLabel("Contrace\u00F1a:");
		lblContracea.setBounds(56, 175, 71, 14);
		contentPane.add(lblContracea);
		
		textField = new JTextField();
		textField.setBounds(134, 128, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(134, 169, 147, 20);
		contentPane.add(passwordField);
		
		JButton btnIniciar = new JButton("Iniciar seción");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnIniciar.setBounds(116, 227, 104, 23);
		contentPane.add(btnIniciar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Acceso_al_Sistema.class.getResource("/Inagenes/inicio.png")));
		label.setBounds(134, 23, 71, 79);
		contentPane.add(label);
	}
}
