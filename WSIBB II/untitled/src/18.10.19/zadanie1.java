import java.util.Random;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class zadanie1 {
    public static void main(String[] args) {


        int[] tab = new int[1000];
        Random r = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(tab.length);
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(i + ". " + tab[i]);
        }

    }
}