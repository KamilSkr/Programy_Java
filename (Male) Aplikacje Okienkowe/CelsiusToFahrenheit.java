import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.StyledEditorKit.BoldAction;

public class CelsiusToFahrenheit extends JFrame implements ActionListener
{
	private JLabel lCelsiusz, lFahrenheit;
	private JTextField tCelsiusz, tFahrenheit;
	private JButton bKonwertuj;
	private JRadioButton rbCtoF, rbFtoC;
	private ButtonGroup radioPanel;
	private double tempCelsius, tempFahrenheit;

	public CelsiusToFahrenheit() 
	{
		
		setSize(400,300);
		setTitle("Przeliczanie stopni Celsiusza na Fahrenheita");
		setLayout(null);
		
		lCelsiusz = new JLabel("Stopnie Celsiusza: ");
		lCelsiusz.setBounds(20, 20, 150, 20);
		add(lCelsiusz);
		
		tCelsiusz = new JTextField("");
		tCelsiusz.setBounds(170, 20, 150, 20);
		add(tCelsiusz);
		tCelsiusz.setToolTipText("Podaj temperature w stopniach Celsiusza");
		tCelsiusz.addActionListener(this);
		
		lFahrenheit = new JLabel("Stopnie Fahrenheita: ");
		lFahrenheit.setBounds(20, 70, 150, 20);
		add(lFahrenheit);
		
		tFahrenheit = new JTextField("");
		tFahrenheit.setBounds(170, 70, 150, 20);
		add(tFahrenheit);
		tFahrenheit.addActionListener(this);
		
		bKonwertuj = new JButton("Konwertuj");	
		bKonwertuj.setBounds(70, 100, 150, 20);
		add(bKonwertuj);
		bKonwertuj.addActionListener(this);
		
		radioPanel = new ButtonGroup();
		rbCtoF = new JRadioButton("Celciusz to Fahrenheit");
		rbCtoF.setBounds(50,150,150,20);
		rbCtoF.setSelected(true);
		
		rbFtoC = new JRadioButton("Fahrenheit to Celsiusz");
		rbFtoC.setBounds(200,150,150,20);
		
		radioPanel.add(rbCtoF);
		radioPanel.add(rbFtoC);
		
		add(rbCtoF);
		add(rbFtoC);
		
	}
	
		
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		
		Object zrodlo = e.getSource();
		if (zrodlo==bKonwertuj)
		{
			if(rbCtoF.isSelected())
			{
				tempCelsius = Double.parseDouble(tCelsiusz.getText());
				tempFahrenheit = 32.0 + (9.0/5)*tempCelsius;
				tFahrenheit.setText(String.valueOf(tempFahrenheit));
			}
			else if (rbFtoC.isSelected())
			{
				tempFahrenheit = Double.parseDouble(tFahrenheit.getText());
				tempCelsius = (tempFahrenheit - 32.0) * (5.0/9.0);
				tCelsiusz.setText(String.valueOf(tempCelsius));
				
			}

		}
		if(zrodlo==tCelsiusz)
		{
			tempCelsius = Double.parseDouble(tCelsiusz.getText());
			tempFahrenheit = 32.0 + (9.0/5)*tempCelsius;
			tFahrenheit.setText(String.valueOf(tempFahrenheit));
		}
		else if (zrodlo==tFahrenheit)
		{
			tempFahrenheit = Double.parseDouble(tFahrenheit.getText());
			tempCelsius = (tempFahrenheit - 32.0) * (5.0/9.0);
			tCelsiusz.setText(String.valueOf(tempCelsius));
			
		}
	}



	public static void main(String[] args)
	{
		CelsiusToFahrenheit aplikacja = new CelsiusToFahrenheit();
		aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplikacja.setVisible(true);
	}
}
