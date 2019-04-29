import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        List<Integer> w = new ArrayList<Integer>();

        w.add(12);
        w.add(53);
        w.add(12);
        w.add(9);
        w.add(75);
        w.add(53);
        w.add(53);
        w.add(4);
        System.out.println(w);
        System.out.println(w.size());
        System.out.println(w.get(3));

        List<String> ww = new ArrayList<>();
        ww.add("Abra adabra");
        ww.add("214343");
        ww.add("Trololo");
        System.out.println(ww);

        //unialne liczby z listy  'w'

        Set<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < w.size(); i++) {
            s.add(w.get(i));
        }
            System.out.println("W secie jest: " + s);

    }
}
