import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.JCheckBox;
import javax.swing.*;
public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField input1;
	private JTextField input2;

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
		setTitle("CalculateTwoNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter number 1");
		lblNumber1.setBounds(33, 46, 97, 23);
		contentPane.add(lblNumber1);
		
		input1 = new JTextField();
		input1.setBounds(195, 47, 86, 20);
		contentPane.add(input1);
		input1.setColumns(10);
		
		JLabel lblNumber2 = new JLabel("Enter number 2");
		lblNumber2.setBounds(33, 103, 99, 23);
		contentPane.add(lblNumber2);
		
		input2 = new JTextField();
		input2.setBounds(195, 104, 86, 20);
		contentPane.add(input2);
		input2.setColumns(10);
		
		final JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(258, 363, 46, 14);
		contentPane.add(lblResult);


		JLabel lblOper = new JLabel("operater");
		lblOper.setBounds(33, 159, 86, 23);
		contentPane.add(lblOper);
		
		final JComboBox boxOper = new JComboBox();
		boxOper.setBounds(195, 159, 86, 23);
		boxOper.addItem("+");
		boxOper.addItem("-");
		boxOper.addItem("*");
		boxOper.addItem("/");
		contentPane.add(boxOper);

		JLabel digit = new JLabel("How to show digit");
		digit.setBounds(33, 214, 109, 23);
		contentPane.add(digit);
		
		final JRadioButton radi1 = new JRadioButton("1 Digit");
		radi1.setBounds(195, 214, 109, 23);
		contentPane.add(radi1);
		
		final JRadioButton radi2 = new JRadioButton("2 Digit");
		radi2.setBounds(195, 240, 109, 23);
		contentPane.add(radi2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radi1);
		group.add(radi2);
		
		JLabel opshow = new JLabel("Option to show");
		opshow.setBounds(33, 293, 97, 14);
		contentPane.add(opshow);
		
		final JCheckBox optionCheck = new JCheckBox("Show result at DialogBox");
		optionCheck.setBounds(184, 289, 159, 23);
		contentPane.add(optionCheck);
		
		final JButton okbt = new JButton("OK");
		okbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				//Jbotton
				if (e.getSource()==okbt) {
					num1 = Double.parseDouble(input1.getText());
					num2 = Double.parseDouble(input2.getText());
					//sum = num1+num2;
					operator =(String) boxOper.getSelectedItem();
					if(operator.equals("+"))
						sum = num1+num2;
					if(operator.equals("-"))
						sum = num1-num2;
					if(operator.equals("*"))
						sum = num1*num2;
					if(operator.equals("/"))
						sum = num1/num2;
					// Jradi botton
					DecimalFormat frmNumber = null;
					if(radi1.isSelected()) {
						frmNumber = new DecimalFormat("#,###.0");
					}
					
					else if (radi2.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");

					}
					
					lblResult.setText(frmNumber.format(sum));
					if(optionCheck.isSelected()) {
						JOptionPane.showMessageDialog(null,"Result is "+frmNumber.format(sum));
					}
					
				}
			}
		});
		
		
		
		okbt.setBounds(102, 423, 89, 23);
		contentPane.add(okbt);
		
		JButton exitbt = new JButton("EXIT");
		exitbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitbt.setBounds(240, 423, 89, 23);
		contentPane.add(exitbt);
		
		
		
	
	}
}
