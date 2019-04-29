public class cwiczenia{
    public static void sayHello(String name, String lastname, int age){
        if (name.length() == 0) {
            return;
        }
    System.out.println("Cześć "+name+" "+lastname+ " "+age);
}


 public static float calc(int[] numbers){
        int sum=0;
        for(int number : numbers){
            sum+= number;
        }
        return sum / (float) numbers.length;
 }

 public static boolean male(String name){
        int lastCharIndex = name.length() - 1;
        boolean famale = name.charAt(lastCharIndex) == 'a';
        if(famale){
            return false;
        }
        return true;
 }
    public static int findMin(int [] numbers) {
        int min = Integer.MAX_VALUE;
        for(int number : numbers) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }
    public static int findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers){
            if(max < number) {
                max = number;

            }
        }
        return max;
    }
   //żeby pokazało wszystie arg z funkcji
    public static void licz(int [] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    //zsumuje wszystie liczby z tablicy
    public static int sum(int[] numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }

    //liczenie sredniej tych liczb wyorzystujac sume
    public static float srednia(int [] numbers){
        return  sum(numbers)/ (float)numbers.length;
    }


    public static void main(String[] args) {
        System.out.println("elo");
        int [] values = {5, 0, 6, 12, 44, 101, 42, 12, 16, 120};
        sayHello("Patryk", "Figiel",14);
        sayHello("Iwona", "Lepisiewicz",10);
        sayHello("Dariusz", "",15);
        sayHello("","EWQ",15);
        float average = calc(values);
        System.out.println("Srednia "+ average);
        boolean male = male("Kamil");
        System.out.println("Kamil jest: "+ male);

        int [] numbers = {12, 5, 4, 16, 19, 12, 40, 99, 1203, -5};
        int min = findMin(numbers);
        int max = findMax(numbers);
        System.out.println("element min: " + min);
        System.out.println("element max: " + max);
        licz(numbers);
        int sum = sum(numbers);
        System.out.println();
        System.out.println("Suma liczb z tablicy wynosi: " + sum);
        float srednia= srednia(numbers);
        System.out.println("A ich średnia " + srednia);
        int aa= 10;
        int bb=25;

    }

}