package streams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapTwoDemo {
    public static void main(String args[]){
        List<String> stringList = Arrays.asList("pradeep", "natraj", "sarvajith", "akash", "padma");
        List<Integer> finalList = new ArrayList<>();
//        for(String name : stringList){
//            finalList.add(name.length());
//        }
//        System.out.println(finalList);
        finalList = stringList.stream().map(name -> name.length()).toList();
        System.out.println(finalList);
        stringList.stream().map(name->name.length()).forEach(System.out::println);
    }
}
