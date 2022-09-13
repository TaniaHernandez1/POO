package vista;
//hola
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.Button;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Cursor;
import java.awt.Component;
import java.awt.Point;
import java.awt.Dimension;

public class VistaMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaMenu frame = new VistaMenu();
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
	public VistaMenu() {
		setLocationByPlatform(true);
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 410);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(204, 0, 51));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton opTurnos = new JButton("Turnos");
		opTurnos.setForeground(Color.BLACK);
		opTurnos.setBorder(null);
		opTurnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		opTurnos.setAlignmentX(Component.CENTER_ALIGNMENT);
		opTurnos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		opTurnos.setFont(new Font("Sitka Banner", Font.BOLD, 20));
		opTurnos.setBounds(10, 5, 308, 100);
		contentPane.add(opTurnos);
		
		JButton opProfesional = new JButton("Profesional");
		opProfesional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		opProfesional.setBorder(null);
		opProfesional.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		opProfesional.setForeground(Color.BLACK);
		opProfesional.setFont(new Font("Sitka Banner", Font.BOLD, 20));
		opProfesional.setBounds(10, 105, 308, 100);
		contentPane.add(opProfesional);
		
		JButton opPacientes = new JButton("Pacientes");
		opPacientes.setBorder(null);
		opPacientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		opPacientes.setFont(new Font("Sitka Banner", Font.BOLD, 20));
		opPacientes.setBounds(10, 205, 308, 100);
		contentPane.add(opPacientes);
		
		JButton opInformes = new JButton("Informes");
		opInformes.setBorder(null);
		opInformes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		opInformes.setForeground(new Color(0, 0, 0));
		opInformes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		opInformes.setBackground(SystemColor.info);
		opInformes.setFont(new Font("Sitka Banner", Font.BOLD, 20));
		opInformes.setBounds(10, 305, 308, 100);
		contentPane.add(opInformes);
		
		Button btnCerrarSesion = new Button("Cerrar sesión");
		btnCerrarSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCerrarSesion.setForeground(new Color(0, 0, 0));
		btnCerrarSesion.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCerrarSesion.setBackground(new Color(255, 255, 255));
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCerrarSesion.setActionCommand("\r\n");
		btnCerrarSesion.setBounds(513, 360, 100, 30);
		contentPane.add(btnCerrarSesion);
	}
}
