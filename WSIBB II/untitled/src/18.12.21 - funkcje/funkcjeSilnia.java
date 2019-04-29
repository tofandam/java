public class funkcjeSilnia {
  public static long silnia(int n) {
      long s =1;
      for (int i = 1; i <=n ; i++) {
          s = s*i;
      }
      return s;
  }

  public static long silnia1(int m){
      long d=1;
      for (int i = 1; i <=m; i++) {
          d=d*i;
      }
      return d;
  }
      public static long silniaa(int liczba){
          long a=1;
          for (int i = 1; i <=liczba ; i++) {
              a = a * i;
          }
          return a;

      }

    public static void main(String[] args) {
        int n = 3;
        int m = 8;
        int l = 5;
        System.out.println("Silnia z "+ n + " wynosi " +silnia(n));
        System.out.println("Silnia z "+ m + " wynosi "+ silnia1(m));
        System.out.println(silniaa(5));
  }


//zrobic silnie z 5 np

}

