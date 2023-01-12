import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.JCheckBox;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
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
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter Number1");
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNumber1.setBounds(43, 23, 119, 14);
		contentPane.add(lblNumber1);
		
		JLabel lblNumber2 = new JLabel("Enter Number2");
		lblNumber2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNumber2.setBounds(43, 54, 99, 14);
		contentPane.add(lblNumber2);
		
		tfNum1 = new JTextField();
		tfNum1.setBounds(144, 23, 134, 17);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);
		
		JLabel operator_1 = new JLabel("Operator");
		operator_1.setBounds(43, 79, 46, 14);
		contentPane.add(operator_1);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(144, 79, 73, 14);
		comboBox.addItem("+");
		comboBox.addItem("-");
		comboBox.addItem("*");
		comboBox.addItem("/");
		contentPane.add(comboBox);
		
		final JLabel result = new JLabel("       Result");
		result.setFont(new Font("Tahoma", Font.BOLD, 20));
		result.setBounds(306, 185, 118, 34);
		contentPane.add(result);
		
		tfNum2 = new JTextField();
		tfNum2.setColumns(10);
		tfNum2.setBounds(144, 53, 134, 16);
		contentPane.add(tfNum2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1 digit");
		rdbtnNewRadioButton.setBounds(135, 100, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2 digit");
		rdbtnNewRadioButton_1.setBounds(135, 129, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		ButtonGroup group = new ButtonGroup();
		
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		
		final JButton okButton = new JButton("OK");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				if(e.getSource()==okButton) {
					num1 = Double.parseDouble(tfNum1.getText());
					num2 = Double.parseDouble(tfNum2.getText());
					//sum = num1+num2;
					operator = (String)comboBox.getSelectedItem();
					
					sum = operator == "+" ? num1 + num2
							: operator == "-" ? num1 - num2
							: operator == "*" ? num1 * num2
							: operator == "/" ? num1 / num2
							: num1 + num2;
					
					
					
									
					
					result.setText(String.valueOf(sum));
					
				}
			}
		});
		okButton.setBounds(189, 227, 89, 23);
		contentPane.add(okButton);
		
		JButton exitButton_1 = new JButton("Exit");
		exitButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitButton_1.setBounds(311, 227, 89, 23);
		contentPane.add(exitButton_1);
		
		JLabel lblNewLabel = new JLabel("How to show digit");
		lblNewLabel.setBounds(43, 104, 86, 14);
		contentPane.add(lblNewLabel);
		
		
		
		
		
		
	}
}
