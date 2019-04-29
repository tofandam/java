public class klasy {
    public static void main(String[] args) {
        krzeslo obiektkrzeslo = new krzeslo();

        System.out.println(obiektkrzeslo.rodzajmaterialu);
       // System.out.println(obiektkrzeslo.iloscnog);

      obiektkrzeslo.infookrzesle();

        krzeslo drugiekrzeslo = new krzeslo();
      drugiekrzeslo.iloscnog = 10;
      drugiekrzeslo.rodzajmaterialu = "Plastik";

        System.out.println("Drugie rzeslo ma: "+drugiekrzeslo.iloscnog);
        }
    }

