package PRÓBY;

public class gatunek {
    String rodzaj;
    String gatunek;
    int liczbach;
    int x;
    String opis;

    public String podajpelnanazwe(){
        return rodzaj + " "+gatunek;
    }
    public int podajch(){
        return liczbach/2;
    }
    public void wypisz(){
        System.out.println("Rodzaj: "+ rodzaj);
    }

}
