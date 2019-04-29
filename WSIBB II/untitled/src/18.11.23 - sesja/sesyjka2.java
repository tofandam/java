public class sesyjka2 {
    public static void main(String[] args) {
        //masz jakąś tablice i wypisać która jest najczęstsza


        int[] tabInt = new int[11];
        tabInt[0] = 10;
        tabInt[1] = 12;
        tabInt[2] = 14;
        tabInt[3] = 90;
        tabInt[4] = 3;
        tabInt[5] = 2;
        tabInt[6] = 1;
        tabInt[7] = 1;
        tabInt[8] = 1;
        tabInt[9] = 14;
        tabInt[10] = 10;

        boolean spr = false;
        int tymcz = 0;
        int tymczdwa = 0;
        int[][] tabIntSpr = new int[11][2];

        for (int i = 0; i < tabInt.length; i++) {
            for (int j = 0; j < tabIntSpr.length; j++) {
                if(tabIntSpr[j][0] == tabInt[i]){
                    tabIntSpr[j][1]++;
                    spr = true;
                    break;
                }
            }
            if(spr == false){
                tabIntSpr[i][0] = tabInt[i];
            }
        }

        for (int i = 0; i < tabIntSpr.length; i++) {
            System.out.println(tabIntSpr[i][0] + " " + tabIntSpr[i][1]);

        }

        for (int i = 0; i < tabIntSpr.length; i++) {
            if(tymcz < tabIntSpr[i][1]){
                tymcz = tabIntSpr[i][1];
                tymczdwa = tabIntSpr[i][0];
            }
        }
        System.out.println(tymczdwa);



    }
}
