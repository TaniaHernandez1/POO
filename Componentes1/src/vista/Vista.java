package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.URL;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private Controlador controlador;
	private JButton btnHola;
	private JButton btnChau;
	private JLabel lblNewLabel;


	public Vista(Controlador controlador) {
		setControlador(controlador);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 917, 440);
		
		URL urlIcon = getClass().getResource("/img/32.png");
		ImageIcon icon = new ImageIcon(urlIcon);
		setIconImage(icon.getImage());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("HOLA BOTELLO");
		lblNewLabel.addMouseListener(getControlador());
		lblNewLabel.setBounds(340, 25, 490, 301);
		lblNewLabel.setText("");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/img/ungif.gif")));
		contentPane.add(lblNewLabel);
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton rdbtnA = new JRadioButton("A");
		rdbtnA.setBounds(21, 239, 45, 21);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("B");
		rdbtnB.setBounds(81, 239, 45, 21);
		contentPane.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("C");
		rdbtnC.setBounds(135, 239, 62, 21);
		contentPane.add(rdbtnC);
		
		group.add(rdbtnC);
		group.add(rdbtnB);
		group.add(rdbtnA);
		
		String[] planetas = {"Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno", "Urano"};
		
		JComboBox comboBox = new JComboBox(planetas);
		comboBox.setBounds(232, 280, 84, 22);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(167, 25, 149, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(21, 25, 136, 20);
		contentPane.add(passwordField);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(344, 311, 126, 71);
		contentPane.add(textArea);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(21, 63, 295, 156);
		contentPane.add(scrollPane);
		
		btnHola = new JButton("Hola");
		btnHola.setBounds(28, 280, 89, 23);
		btnHola.addActionListener(getControlador());
		contentPane.add(btnHola);
		
		btnChau = new JButton("Chau");
		btnChau.setBounds(122, 280, 89, 23);
		btnChau.addActionListener(getControlador());
		contentPane.add(btnChau);
		
		setLocationRelativeTo(null);
		
		
	}


	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}


	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}


	public JButton getBtnHola() {
		return btnHola;
	}


	public void setBtnHola(JButton btnHola) {
		this.btnHola = btnHola;
	}


	public JTextField getTextField() {
		return textField;
	}


	public void setTextField(JTextField textField) {
		this.textField = textField;
	}


	public JPasswordField getPasswordField() {
		return passwordField;
	}


	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}


	public Controlador getControlador() {
		return controlador;
	}


	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
}
