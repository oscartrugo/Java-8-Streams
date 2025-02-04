package flatmapdemos;

import java.util.Arrays;
import java.util.List;

public class FlatmapDemo2 {
    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("Scott", "David", "John");
        List<String> teamB = Arrays.asList("Mary", "Luna", "Tom");
        List<String> teamC = Arrays.asList("Ken", "Jony", "Kitty");

        List<List<String>> playersInWorldCup = Arrays.asList(teamA, teamB, teamC);

        List<String> names = playersInWorldCup.stream()
                .flatMap(team -> team.stream())
                .toList();

        System.out.println(names);
    }
}
