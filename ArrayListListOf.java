import java.util.ArrayList;
import java.util.List;

public class ArrayListListOf {
    public static void main(String[] args) {
        List<String> newStr = new ArrayList<String>(
                List.of("Coding","is","Fun"));
        System.out.println("ArrayList is " + newStr);

        System.out.println(newStr.size());
        newStr.remove(0);




    }
}