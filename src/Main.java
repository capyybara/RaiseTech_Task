// 第3回目課題：String型のListかMapを作成し、コンソール画面に表示してみる　
// （List内には複数入れること）
//　任意のプログラムで例外を起こしてみる
// →課題のソースコードをGitHubにPushしてレビューを依頼する。


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cats = List.of("Tama", "Hachi", "Goro", "Nana");
        List<String> dogs = new ArrayList<>();
        dogs.add("Pochi");
        dogs.add("Shiro");
        dogs.add("Kuro");

        // catsの名前を出力
        for (String cat : cats) {
            System.out.println(cat);
        }


        // dogの名前を出力
        for (String dog : dogs) {
            System.out.println(dog);
        }


    }




}

