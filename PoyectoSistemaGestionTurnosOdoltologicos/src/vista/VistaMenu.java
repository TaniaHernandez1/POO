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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import javax.swing.DebugGraphics;

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
		setBackground(Color.WHITE);
		setLocationByPlatform(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 453);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(204, 0, 51));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton opTurnos = new JButton("Turnos");
		opTurnos.setBackground(new Color(0, 140, 140));
		opTurnos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				opTurnos.setBackground(new Color(0,160,160));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				opTurnos.setBackground(new Color(0, 140, 140));
			}
		});
		opTurnos.setForeground(new Color(204, 255, 255));
		opTurnos.setBorder(null);
		opTurnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel iconTurnos = new JLabel("");
		iconTurnos.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		iconTurnos.setBorder(null);
		iconTurnos.setAlignmentX(Component.CENTER_ALIGNMENT);
		iconTurnos.setHorizontalAlignment(SwingConstants.CENTER);
		iconTurnos.setHorizontalTextPosition(SwingConstants.CENTER);
		iconTurnos.setSize(new Dimension(10, 10));
		iconTurnos.setIcon(new ImageIcon(VistaMenu.class.getResource("/img/calendar2.png")));
		iconTurnos.setBounds(80,80, 80, 80);
		contentPane.add(iconTurnos);
		opTurnos.setAlignmentX(Component.CENTER_ALIGNMENT);
		opTurnos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		opTurnos.setFont(new Font("Sitka Banner", Font.BOLD, 20));
		opTurnos.setBounds(10, 5, 308, 100);
		contentPane.add(opTurnos);
		
		JButton opProfesional = new JButton("Profesional");
		opProfesional.setBackground(new Color(0, 140, 140));
		opProfesional.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				opProfesional.setBackground(new Color(0, 140, 140));
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				opProfesional.setBackground(new Color(0,160,160));
			}
		});
		opProfesional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		opProfesional.setBorder(null);
		opProfesional.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		opProfesional.setForeground(new Color(204, 255, 255));
		opProfesional.setFont(new Font("Sitka Banner", Font.BOLD, 20));
		opProfesional.setBounds(10, 105, 308, 100);
		contentPane.add(opProfesional);
		
		JButton opPacientes = new JButton("Pacientes");
		opPacientes.setForeground(new Color(204, 255, 255));
		opPacientes.setBackground(new Color(0, 140, 140));
		opPacientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				opPacientes.setBackground(new Color(0,160,160));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				opPacientes.setBackground(new Color(0, 140, 140));
			}
		});
		opPacientes.setBorder(null);
		opPacientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		opPacientes.setFont(new Font("Sitka Banner", Font.BOLD, 20));
		opPacientes.setBounds(10, 205, 308, 100);
		contentPane.add(opPacientes);
		
		Button btnCerrarSesion = new Button("Cerrar sesión");
		btnCerrarSesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCerrarSesion.setBackground (new Color(228,228,228));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnCerrarSesion.setBackground(Color.WHITE);
			}
		});
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
		
		JButton opInformes = new JButton("Informes");
		opInformes.setForeground(new Color(204, 255, 255));
		opInformes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				opInformes.setBackground(new Color(0,160,160));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				opInformes.setBackground(new Color(0, 140, 140));
			}
		});
		opInformes.setFont(new Font("Sitka Banner", Font.BOLD, 20));
		opInformes.setBorder(null);
		opInformes.setBackground(new Color(0, 140, 140));
		opInformes.setBounds(10, 305, 308, 100);
		contentPane.add(opInformes);
	}
}
