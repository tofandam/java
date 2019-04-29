import java.util.Scanner;

public class sesyjka3 {
    public static void main(String[] args) {
        System.out.println("    **");
        System.out.println("   *  * ");
        System.out.println("  *    *");
        System.out.println("   *  *");
        System.out.println("    **");


        char znakGwiazdki = '*';

        int poziomy = 4;

        for (int i = 0; i < poziomy; i++) {
            for (int j = 0; j < poziomy * 2; j++) {
                if (j < (poziomy - i) || j > (poziomy + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print(znakGwiazdki);
                }
            }
            System.out.println();
        }

        int b = 10;
        int y = 1;
        System.out.print("*");
        for (int i = 0; i <=10/2 ; i++) {

            for (int j = b; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println("");
            for (int j = 0; j <y ; j++) {
                System.out.print(" ");
            }
            y=y+1;
            System.out.print(" ");
            b=b-3;
        }


    }}
