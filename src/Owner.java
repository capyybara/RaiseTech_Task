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
