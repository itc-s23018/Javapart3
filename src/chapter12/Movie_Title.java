package chapter12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Movie_Title {
    public static void main(String[] args) {
        List<String> MCU = new ArrayList<>();
        MCU.add("Thor:Love and Thunder");
        MCU.add("Avengers:Endgame");
        MCU.add("The Marvels");
        MCU.add("Iron Man");
        MCU.add("2008");


        MCU.sort(Comparator.naturalOrder());

        MCU.forEach(System.out::println);
    }

}
