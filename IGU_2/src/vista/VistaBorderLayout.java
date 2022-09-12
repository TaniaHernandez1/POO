package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class VistaBorderLayout extends JFrame {

	private JPanel contentPane;

	
	public VistaBorderLayout() {
		setTitle("BorderLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("North/ Norte");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("West / Oeste");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1, BorderLayout.WEST);
		
		JLabel lblNewLabel_2 = new JLabel("Center / Centro");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_2, BorderLayout.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("East / Este");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3, BorderLayout.EAST);
		
		JLabel lblNewLabel_4 = new JLabel("South / Sur");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_4, BorderLayout.SOUTH);
	}

}
