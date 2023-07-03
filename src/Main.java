// 第3回目課題：String型のListかMapを作成し、コンソール画面に表示してみる　
// （List内には複数入れること）
//　任意のプログラムで例外を起こしてみる
// →課題のソースコードをGitHubにPushしてレビューを依頼する。


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "Tama");
        map.put(13, "Hachi");
        map.put(7, "Goro");
        map.put(4, "Nana");
        map.put(5, "Koo");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            getValue＝catname , getkey = catage
            if (entry.getKey() % 2 == 0) {
                System.out.println(entry.getValue() + "は" + entry.getKey() + "歳です");
            } else if (entry.getKey() >= 10) {
                System.out.println(entry.getValue() + "は" + entry.getKey() + "歳で長生きです");
            } else {
                System.out.println(entry.getValue() + "　にゃー");
            }

        }


    }


}

