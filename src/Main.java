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



















