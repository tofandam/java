package niuzajecia1;

interface funkcjamatematyczna{
    double funkcja(double a, double b);
}

@FunctionalInterface
interface FuncMath{
    double funkcja_0(double n);
}

public class raz {

static void dzialaniematematyczne(double a, double b, funkcjamatematyczna funkcjamatematyczna){
    System.out.println(funkcjamatematyczna.funkcja(a,b));
}

    public static void main(String[] args) {

        funkcjamatematyczna dodaj = (a, b) ->a+b;
        funkcjamatematyczna pomnoz = (a, b) ->a*b;
        System.out.println(dodaj.funkcja(5,442));
        System.out.println(pomnoz.funkcja(5,3));

        FuncMath power = (n) -> Math.pow(n,2);

        dzialaniematematyczne(10, 10,(a,b) ->a/b);

        System.out.println(power.funkcja_0(99));


}

}
