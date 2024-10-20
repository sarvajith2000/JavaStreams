package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FilterDemoThree {
    public static void main(String args[]){
        List<String> stringList = Arrays.asList("pradeep", "natraj", "sarvajith", "akash", null, "padma", null);
//        List<String> finalStringList = new ArrayList<>();
//        finalStringList = stringList.stream().filter(string -> string != null).toList();
//        System.out.println(finalStringList);
        stringList.stream().filter(Objects::nonNull).forEach(System.out::println);


    }
}