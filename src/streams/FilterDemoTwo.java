package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemoTwo {
    public static void main(String args[]) {
        List<String> names = Arrays.asList("sarvajith", "upadhyaya", "kumarans", "guru");
        List<String> longNames = new ArrayList<>();
//        longNames = names.stream().filter(n -> n.length() > 6 && n.length() <= 8).toList();
//        System.out.println(longNames);

        names.stream().filter(n -> n.length() > 6 && n.length() <= 8).forEach(System.out::println);






    }
}
