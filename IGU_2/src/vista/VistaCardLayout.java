package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaCardLayout extends JFrame {

	private JPanel contentPane;
	private CardLayout crd = new CardLayout(20, 20);
	JPanel panelCard = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaCardLayout frame = new VistaCardLayout();
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
	public VistaCardLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		panelCard.setLayout(crd);

		JLabel card1 = new JLabel("Card 1");
		card1.setHorizontalAlignment(SwingConstants.CENTER);
		panelCard.add(card1);

		JLabel card2 = new JLabel("Card 2");
		card2.setHorizontalAlignment(SwingConstants.CENTER);
		panelCard.add(card2);

		JLabel card3 = new JLabel("Card 3");
		card3.setHorizontalAlignment(SwingConstants.CENTER);
		panelCard.add(card3);

		contentPane.add(panelCard, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crd.previous(panelCard);
			}
		});
		panel.add(btnAtras);

		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crd.next(panelCard);
			}
		});
		panel.add(btnSiguiente);

	}

}
