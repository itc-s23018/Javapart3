package chapter11_2;

import java.util.function.Predicate;
import java.util.Scanner;

public class PredExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Predicate<Integer> pred = n -> n >= 18;
        boolean result = pred(N, pred);

        System.out.println(result);

    }

    public static boolean pred(int number, Predicate<Integer> pr){
        return pr.test(number);

    }
}
