package streams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapThreeDemo {
    public static void main(String args[]){
        List<Integer> integerList = Arrays.asList(1,23,45,55);
        List<Integer> finalList = new ArrayList<>();
        finalList=integerList.stream().map(e->e*3).toList();
        System.out.println(finalList);


    }
}
