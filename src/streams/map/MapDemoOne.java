package streams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemoOne {
    public static void main(String args[]){
        List<String> stringList = Arrays.asList("pradeep", "natraj", "sarvajith", "akash", "padma");

        List<String> finalListUpperCase = new ArrayList<>();

        //before java 8 or without using the streams.
//        for(String name : stringList){
//            finalListUpperCase.add(name.toUpperCase());
//        }
//        System.out.println(finalListUpperCase);
        finalListUpperCase = stringList.stream().map(name -> name.toUpperCase()).toList();
        System.out.println(finalListUpperCase);





    }
}
