public class wyswietl_co3_co5_i_co15 {
    public static void main(String[] args) {
        // wyswietl buu jezeli reszta z dzielenai =3, buu2 jezeli reszta =5 i buuu3 if reszta =15
        int a = 60;
        int reszta = 0;
        for (int i = 0; i < 60; i++) {

            int x;
            if (i % 15 == 0) {
                System.out.println(i + "BAA");
            } else if (i % 5 == 0) {

                System.out.println(i + "BEE");
            } else if (i % 3 == 0) {
                System.out.println(i + "BUU");

            }
        }
    }
}
