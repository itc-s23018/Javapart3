package chapter11_3;


import java.util.function.Supplier;

public class SubExamle {
    public static void main(String[] args) {
        Supplier<Double> randomValue = Math::random;
        System.out.println(randomValue.get());
    }
}
