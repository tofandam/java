package com.company;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;

public class wpiszliczbepotega2 {
    public static void main(String[] args) {
     /*   Scanner s = new Scanner(System.in);
        long liczba1 = s.nextLong();
        for (int i = 0; i < liczba1; i++) {
            int a = 2;
            double z = Math.pow(a,i);
            if (z>liczba1){
                break;


            }
            System.out.println(z);
        }*/
Scanner s=new Scanner(System.in);
long a= s.nextLong();
        for (int i = 1; i <a ; i++) {
        int b=2;
        double x=Math.pow(b,i);
        int y=(int)x;
        if(y>a){
            break;
        }
            System.out.println(y);
        }
    }
}
