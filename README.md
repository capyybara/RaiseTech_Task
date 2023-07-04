# RaiseTech_Task
## 第3回目課題

```
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> catdata = new HashMap<>();
        catdata.put(2, "Tama");
        catdata.put(13, "Hachi");
        catdata.put(7, "Kevin");
        catdata.put(4, "Goro");
        catdata.put(5, "Hana");

        for (Map.Entry<Integer, String> entry : catdata.entrySet()) {
            System.out.println(entry.getValue() + "は" + entry.getKey() + "歳です");
        }

    }

}


```

***

### 例外処理

```
public class Owner {

    public static void main(String[] args) {

        String[] catowner = {"近藤", "徳川", "今川", "伊達", "武田"};
        int index = 6;

        for (String name : catowner)
            System.out.println("猫の飼い主は" + name + "さんです");

        try {
            System.out.println(catowner[index]);
            throw new Exception();
        } catch (Exception e) {
            System.out.println("配列の範囲外です");
        }


    }


}

```
