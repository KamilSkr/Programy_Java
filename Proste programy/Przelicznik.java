import java.util.Scanner;
public class Przelicznik {
    public static void main(String[] args) {
        double metry, jardy, cale, stopy, mile;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe w metrach: ");
        metry = sc.nextInt();
        jardy = metry*1.09361;
        cale = metry*39.3700;
        stopy = metry*3.2808;
        mile = metry*0.0006;
        System.out.println("Metry: " + metry + " \nCale: "+ cale+ "\nJardy: "+jardy+"\nStopy: "+stopy+"\nMile: "+mile);
        
    }
}
///////////////////////////////////////////////
//Rozrzeszenie o petle 
//////////////////////////////////////////////////
import java.util.Scanner;
public class Przelicznik {
    public static void main(String[] args) {
        double metry, jardy, cale, stopy, mile;
        String d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe w metrach: ");
        metry = sc.nextInt();
        while(metry != 0){
        jardy = metry*1.09361;
        cale = metry*39.3700;
        stopy = metry*3.2808;
        mile = metry*0.0006;
        System.out.println("Metry: " + metry + " \nCale: "+ cale+ "\nJardy: "+jardy+"\nStopy: "+stopy+"\nMile: "+mile);
        System.out.println("Czy zakonczyc program? wcisnij '0' , Jesli chcesz dalej obliczac podaj liczbe: ");
        metry = sc.nextInt();
        }
    }
}
////////////////////////////
//Rozszerzenie o tabele
///////////////////////////
import java.util.Scanner;
public class Przelicznik {
    public static void main(String[] args) {
        double tab[] = new double[10];
        double metry,jardy, cale, stopy, mile;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        for(int i =0 ; i<10 ; i++ ){
        metry = sc.nextInt();
            if(metry!=0){       
        tab[i]=metry;
        jardy = tab[i]*1.09361;
        cale = tab[i]*39.3700;
        stopy = tab[i]*3.2808;
        mile = tab[i]*0.0006;
        System.out.println("Metry: " + tab[i] + " \nCale: "+ cale+ "\nJardy: "+jardy+"\nStopy: "+stopy+"\nMile: "+mile);
        System.out.println("Jesli chcesz zakonczyc program, wcisnij '0' , jesli chcesz obliczyc cos dalej to podaj liczbe: ");
            }else{
                System.out.println("Zakonczyłes Program");
                break;
            }
        }
    }
}
