package Proyecto_10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Interfaz_G extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnProbarCambio;
	private JButton btnLimpiar;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_G frame = new Interfaz_G();
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
	public Interfaz_G() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pos por probar no?");
		lblNewLabel.setBounds(10, 11, 134, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Procesar");
		btnNewButton.setBounds(149, 7, 89, 23);
		contentPane.add(btnNewButton);
		{
			btnProbarCambio = new JButton("Probar cambio");
			btnProbarCambio.setBounds(149, 60, 219, 23);
			contentPane.add(btnProbarCambio);
		}
		{
			btnLimpiar = new JButton("Limpiar");
			btnLimpiar.setBounds(119, 107, 219, 23);
			contentPane.add(btnLimpiar);
		}
		{
			lblNewLabel_1 = new JLabel("Pos por probar no?");
			lblNewLabel_1.setBounds(10, 31, 134, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Pos por probar no?");
			lblNewLabel_2.setBounds(10, 51, 134, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Pos por probar no?");
			lblNewLabel_3.setBounds(10, 69, 134, 14);
			contentPane.add(lblNewLabel_3);
		}
	}
}
