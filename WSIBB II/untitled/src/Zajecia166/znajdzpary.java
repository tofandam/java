package Zajecia166;

public class znajdzpary {
    public static void main(String[] args) {
        String[][] tablica= new String[4][2];
        {
            tablica[0][0]= "Jan ";
            tablica[0][1]= "Kowalski, ";
            tablica[1][0]= "Edzio ";
            tablica[1][1]= "Pedzio, ";
            tablica[2][0]= "Rysiek ";
            tablica[2][1]= "Zbysiek, ";
            tablica[3][0]= "Jan ";
            tablica[3][1]= "Kowalski, ";
        }
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
            System.out.print(tablica[i][j]);
        }
            System.out.println();
    }


    }}

