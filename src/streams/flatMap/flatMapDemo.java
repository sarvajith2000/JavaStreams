package streams.flatMap;

import java.util.Arrays;
import java.util.List;

public class flatMapDemo {
    public static void main(String args []){
        //map - >
        List<Integer> list1 = Arrays.asList(0, 1, 3, 5, 7, 6);
        List<Integer> finalList = list1.stream().map(n -> n + 10).toList();
        System.out.println(finalList);
        //flatMap - >
        List<Integer> list2 = Arrays.asList(0,1);
        List<Integer> list3 = Arrays.asList(3,4);
        List<Integer> list4 = Arrays.asList(5,6);
        List<Integer> list5 = Arrays.asList(7,8);
        List<List<Integer>> list = Arrays.asList(list2, list3, list4, list5);
        List<Integer> listFinal = list.stream().flatMap(e -> e.stream()).toList();
        System.out.println(listFinal);

        List<Integer> integerList = list.stream().flatMap(e->e.stream().map(n->n*4)).toList();
        System.out.println(integerList);




    }
}
