import java.util.Random;

public class tablica_odwrocona_wpisane {
    public static void main(String[] args) {
        int [] tablica=new int[]
                {10,35,5,353,1431,575,143,943,2};
        System.out.println("tablica zawiera: ");
        for (int i = 0; i <tablica.length ; i++) {

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
