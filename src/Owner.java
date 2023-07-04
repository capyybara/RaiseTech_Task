import java.util.List;

public class Owner {

    public static void foo() throws ArrayIndexOutOfBoundsException{
        List<String> ownersname = List.of("近藤", "徳川", "今川", "伊達", "武田");
        for ( String name :ownersname){
            System.out.println(name);
        }
    }



    public static void main (String[] args){

        try{
            foo();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("例外だ");
        }

    }

}
