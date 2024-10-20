package streams.flatMap;

import java.util.Arrays;
import java.util.List;

public class flatMapDemoTwo {
    public static void main(String args[]){
        List<String> teamA = Arrays.asList("scot" , "tom" , "piyush");
        List<String> teamB = Arrays.asList("kumar" , "akash" , "sarayu");
        List<String> teamC = Arrays.asList("harsh" , "asif" ,"bhuvan");
        List<List<String>> finalTeam = Arrays.asList(teamA , teamB , teamC);

        List<String> team=finalTeam.stream().flatMap(e->e.stream()).toList();
        System.out.println(team);

    }
}
