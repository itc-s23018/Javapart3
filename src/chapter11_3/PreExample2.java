package chapter11_3;

import java.util.function.Predicate;

public class PreExample2 {
    public static void main(String[] args) {

        //PreExampleインターフェースのtestメゾットを使う
        //外部変数words文字列　”apple banana cherry peach"
        //引数の文字列がword内に存在するかどうか？を返す

        String words = "apple, banana, cherry peach";
        Predicate<String> str = words::contains;

        System.out.println(str.test("apple"));
    }
}
