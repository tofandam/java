import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Losowanie_zamala_zaduza {
    public static void main(String[] args) throws IOException {

// ZA MAŁA, ZA DUŻA

        int wylosowana = 0;
        int proba = 0;
        Random r = new Random();
        wylosowana = r.nextInt(101);

        boolean gradalej = true;
        System.out.println("Odgadnij liczbe z przedziału 0...100: ");
        while(gradalej) {
        proba= proba+1;
            System.out.println("Podaj liczbe: "+ "To jest twoja: "+proba+" próba.");

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String wczytanytekst = bf.readLine();
            //Zamieniamy typ string na typ Int
            int podanaliczba = Integer.parseInt(wczytanytekst);

            if(podanaliczba > wylosowana){
                System.out.println("Liczba jest za duża");
            }else if(podanaliczba < wylosowana){
                System.out.println("Liczba jest za mała");
            }else  {
                System.out.println("Bravo. Wylosowana liczba to: "+ podanaliczba);
                gradalej = false;
            }

        }

    }
}
