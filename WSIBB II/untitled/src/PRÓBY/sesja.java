package PRÓBY;

import java.util.Random;

public class sesja {
    public static void main(String[] args) {


        int srednia = 0;
        int[][] tab = new int[9][99];
        Random losowanko = new Random();

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = losowanko.nextInt(200);
                srednia += tab[i][j];
                }
            System.out.println("Srednia rzędu: "+srednia/100);
            srednia = 0;

        }



    }

    }

