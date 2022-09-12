package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;

public class VistaJmenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaJmenu frame = new VistaJmenu();
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
	public VistaJmenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 317);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
			JMenu mnNewMenu = new JMenu("A");
			menuBar.add(mnNewMenu);
		
			JMenuItem mntmNewMenuItem = new JMenuItem("A-1");
			mnNewMenu.add(mntmNewMenuItem);
			
			JMenuItem mntmNewMenuItem_1 = new JMenuItem("A-2");
			mnNewMenu.add(mntmNewMenuItem_1);
		
			JMenu mnNewMenu_1 = new JMenu("A-3");
			mnNewMenu.add(mnNewMenu_1);
		
				JMenuItem mntmNewMenuItem_2 = new JMenuItem("A-3-1");
				mnNewMenu_1.add(mntmNewMenuItem_2);
				
				JMenuItem mntmNewMenuItem_3 = new JMenuItem("A-3-2");
				mnNewMenu_1.add(mntmNewMenuItem_3);
				
			JMenu mnNewMenu_2 = new JMenu("B");
			menuBar.add(mnNewMenu_2);
			
				JMenuItem mntmNewMenuItem_4 = new JMenuItem("B-1");
				mnNewMenu_2.add(mntmNewMenuItem_4);
		
			JMenu mnNewMenu_3 = new JMenu("C");
			menuBar.add(mnNewMenu_3);
			
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("C-1");
		mnNewMenu_3.add(mntmNewMenuItem_5);
		mnNewMenu_3.add(new JSeparator());
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("C- Check 1");
		mnNewMenu_3.add(chckbxmntmNewCheckItem);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_1 = new JCheckBoxMenuItem("C- Check 2");
		mnNewMenu_3.add(chckbxmntmNewCheckItem_1);
		mnNewMenu_3.add(new JSeparator());
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("C - Radio 1");
		mnNewMenu_3.add(rdbtnmntmNewRadioItem);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem("C - Radio 2");
		mnNewMenu_3.add(rdbtnmntmNewRadioItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
