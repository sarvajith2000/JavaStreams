package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String args[]) {
//        ArrayList<Integer> numberList = new ArrayList<Integer>();
//        numberList.add(10);
//        numberList.add(20);
//        numberList.add(30);
//        numberList.add(40);
//        System.out.println(numberList);

        List<Integer> integerList = Arrays.asList(10, 21, 23, 40, 50);
        System.out.println(integerList);
        List<Integer> evenNumberList = new ArrayList<>();

        //without using the streams
//        for (int n : integerList) {
//            if (n % 2 == 0) {
//                evenNumberList.add(n);
//            }
//        }
//        System.out.println(evenNumberList);

        //with streams
//        evenNumberList = integerList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
//        System.out.println(evenNumberList);
//        integerList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);





    }
}
