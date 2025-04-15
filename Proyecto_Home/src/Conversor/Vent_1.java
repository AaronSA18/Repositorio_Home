package Conversor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vent_1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDato;
	private JButton btnF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vent_1 frame = new Vent_1();
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
	public Vent_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese dato :");
		lblNewLabel.setBounds(22, 11, 80, 14);
		contentPane.add(lblNewLabel);
		
		txtDato = new JTextField();
		txtDato.setBounds(109, 8, 86, 20);
		contentPane.add(txtDato);
		txtDato.setColumns(10);
		
		btnF = new JButton("Celsius a Fahrenheit");
		btnF.addActionListener(this);
		btnF.setBounds(247, 7, 145, 23);
		contentPane.add(btnF);
		
		btnKilmetrosAMillas = new JButton("kilómetros a millas");
		btnKilmetrosAMillas.addActionListener(this);
		btnKilmetrosAMillas.setBounds(247, 40, 145, 23);
		contentPane.add(btnKilmetrosAMillas);
		
		btnMinSeg = new JButton("seg. a min. y seg.");
		btnMinSeg.addActionListener(this);
		btnMinSeg.setBounds(247, 74, 145, 23);
		contentPane.add(btnMinSeg);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 113, 378, 105);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnMinSeg) {
			do_btnMinSeg_actionPerformed(e);
		}
		if (e.getSource() == btnKilmetrosAMillas) {
			do_btnKilmetrosAMillas_actionPerformed(e);
		}
		if (e.getSource() == btnF) {
			do_btnF_actionPerformed(e);
		}
	}
	Conversor a1;
	private JTextArea txtS;
	private JButton btnKilmetrosAMillas;
	private JButton btnMinSeg;
	protected void do_btnF_actionPerformed(ActionEvent e) {
		
		double dato = Double.parseDouble(txtDato.getText());
		a1 = new Conversor(dato);
		Imprimir("Farentheir : "+ a1.fare());
		
	}
	void Imprimir(String a) {
		txtS.append(a + "\n");
		
	}
	
	protected void do_btnKilmetrosAMillas_actionPerformed(ActionEvent e) {
		double dato = Double.parseDouble(txtDato.getText());
		a1 = new Conversor(dato);
		Imprimir("Millas : "+ a1.millas());
	}
	protected void do_btnMinSeg_actionPerformed(ActionEvent e) {
		double dato = Double.parseDouble(txtDato.getText());
		a1 = new Conversor(dato);
		Imprimir("Min : "+a1.min()+"\tSeg:"+a1.seg());
	}
}
