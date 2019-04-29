package Zajecia155;

import java.util.LinkedList;
import java.util.Random;

public class lotto {
    public static void main(String[] args) {
        System.out.println("Losujemy liczby :)");
        LinkedList m = new LinkedList();
        Random generator = new Random();

        for(int i=0; i<6; i++) {

            m.add(generator.nextInt(50));


        }System.out.println(m);
    }
}
