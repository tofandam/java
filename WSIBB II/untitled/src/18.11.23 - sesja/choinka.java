public class choinka {
    public static void main(String[] args) {
        System.out.println("       *");
        System.out.println("\t*******\t");
        System.out.println("     *****");
        System.out.println("      ***");
        System.out.println("\t   *\t");


int b = 100;
int y = 1;
        System.out.print("*");
        for (int i = 0; i <=100/2 ; i++) {

            for (int j = b; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println("");
            for (int j = 0; j <y ; j++) {
                System.out.print(" ");
            }
            y=y+1;
            System.out.print(" ");
        b=b-2;
        }



    }
}
