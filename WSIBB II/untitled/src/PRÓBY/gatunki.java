package PRÓBY;

public class gatunki {
    public static void main(String[] args) {
        gatunek szympans = new gatunek();
        szympans.rodzaj = "Pan";
        szympans.gatunek = "tryglodytes";
        szympans.liczbach = 48;
        szympans.x = 24;
        szympans.opis = "Małpia morda";

        gatunek tyton = new gatunek();
        tyton.rodzaj = "Nicotiana";
        tyton.gatunek= "tabacum";

        System.out.println(szympans.podajpelnanazwe());
        System.out.println("opis: "+ szympans.opis);
    }
}
