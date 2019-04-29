import java.io.BufferedReader;
import java.io.InputStreamReader;

public class zadanie {
    public static void main(String[] args) throws Exception {
        System.out.println("hello");
        String haslo = "123";
        String podanehaslo = "123";
       /* if(haslo == podanehaslo) {
            System.out.println("Haslo przyjete");
        }else{
            System.out.println("Haslo nie prawdziwe");

        }*/
        System.out.println("Podaj haslo");


        for (int i = 0; i < 3; i++) {


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String wczytanehaslo = br.readLine();


            if (haslo.equals(wczytanehaslo)) {
                System.out.println("Dobre haslo");

            } else {
                System.out.println("bledne haslo, proba" + (3 - (i + 1)) + "podaj haslo");
            }
        }
    }
}
