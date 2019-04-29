package Zajecia155;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class lottoproba {
    public static void main(String[] args) {
        List<Integer> liczby = new ArrayList<>();

        for (int i = 1; i < 49; i++) {
            Random r = new Random();
            int a = r.nextInt(49);
            liczby.add(i);
            System.out.print(a+", ");
            System.out.println(liczby);
        }


        liczby.remove(10);

    }

}
