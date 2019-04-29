public class jakparzystatozeroTablica {
    public static void main(String[] args) {

        int [] tab = new int[30];



        for (int i = 0; i <tab.length ; i=i+2) {

            tab[i] = 1;
        }
        for (int i = 1; i <tab.length ; i=i+2) {
          tab[i] = 0;
        }
        for (int i = 0; i <tab.length ; i++) {
            System.out.print(tab[i]+", ");
        }

    }
}
