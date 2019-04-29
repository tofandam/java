public class samochod {
    public String kolor ;
    public String kolor1="Czerwony";
    public int iloscdrzwi ;
    public int iloscdrzwi1 = 5;
    public silnik silnik;
    void info(){
        System.out.println("Kolor "+kolor );
    }

    public static void main(String[] args) {
        silnik obiektsilnik = new silnik();
        System.out.print("Mój samochód ma ");
        System.out.println(obiektsilnik.ilosckoni+ " koni");
    }

}
