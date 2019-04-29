public class pazdziernik26{
    public static void main(String[] args) {
        System.out.println("haaaaaaaaaaaalooooo");

        int [] tabInt=new int[10];
       tabInt[0] = 1;
       tabInt[4] = 10;

        for (int i = 0; i < 10; i++) {
            tabInt[i] = i;
            System.out.println(tabInt[i]);
        }

        for (int i = 0; i <10 ; i++) {

        }

        System.out.println(tabInt.length);

        String[] tabString = new String[3];
        tabString[0] = "To jest 1 i 0 element w tablicy";
        tabString[1] = "To jest 2 element w tablicy";
        tabString[2] = "To jest 3 element w tablicy";


        for (int i = 0; i <tabString.length; i++) {
            System.out.println(tabString[i]);
        }

        char[] tabChar = new char[]{'d','1','2','5'};

        System.out.println(tabChar[3]);


    }
}
