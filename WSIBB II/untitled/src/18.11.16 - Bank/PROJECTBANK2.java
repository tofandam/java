import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PROJECTBANK2 {
    public static void main(String[] args) throws Exception {


        System.out.println("Witaj, podaj PIN");
        Scanner konsola = new Scanner(System.in);
        String pin = "222";
        String podanypin = konsola.next();


        if(pin.equals(podanypin)) {
          //1. Stan konta 2. Wpłać 3.Wypłać 4. Wyjście

          boolean wyjsciee = true;
int stankonta = 100;
while (true){
    System.out.println("************************");
    System.out.println("*Opcje: \n*\t 1)Stan konta: \t\t*\n*\t2)Wpłać: \t\t*");
    System.out.println("*\t3)Wypłać\t\t*\n*\t4)Wyjście\t\t*");
    System.out.println("************************");

    System.out.println("Wybierz opcje: ");
    String opcja = konsola.next();

    switch (opcja){
        case "1": {
            System.out.println("Twój stan konta: "+stankonta);
            break;
        }
        case "2":{
            System.out.println("Podaj kwote ile chcesz wpłacić: ");
            String wplatanapis = konsola.next();
            if(wplatanapis.isEmpty()){
                System.out.println("Błędna ilość");
            }else{
                int wplata = Integer.parseInt(wplatanapis);
                stankonta+=wplata;
                System.out.println("Wpłacono pomyślnie");
            }
            break;
        }
        case "3":{
            System.out.println("Podaj kwote ile chcesz wpłacić: ");
            String wyplatanapis = konsola.next();
            if(wyplatanapis.isEmpty()){
                System.out.println("Błędna ilość");
            }else {
                int wyplata = Integer.parseInt(wyplatanapis);
                if (wyplata > stankonta) {
                    System.out.println("Nie masz tylu pieniędzy");
                }
                stankonta -= wyplata;
                System.out.println("Wypłacono pomyślnie");
                break;
            } }
        case "4": {
            System.out.println("Do widzenia!");

            break;
        } default:{
            System.out.println("Nie ma takiej opcji");
        }
        Thread.sleep(20000);//zatrzymuje program
        System.out.println("\n\n\n\n\n\n");

    }




}
        }else{
            System.out.println("Zły pin. Elo!");

        }}}