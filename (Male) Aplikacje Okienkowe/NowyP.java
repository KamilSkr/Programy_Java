import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class NowyP extends JFrame implements ActionListener
{
	JMenuBar menuBar;
	JLabel label1;
	JButton bSzukaj , bwybierzKolor;
	JPopupMenu popup;
	JMenu menuPlik, menuNarzedzia, menuOpcje, menuPomoc;
	JMenuItem mOtworz, mZapisz, mWyjscie, mNarz1, mNarz2, mOpcja1, mOpcja2, mpKopiuj, mpWklej, mpDolacz, mOProgramie;
	JCheckBoxMenuItem chOpcja2;
	JTextField tSzukany;
	JTextArea notatnik;
	JScrollPane scrollPane;
	JComboBox colorCombo;
	String wybranyTekst;
	
	public NowyP()
	{
		setTitle("Demonstracja JMenuBar");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuPlik = new JMenu("Plik");
		menuBar.add(menuPlik);
		mOtworz = new JMenuItem("Otworz", 'O');
		mOtworz.addActionListener(this);
		mZapisz = new JMenuItem("Zapisz");
		mZapisz.addActionListener(this);
		mWyjscie = new JMenuItem("Wyjscie");
		
		menuPlik.add(mOtworz);
		menuPlik.add(mZapisz);
		menuPlik.addSeparator();
		menuPlik.add(mWyjscie);
		
		mWyjscie.addActionListener(this);
		mWyjscie.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
		
		menuNarzedzia = new JMenu("Narzedzia");
		menuBar.add(menuNarzedzia);
		mNarz1 = new JMenuItem("Narz1");
		mNarz1.setEnabled(false);
		mNarz2 = new JMenuItem("Narz2");
		mNarz2.addActionListener(this);;
		
		menuNarzedzia.add(mNarz1);
		menuNarzedzia.add(mNarz2);
		
			menuOpcje = new JMenu("Opcje");
			mOpcja1 = new JMenuItem("Opcja1");
			chOpcja2 = new JCheckBoxMenuItem("Opcja2");
			chOpcja2.addActionListener(this);			
			
			menuOpcje.add(mOpcja1);
			menuOpcje.add(chOpcja2);
			menuNarzedzia.add(menuOpcje);
			
			menuBar.add(Box.createHorizontalGlue());
			
		
		menuPomoc = new JMenu("Pomoc");
		menuBar.add(menuPomoc);
		mOProgramie = new JMenuItem("O Programie");
		mOProgramie.addActionListener(this);
		menuPomoc.add(mOProgramie);
		
		notatnik = new JTextArea();
		
		JScrollPane scrollPane = new JScrollPane(notatnik);
		scrollPane.setBounds(50, 50, 400, 400);
		add(scrollPane);

		tSzukany = new JTextField();
		tSzukany.setBounds(50, 500, 100, 20);
		add(tSzukany);
		
		bSzukaj = new JButton("Szukaj");
		bSzukaj.setBounds(200, 500, 100, 20);
		add(bSzukaj);
		bSzukaj.addActionListener(this);
		
		bwybierzKolor = new JButton("Wybierz Kolor");
		bwybierzKolor.setBounds(350, 500, 200, 20);
		add(bwybierzKolor);
		bwybierzKolor.addActionListener(this);
		
		popup = new JPopupMenu();
		mpKopiuj = new JMenuItem("Kopiuj");
		mpKopiuj.addActionListener(this);
		mpWklej = new JMenuItem("Wklej");
		mpWklej.addActionListener(this);
		mpDolacz = new JMenuItem("Dolacz");
		mpDolacz.addActionListener(this);
		
		popup.add(mpKopiuj);
		popup.add(mpWklej);
		popup.add(mpDolacz);
		
		notatnik.setComponentPopupMenu(popup);
		
		colorCombo = new JComboBox();
		colorCombo.setBounds(500, 50, 100, 20);
		colorCombo.addItem("Czarny");
		colorCombo.addItem("Czerwony");
		colorCombo.addItem("Zielony");
		colorCombo.addItem("Niebieski");
		colorCombo.addItem("Rozowy");
		add(colorCombo);
		colorCombo.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object z = e.getSource();
		if(z==mOtworz)
		{
			JFileChooser fc = new JFileChooser();
			if(fc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION)
			{
				File plik = fc.getSelectedFile();
				//JOptionPane.showMessageDialog(null, "wybrany plik to "+ plik.getAbsolutePath());
				try 
				{
					Scanner sc = new Scanner(plik);
					while (sc.hasNext())
						notatnik.append(sc.nextLine()+ "\n");
				} 
				catch (FileNotFoundException e1) 
				{
					e1.printStackTrace();
				}
			}
		}
		else if(z==mZapisz)
		{
			JFileChooser fc = new JFileChooser();
			if(fc.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
			{
				File plik = fc.getSelectedFile();
				try 
				{
					PrintWriter pw = new PrintWriter(plik);
					Scanner sc = new Scanner(notatnik.getText());
					while(sc.hasNext())
						pw.println(sc.nextLine()+ "\n");
					
					pw.close();
					
				} 
				catch (FileNotFoundException e1) 
				{
					
					e1.printStackTrace();
				}
				//JOptionPane.showMessageDialog(null, "Wybrany plik to "+ plik.getAbsolutePath());
			}
		}
		else if(z==mWyjscie)
		{
			int odp=JOptionPane.showConfirmDialog(null, "Czy na pewno? " , "Pytanie" , JOptionPane.YES_NO_OPTION);
			if(odp==JOptionPane.YES_OPTION)	
			dispose();
			else if (odp==JOptionPane.NO_OPTION)
				JOptionPane.showMessageDialog(null, "Wiedzialem...");
			else if (odp==JOptionPane.CLOSED_OPTION)
				JOptionPane.showMessageDialog(null, "Tak nie robimy", "Tytul", JOptionPane.CANCEL_OPTION);
			
		}
		if(z==chOpcja2)
		{
			if(chOpcja2.isSelected())
				mNarz1.setEnabled(true);
			else if(!chOpcja2.isSelected())
				mNarz1.setEnabled(false);
		}
		if(z==mNarz2)
		{
			String sMetry = JOptionPane.showInputDialog("Podaj dlugosc w metrach");
			double metry = Double.parseDouble(sMetry);
			double stopy = metry / 0.3048;
			String sStopy = String.format("%.2f", stopy);
			JOptionPane.showMessageDialog(null, metry+ "Metrow = "+stopy+" stop");
			
		}
			if(z==mOProgramie)
				JOptionPane.showMessageDialog(null, "Program demonstruje wykorzystanie JMenuBar  i JMenu /n wersia 1.0", "tytul", JOptionPane.WARNING_MESSAGE);
			
			else if(z==bSzukaj)
			{
				String tekst = notatnik.getText();
				String szukane = tSzukany.getText();
				String wystapienia = "";
				int i = 0;
				int index;
				int startIndex = 0;
				while((index = tekst.indexOf(szukane, startIndex)) != -1)
				{
					startIndex = index + szukane.length();
					i++;
					wystapienia = wystapienia + " " + index;
				}
				JOptionPane.showMessageDialog(null, szukane + " Wystapi³o " + i + " razy: " + wystapienia );
			}
			else if(z==bwybierzKolor)
			{
				Color wybranyKolor = JColorChooser.showDialog(null, "Wybor koloru ", Color.GREEN);
				notatnik.setForeground(wybranyKolor);
			}
			
			else if (z==mpKopiuj)
				wybranyTekst = notatnik.getSelectedText();
				
				else if (z==mpWklej)
				{
					notatnik.insert(wybranyTekst, notatnik.getCaretPosition());
				}
				else if (z==mpDolacz)
					notatnik.append("\n" + wybranyTekst);
		
				else if(z==colorCombo)
				{
					String color = colorCombo.getSelectedItem().toString();
					if (color.equals("Zielony"))
						notatnik.setForeground(Color.GREEN);
					else if (color.equals("Niebieski"))
						notatnik.setForeground(Color.BLUE);
					else if (color.equals("Czarny"))
						notatnik.setForeground(Color.BLACK);
					else if (color.equals("Czerwony"))
						notatnik.setForeground(Color.RED);
					else if (color.equals("Rozowy"))
						notatnik.setForeground(Color.PINK);
					
				}
	}
	public static void main(String[] args) 
	{
		NowyP appMenu = new NowyP();
		appMenu.setVisible(true);
		
	}
	
}