package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Canvas;
import java.awt.List;
import javax.swing.JTextPane;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;


public class Menu_Docente extends JFrame{

	private JFrame frame;	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Docente window = new Menu_Docente();
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
	public Menu_Docente() {
		setTitle("Menu del Docente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnListaMaterias = new JTextPane();
		txtpnListaMaterias.setText("Lista Materias");
		txtpnListaMaterias.setBounds(10, 47, 138, 158);
		contentPane.add(txtpnListaMaterias);
		
		Label label = new Label("UNIVERSIDAD SALESIANA DE BOLIVIA");
		label.setBounds(102, 10, 212, 22);
		contentPane.add(label);
		
		JButton btnPlanillaSimple = new JButton("Planilla Simple");
		btnPlanillaSimple.setBounds(193, 76, 111, 23);
		contentPane.add(btnPlanillaSimple);
		
		JButton btnPlanillaCompuesta = new JButton("Planilla Compuesta");
		btnPlanillaCompuesta.setBounds(193, 111, 134, 23);
		contentPane.add(btnPlanillaCompuesta);
		
		JTextArea txtrPlanillaNueva = new JTextArea();
		txtrPlanillaNueva.setSelectionColor(Color.CYAN);
		txtrPlanillaNueva.setText("Planilla nueva:");
		txtrPlanillaNueva.setBounds(181, 47, 188, 100);
		contentPane.add(txtrPlanillaNueva);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(239, 182, 89, 23);
		contentPane.add(btnSalir);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

}
