import javax.swing.JFrame;
 import javax.swing.JPanel;
 
 public class ObrazFrame
 {
 
	 private int a;
	 private int b;
	 private int c;
	 
	 
 	public ObrazFrame(int a, int b, int c) 
 	{
 		this.a = a;
 		this.b = b;
 		this.c = c;
 		
 	}
 	public String rozwiaz()
 	{
 		String rozwiazanie = "";
 		double delta;
 		delta = (b*b-4*a*c);
 		if(delta>0)
 		{
 			delta = Math.sqrt(delta);
 			double x1=(-b-delta)/(2*a);
 			double x2=(-b+delta)/(2*a);
 			rozwiazanie = "Rownanie posiada dwa pierwiastki rzeczywiste: \n" +x1 + "\n oraz \n" + x2;
 		}
 		else if (delta==0)
 		{
 			delta = Math.sqrt(delta);
 			double x0 = -b/(2*a);
 			rozwiazanie = "Rownanie posiada jeden pierwiastek rzeczywistu: " + x0;
 		}
 		else if (delta<0)
 		{
 			rozwiazanie = "Brak pierwiastkow rzeczywistych ";
 		}
 		return rozwiazanie;
 	}
 	public String toString()
 	{
 		return "Rownanie kwadratowe: " + a + "x^2 +" + b + "x +" +c;
 	}
 	public void setA(int a)
 	{
 		this.a=a;
 	}
 	public void setB(int b)
 	{
 		this.b=b;
 	}
 	public void setC(int c)
 	{
 		this.c=c;
 	}
 	public static void main(String[]args)
 	{
 		ObrazFrame rownanie = new ObrazFrame(1, 4, 1);
 		System.out.println(rownanie.rozwiaz());
 	}
 }
 