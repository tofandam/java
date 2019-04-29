package com.company;

public class Zadania19I10 {

    public static void main(String[] args) {

        //zadanie: zsumować wszystkie liczby całkowite od 1 do 1000000
        //zadanie2: dane liczby całkowite (int) a, b, c;
        // --> sprawdzić czy da się ułożyć trójkąt z bokami o długości a,b,c
        //zadanie3: z liczb z przedziału [1..100] znaleźć takie a,b,c:
        //  a*a + b*b == c*c
        //zadanie4: obecny czas zadany jest w postaci dwóch liczb całkowitych,
        // hh (godzina) i mm (minuta); np. int hh=17; int mm=15 odpowiadają 17:15;
        // podany jest tez odcinek czasu `int delta`; jest to liczba minut,
        // które chcemy dodać do obecnego czasu; proszę wyliczyć
        // godzinę i minutę chwili powstałej po dodaniu `delta` do obecnego czasu.


        // ZADANIE 1
        System.out.println("Hej");
        long x=0;
        for(int i=0; i<=1000000; i++){

            x = x+i;
        }

        System.out.println(x);

        //ZADANIE 2
        System.out.println("" +
                "");

        int a=3;
        int b=5;
        int c=7;

        if(a > (b+c)){
            System.out.println("nie");
        }else if(b > (a+c)){
            System.out.println("NIE");
        }else if(c > (a+b)){
            System.out.println("Nie");
        }else{
            System.out.println("TAK");
        }

        //Zadanie 3
        System.out.println(" " +
                " ");
        int y = 0;
        for (int i = 1; i < 101; i++) {
            int f = i;
            for (int j = 1; j < 101; j++) {
                int g = j;
                for (int k = 1; k < 101; k++) {
                    int h = k;
                    if (f*f+g*g==h*h){
                        System.out.println("liczby a="+f+" b="+g+" c="+h+" spełniają warunki");
                        y++;
                    }

                }

            }
        }

    }
}



