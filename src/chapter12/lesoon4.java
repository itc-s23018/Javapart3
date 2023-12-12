package chapter12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class lesoon4 {
    public static void main(String[] args) {
        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Longs", 14255));
        mountains.add(new Mountain("Elhert", 14433));
        mountains.add(new Mountain("Maroon", 14156));
        mountains.add(new Mountain("Castle", 14265));




        System.out.println("辞書順で出力");
       mountains.sort(Comparator.comparing(Mountain::getName));
       mountains.forEach(System.out::println);

       System.out.println();

       System.out.println("低い順で出力");
       mountains.sort(Comparator.comparing(Mountain::getHeight).reversed());
       mountains.forEach(System.out::println);


    }

}
