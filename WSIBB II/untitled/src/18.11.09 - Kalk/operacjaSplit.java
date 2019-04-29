public class operacjaSplit {
    public static void main(String[] args) {

       //operacja SPLIT
        String operacja = "5 + 10";
        String[] ddd = operacja.split( " ");
        int a = Integer.parseInt(ddd[0]);
        String znak = ddd[1];
        int b = Integer.parseInt(ddd[2]);
        System.out.println(operacja);
        System.out.println(a+znak+b);

      //
        String napis = "ddd";
        napis =(napis + "********************").substring(0,10);  // pokazuje tylko te 10 liter
        System.out.println(napis);

        for (int i = 0; i <100 ; i=i+2) {
            System.out.println(i);
        }
// wyswietl buu jezeli reszta z dzielenai =3, buu2 jezeli reszta =5 i buuu3 if reszta =15














    }
}
