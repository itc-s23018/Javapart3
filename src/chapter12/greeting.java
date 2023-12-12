package chapter12;

import java.util.ArrayList;
import java.util.List;

public class greeting {
    public static void main(String[] args) {
//        String[] greetings = {"おはよう", "こんにちは", "こんばんは"};
//
//        for (int i = 0; i <= 2; i++) {
//            System.out.println(greetings[i]);
//        }

        List<String> greetings = new ArrayList<>();
        greetings.add("おはよう");
        greetings.add("こんにちは");
        greetings.add("こんばんは");


        //forEachをつかって全要素を出力
        greetings.forEach(System.out::println);





//        greetings.add(1,"ありがとう");

//        for(String s : greetings){
//            System.out.println(s);
//        }
//
//        //greetingsリストの0番目の要素を取得して出力
//        String s = greetings.get(0);
//        System.out.println(s);
//
////        //その値が「おはよう」なら「Yes」と出力
//       if(s.equals("おはよう"))
//           System.out.println("Yes");
//
//
//
//        //greetingsリストが「good mornig」という要素が含まれているか
//        System.out.println(greetings.contains("good moring"));
//
//        //greetingsリストが空ではなかったら、要素の数を表示する
//        if (!greetings.isEmpty()){
//            System.out.println(greetings.size());
//        }

        //greetingsリストの2番目の要素を削除
//        greetings.remove(2);
//        System.out.println(greetings);


    }
}


