import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class test extends JFrame implements ActionListener
{
	private JTextField ta, tb , tc , twynik;
	private JLabel la, lb, lc;
	private JButton bwyjscie, brozwiaz;
	public test()
	{
		setSize(600,400);
		setTitle("Rozwiazywanie rownanie kwadratowego");
		setLayout(null);
		
		la = new JLabel("a", JLabel.RIGHT);
		la.setBounds(0,50,30,20);
		ta = new JTextField();
		ta.setBounds(50, 50, 50, 20);
		ta.setToolTipText("Podaj Wspolczynnik a");
		
		lb = new JLabel("b", JLabel.RIGHT);
		lb.setBounds(100,50,30,20);
		tb = new JTextField();
		tb.setBounds(150, 50, 50, 20);
		tb.setToolTipText("Podaj Wspolczynnik b");
		
		lc = new JLabel("c", JLabel.RIGHT);
		lc.setBounds(210,50,30,20);
		tc = new JTextField();
		tc.setBounds(250, 50, 50, 20);
		tc.setToolTipText("Podaj Wspolczynnik c");
		
		add(ta);
		add(la);
		add(tb);
		add(lb);
		add(tc);
		add(lc);
		
		brozwiaz = new JButton("Rozwiaz rownanie");
		brozwiaz.setBounds(50, 120, 150, 20);
		brozwiaz.addActionListener(this);
		
		bwyjscie = new JButton("Wyjscie");
		bwyjscie.setBounds(250, 120, 100, 20);
		bwyjscie.addActionListener(this);
		
		add(brozwiaz);
		add(bwyjscie);
		
		twynik = new JTextField();
		twynik.setBounds(50, 200, 500, 20);
		add(twynik);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object zrodlo = e.getSource();
		if(zrodlo == bwyjscie)
		{
			dispose();
		}
		else if(zrodlo == brozwiaz)
		{
			int a = Integer.parseInt(ta.getText());
			int b = Integer.parseInt(tb.getText());
			int c = Integer.parseInt(tc.getText());
			
			ObrazFrame rownanie = new ObrazFrame(a, b, c);
			String rozwiazanie = rownanie.rozwiaz();
			twynik.setText(rozwiazanie);
		}
		
	}
	
	public static void main(String[] args)
	{
		test app = new test();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
		
	}


	
	
}