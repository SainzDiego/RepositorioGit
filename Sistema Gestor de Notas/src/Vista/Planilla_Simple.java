package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class Planilla_Simple extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Planilla_Simple frame = new Planilla_Simple();
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
	public Planilla_Simple() {
		setTitle("Planilla Simple");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNonmbre = new JLabel("UNIVERSIDAD SALESIANA DE BOLIVIA");
		lblNonmbre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNonmbre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNonmbre.setToolTipText("");
		lblNonmbre.setBounds(160, 25, 345, 14);
		contentPane.add(lblNonmbre);
		
		JLabel lblSemestre = new JLabel("Semestre:");
		lblSemestre.setBounds(46, 84, 54, 14);
		contentPane.add(lblSemestre);
		
		JLabel lblGestion = new JLabel("Gestion:");
		lblGestion.setBounds(46, 109, 46, 14);
		contentPane.add(lblGestion);
		
		JLabel lblGrupo = new JLabel("Grupo");
		lblGrupo.setBounds(46, 134, 46, 14);
		contentPane.add(lblGrupo);
		
		textField = new JTextField();
		textField.setBounds(110, 81, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 106, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 131, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Planilla_Simple.class.getResource("/Inagenes/salesian.jpg")));
		lblNewLabel_3.setBounds(372, 66, 299, 104);
		contentPane.add(lblNewLabel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 181, 625, 109);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Nombre", "Apellido Paterno", "Apellido Materno", "Asistencia", "Pacticas", "Participaci\u00F3n", "Examen", "Nota Final"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnAddFila = new JButton("A\u00F1adir fila");
		btnAddFila.setBounds(46, 312, 89, 23);
		contentPane.add(btnAddFila);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(160, 312, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(273, 312, 89, 23);
		contentPane.add(btnSalir);
	}
}
