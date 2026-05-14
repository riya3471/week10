package UserInputCSV;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(10, 38, 69, 12);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(10, 74, 69, 12);
		contentPane.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(76, 35, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(76, 71, 150, 20);
		contentPane.add(passwordField);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(76, 122, 120, 25);
		contentPane.add(btnNewButton);

		// ✅ BUTTON ACTION (LOGIN LOGIC)
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String username = textField.getText();
				String password = new String(passwordField.getPassword());

				if(username.equals("admin") && password.equals("admin")) {

					JOptionPane.showMessageDialog(null,
							"Login Successful");

				} else {

					JOptionPane.showMessageDialog(null,
							"Invalid Username and Password");
				}
			}
		});
	}
}