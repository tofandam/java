import java.util.Scanner;

public class Palidrom {
    public static void main(String[] args) {
        // 1. Odwrócić elementy tablicy.
        // 2. Ciąg Fibonaciego. 1,1,2,3,5,8,13,21... Wyznaczyć np. 10 element.
        // 3. Losuje od 1...100. No i ma mówić czy za małe, czy za duże :P
// sprawdzic czy liczba jest palidromem?


        String wort = "reliefpfpfeiller";
        char[] warray = wort.toCharArray();
        System.out.println(istPalindrom(warray));
    }

    public static boolean istPalindrom(char[] wort){
        if(wort.length%2 == 0){
            for(int i = 0; i < wort.length/2-1; i++){
                if(wort[i] != wort[wort.length-i-1]){
                    return false;
                }
            }
        }else{
            for(int i = 0; i < (wort.length-1)/2-1; i++){
                if(wort[i] != wort[wort.length-i-1]){
                    return false;
                }
            }
        }
        return true;

    }
}
