/**
 * Albert Notario Mestres
 */

package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Ej2VentanaInteraccion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void vista() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej2VentanaInteraccion frame = new Ej2VentanaInteraccion();
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
	public Ej2VentanaInteraccion() {
		setTitle("Ventana con interacción");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblNewLabel = new JLabel("Has pulsado:");
		lblNewLabel.setBounds(10, 15, 216, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Botón 2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Has pulsado: Botón 2");
			}
		});
		btnNewButton.setBounds(335, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Botón 1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Has pulsado: Botón 1");
			}
		});
		btnNewButton_1.setBounds(236, 11, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
