import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        long liczba = 0;
        long liczba2 = 1;
        long liczba3 = 0;
        System.out.println("Podaj liczbę ciągu???:");
        Scanner odczyt = new Scanner(System.in);

        int a = odczyt.nextInt();

        for (int i = 1; i < a + 1; i++) {

            liczba3 = liczba + liczba2;

            System.out.println(i + ". " + liczba3);
            liczba = liczba2;
            liczba2 = liczba3;

        }
    }
}
