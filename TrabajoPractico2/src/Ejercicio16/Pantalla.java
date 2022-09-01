package Ejercicio16;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JButton;

public class Pantalla extends JFrame {

	private JPanel contentPane;
	private JTextField txtHi;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla frame = new Pantalla();
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
	public Pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 103);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel Texto = new JLabel("Ingresa tu nombre");
		Texto.setFont(new Font("Tahoma", Font.ITALIC, 14));
		Texto.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(Texto, BorderLayout.NORTH);
		
		txtHi = new JTextField();
		txtHi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHi.setHorizontalAlignment(SwingConstants.CENTER);
		txtHi.setDropMode(DropMode.INSERT_COLS);
		contentPane.add(txtHi, BorderLayout.CENTER);
		txtHi.setColumns(10);
		
		JButton Boton = new JButton("Saludar");
		Boton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(Boton, BorderLayout.EAST);
	}

}
