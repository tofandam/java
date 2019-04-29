public class trojkategipski {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 1; i < 101; i++) {
            int a = i;
            for (int j = 1; j < 101; j++) {
                int b = j;
                for (int k = 1; k < 101; k++) {
                    int c = k;
                    if (a*a+b*b==c*c){
                        System.out.println("liczby a="+a+" b="+b+" c="+c+" spełniają warunki");
                        x++;
                    }

                }

            }
        }
        System.out.println(x);
    }
}