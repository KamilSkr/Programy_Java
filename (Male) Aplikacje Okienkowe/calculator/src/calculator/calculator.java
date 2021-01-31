package calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class calculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtDisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
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
	public calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 626);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + button.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 18));
		button.setBounds(132, 491, 87, 72);
		contentPane.add(button);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + button_1.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		button_1.setFont(new Font("Dialog", Font.BOLD, 18));
		button_1.setBounds(15, 401, 87, 72);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + button_2.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		button_2.setFont(new Font("Dialog", Font.BOLD, 18));
		button_2.setBounds(132, 401, 87, 72);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + button_3.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		button_3.setFont(new Font("Dialog", Font.BOLD, 18));
		button_3.setBounds(244, 401, 87, 72);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + button_4.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		button_4.setFont(new Font("Dialog", Font.BOLD, 18));
		button_4.setBounds(15, 313, 87, 72);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + button_5.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		button_5.setFont(new Font("Dialog", Font.BOLD, 18));
		button_5.setBounds(132, 313, 87, 72);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + button_6.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		button_6.setFont(new Font("Dialog", Font.BOLD, 18));
		button_6.setBounds(244, 311, 87, 77);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + button_7.getText();
				txtDisplay.setText(EnterNumber );
				
			}
		});
		button_7.setFont(new Font("Dialog", Font.BOLD, 18));
		button_7.setBounds(15, 220, 87, 77);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + button_8.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		button_8.setFont(new Font("Dialog", Font.BOLD, 18));
		button_8.setBounds(132, 220, 87, 77);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setFont(new Font("Dialog", Font.BOLD, 18));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + button_9.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		button_9.setBounds(244, 218, 87, 77);
		contentPane.add(button_9);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(15, 16, 432, 89);
		contentPane.add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton button_10 = new JButton("+");
		button_10.setBounds(498, 220, 115, 29);
		contentPane.add(button_10);
		
		JButton button_12 = new JButton("=");
		button_12.setBounds(498, 340, 115, 29);
		contentPane.add(button_12);
		
		JButton button_11 = new JButton("-");
		button_11.setBounds(498, 283, 115, 29);
		contentPane.add(button_11);
		
		JButton button_9_1 = new JButton(".");
		button_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + button_9_1.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		button_9_1.setFont(new Font("Dialog", Font.BOLD, 18));
		button_9_1.setBounds(15, 490, 87, 72);
		contentPane.add(button_9_1);
		
		JButton button_9_2 = new JButton("\u00B1");
		button_9_2.setFont(new Font("Dialog", Font.BOLD, 18));
		button_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		button_9_2.setBounds(244, 491, 87, 72);
		contentPane.add(button_9_2);
		
		JButton button_9_2_1 = new JButton("+");
		button_9_2_1.setFont(new Font("Dialog", Font.BOLD, 18));
		button_9_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		button_9_2_1.setBounds(360, 121, 87, 77);
		contentPane.add(button_9_2_1);
		
		JButton button_9_2_2 = new JButton("-");
		button_9_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		button_9_2_2.setFont(new Font("Dialog", Font.BOLD, 18));
		button_9_2_2.setBounds(360, 220, 87, 77);
		contentPane.add(button_9_2_2);
		
		JButton button_9_2_3 = new JButton("*");
		button_9_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		button_9_2_3.setFont(new Font("Dialog", Font.BOLD, 18));
		button_9_2_3.setBounds(360, 313, 87, 72);
		contentPane.add(button_9_2_3);
		
		JButton button_9_2_4 = new JButton("=");
		button_9_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if (operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
			}
		});
		button_9_2_4.setFont(new Font("Dialog", Font.BOLD, 18));
		button_9_2_4.setBounds(360, 491, 87, 74);
		contentPane.add(button_9_2_4);
		
		JButton button_9_2_3_1 = new JButton("/");
		button_9_2_3_1.setFont(new Font("Dialog", Font.BOLD, 18));
		button_9_2_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		button_9_2_3_1.setBounds(360, 401, 87, 72);
		contentPane.add(button_9_2_3_1);
		
		JButton button_6_1 = new JButton("<-");
		button_6_1.setBackground(Color.WHITE);
		button_6_1.setForeground(Color.BLACK);
		button_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String button_9_2_3_1 = null;
				
				if(txtDisplay.getText().length()>0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() -1 );
					button_9_2_3_1 = strB.toString();
					txtDisplay.setText(button_9_2_3_1);
				}
			}
		});
		button_6_1.setFont(new Font("Dialog", Font.BOLD, 18));
		button_6_1.setBounds(15, 121, 87, 77);
		contentPane.add(button_6_1);
		
		JButton button_6_2 = new JButton("C");
		button_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		button_6_2.setFont(new Font("Dialog", Font.BOLD, 18));
		button_6_2.setBounds(132, 121, 87, 77);
		contentPane.add(button_6_2);
		
		JButton button_6_3 = new JButton("%");
		button_6_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		button_6_3.setFont(new Font("Dialog", Font.BOLD, 18));
		button_6_3.setBounds(244, 121, 87, 77);
		contentPane.add(button_6_3);
	}
}
