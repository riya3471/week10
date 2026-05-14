package UserInputCSV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;

public class BorderDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorderDemo frame = new BorderDemo();
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
	public BorderDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 64, 0));
		panel.setForeground(new Color(0, 64, 0));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setForeground(new Color(255, 0, 0));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_2, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 0));
		panel_3.setForeground(new Color(255, 255, 0));
		contentPane.add(panel_3, BorderLayout.WEST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 0, 128));
		panel_4.setForeground(new Color(255, 128, 192));
		contentPane.add(panel_4, BorderLayout.CENTER);

	}

}
