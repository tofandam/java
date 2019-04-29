import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        System.out.println("Podaj pierwszą liczbę: ");
        Scanner a = new Scanner(System.in);
        System.out.println("Podaj drugą liczbę: ");
        Scanner b = new Scanner(System.in);
        System.out.println("Podaj jakie działanie wykonać: 1 - dodawanie, 2 - odejmowanie, 3 - mnożenie, 4 - dzielenie, 5 - reszta z dzielenia");
        Scanner znak = new Scanner(System.in);
        int aa = a.nextInt();
        int bb = b.nextInt();
        String znakk = znak.next();
        int cc = 0;

        if ((znakk.equals("+"))||(znakk.equals("1")))
         {
            cc = aa + bb;
            System.out.println("Wynik z dodawania pierwszej i drugiej liczby wynosi: "+cc);

        } else if ((znakk.equals("-"))||(znakk.equals("2"))){
            cc = aa - bb;
        System.out.println("Wynik z odejmowania pierwszej i drugiej liczby wynosi: "+cc);
    }else if (znakk.equals("*")){
            cc= aa*bb;
            System.out.println("Wynik z mnożenia pierwszej i drugiej liczby wynosi: "+cc);
        }else if (znakk.equals("/")){
        cc= aa/bb;
        System.out.println("Wynik z dzielenia pierwszej i drugiej liczby wynosi: "+cc);
    } else if (znakk.equals("%")){
            cc= aa + bb;
            System.out.println("Reszta z dzielenia wynosi: "+cc);
        }


    }
}
