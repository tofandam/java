import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class pazdziernik26a {
    public static void main(String[] args) {
        //1.stworzyc tablice 100000 wypelnic randonomowymi wartosciami;
        //Random r= new Random;
        // r.nextInt(); 0 do 1000
        //wypisać to

        //2. tablica[10] policzyc srednia;
        //3. tablica[100] znalezc najwiekszy element w tej tablicy
        //4. Wypisać wyraz od tyłu

        //1.
        int [] tablica=new int[100];
        Random r=new Random();

        for (int i = 0; i <tablica.length ; i++) {
            tablica[i]=r.nextInt(1000);

        }
        for (int i = 0; i <tablica.length ; i++) {
            System.out.println(tablica[i]);
        }
        System.out.println("\n");
        //2.
        int[] liczby = new int[]{2,40,6,132,193};

        int suma= liczby[0]+liczby[1]+liczby[2]+liczby[3]+liczby[4];
        int srednia=suma/5;
        System.out.println("Średnia liczb z tablicy: "+srednia+"\n");

        //2.2
        int[] tabkon=new int[10];
        for (int i = 0; i <tabkon.length ; i++) {
            tabkon[i]= r.nextInt(300);
        }
        int sr =0;
        for (int i = 0; i <tabkon.length; i++) {
            sr = sr+tabkon[i];
        }
        System.out.println("Średnia wynosi: "+sr/tabkon.length+"\n");
        //3.
        int[] tab=new int[10];
        int max = tab[0];
        for (int i = 0; i <tab.length ; i++) {
            tab[i]=r.nextInt(1000);
            System.out.println(tab[i]);
            if(tab[i]>max) {
                max = tab[i];
            }
        }
        System.out.println("Największa liczba wynosi: "+max);

        //chyba działa xdddd
        //4.






    }
}
