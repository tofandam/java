import java.util.Random;
import java.util.Scanner;

public class Gra_w_chińczyka{
    public static void main(String[] args) {

        Random r=new Random();
        int a=0, b=0, koniec=100;

        for (int i = 0; i <100 ; i++) {
            a=a+(1+r.nextInt(6));
            if(a==b) {
                b = 0;
            }
            if (a >= koniec) {
                System.out.println("Wygrał ziomek A");
                break;
            }
            b=b+(1+r.nextInt(6));
            if (b == a) {
                a=0;
            }
            if(b>=koniec){
                System.out.println("Wygrał ziomek B");
                break;
            }
            System.out.println("{"+a+", "+b+"}");




        }}
}