package PRÓBY;

public class klasy {
    public static void main1(String[] args) {
        ram obiektram = new ram();

        obiektram.InfomacjaOramie();



        System.out.println();
        ram drugiram = new ram();
        drugiram.iloscram = 10;
        drugiram.producent = "Huawei";
        drugiram.InfomacjaOramie();
        drugiram.InfomacjaOramie2();
        ram drugiprocesor = new ram();
        drugiprocesor.iloscrdzeni =5;
        drugiprocesor.producent1 = "COś";
        drugiprocesor.InfomacjaOramie();
        System.out.println("---------");

        procesor obiektprocesor = new procesor();
        obiektprocesor.InfomacjaOprocesorze();
        grafika obiektgrafika = new grafika();
        obiektgrafika.InfomacjaOgrafice();
        System.out.println("----------");
        obiektram.InfomacjaOramie2();
        obiektgrafika.InfomacjaOgrafice2();
    }
        public static void main(String[] args){
            main1(args);
        }


    }

