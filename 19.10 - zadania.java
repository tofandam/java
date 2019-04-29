package com.company;

public class kkk {

    public static void main(String[] args) {
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



