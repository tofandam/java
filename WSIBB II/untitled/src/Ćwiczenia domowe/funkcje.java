public class funkcje {
    public static void wie(int wiee) {
        System.out.println("Mam " + wiee + " lat!");
    }

    public static void name(String imie) {
        System.out.println("I mam na imię " + imie);
    }

    public static void suma(int a, int b, int c, int d) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }

    public static void suma2(int a, int b, int c, int d) {
        System.out.println(a + b);
        System.out.println(b - b);
        System.out.println(a * c);
        System.out.println(d / b);
    }

    public static void potega(long pot) {
        int dopot = 8;
        int pote = 3;
        int wyni = 1;
        for (int i = 1; i <= dopot; i++) {
            wyni = pote * wyni;
        }
        System.out.println(wyni);
        System.out.println("-------------------------------");
    }

    public static void potega2(int a, int b) {
        double power = Math.pow(6.5, 4.1928);
        System.out.println(power);
    }
    public static void licz(int [] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
    public static void odlicz(int oho){
            int y = 50;
            int u = 0;
            while(u<y){
        u=u+1;
        System.out.print(u+", ");
    }
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 45;
        int d = 16;
        suma(a, b, c, d);
        suma2(a, b, c, d);
        wie(15);
        name("Patrykk");
        wie(29);
        name("Jola");
        long pot = 0;
        potega(pot);
        potega2(a, b);
        int[] numbers = {1, 5, 40};
        licz(numbers);
        System.out.println();
        int oho = 0;

        odlicz(oho);


    }
}
