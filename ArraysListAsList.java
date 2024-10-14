import java.util.ArrayList;
import java.util.Arrays;

public class ArraysListAsList {
    public static void main(String[] args) {
        ArrayList<String> ParamList = new ArrayList<String>(
                Arrays.asList("I","Love","Indore"));
        System.out.println("Array is" + ParamList);

    }
}