package UserInputCSV;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class userform extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userform frame = new userform();
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
	public userform() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// First Name
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(10, 22, 79, 12);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(99, 19, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		// Last Name
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setBounds(10, 60, 79, 12);
		contentPane.add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setBounds(99, 57, 150, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		// Address
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setBounds(10, 98, 79, 12);
		contentPane.add(lblNewLabel_2);

		textField_2 = new JTextField();
		textField_2.setBounds(99, 95, 150, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		// Contact Number
		JLabel lblNewLabel_3 = new JLabel("Contact Number");
		lblNewLabel_3.setBounds(10, 138, 100, 12);
		contentPane.add(lblNewLabel_3);

		textField_3 = new JTextField();
		textField_3.setBounds(120, 135, 150, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		// Semester
		JLabel lblNewLabel_4 = new JLabel("Semester");
		lblNewLabel_4.setBounds(10, 170, 79, 12);
		contentPane.add(lblNewLabel_4);

		textField_4 = new JTextField();
		textField_4.setBounds(99, 167, 150, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		// Save Button
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(120, 220, 100, 25);
		contentPane.add(btnNewButton);

		// Button Action
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String firstName = textField.getText();
				String lastName = textField_1.getText();
				String address = textField_2.getText();
				String contact = textField_3.getText();
				String semester = textField_4.getText();

				try {

					FileWriter writer =
							new FileWriter("students.csv", true);

					writer.write(firstName + "," +
								 lastName + "," +
								 address + "," +
								 contact + "," +
								 semester + "\n");

					writer.close();

					JOptionPane.showMessageDialog(null,
							"Data Saved Successfully");

					// Clear Fields
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");

				} catch (IOException ex) {

					JOptionPane.showMessageDialog(null,
							"Error Saving File");
				}
			}
		});
	}
}