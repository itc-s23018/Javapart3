package Exercise;

import chapter11_2.Apple;

import java.util.Arrays;
import java.util.Comparator;

public class E12_2_1_2 {
    public static void main(String[] args) {
        var list = Arrays.asList(
                new Apple(320, "red"),
                new Apple(280, "green"),
                new Apple(350, "green"),
                new Apple(330, "red"),
                new Apple(250, "red"));

        list.sort(Comparator.comparing(Apple::weight).reversed());
        list.forEach(System.out::println);
    }
}
