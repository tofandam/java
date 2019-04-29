import java.util.Random;

public class tablica_odwrocona {
    public static void main(String[] args) {
        int [] tablica=new int[10];
        Random r=new Random();
        System.out.println("tablica zawiera: ");
        for (int i = 0; i <tablica.length ; i++) {
            tablica[i]=r.nextInt(1000);
            System.out.print(tablica[i]+ " ");
        }
        System.out.println();
        System.out.println("tablica odwrotna: ");
        for (int i = tablica.length-1; i >= 0 ; i--) {



            System.out.print(tablica[i]+" ");
        }
        System.out.println("\n");
    }
}
