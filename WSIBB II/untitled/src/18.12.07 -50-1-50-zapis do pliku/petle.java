import java.io.BufferedReader;
import java.io.InputStreamReader;

public class petle {
    public static void main(String[] args) {
        int interator = 0;
        while (interator <= 10) {
            System.out.println("To jest petla");
            interator++;
        }
        int ii = 0;
        do {
            System.out.println("Petla do...while: " + ii);
            ii++;
        } while (ii < 10);


        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                System.out.println("i jest rowne 3");
                continue; //przeskakuje na poczatek petli i zwieksza iterator "i"

            }
            //ctrl+alt+l -automatycznie wyrównuje
            //break;//przerywa petle w tym miejscu
            System.out.println("Petla for..:" + i);
        }


    }
}

