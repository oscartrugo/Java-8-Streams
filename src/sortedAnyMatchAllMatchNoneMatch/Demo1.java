package sortedAnyMatchAllMatchNoneMatch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

    //Sorted
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(2, 4, 1, 3, 7, 5, 9);
        List<Integer> sorted = list1.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted); //ascending order

        List<Integer> reverseSorted = list1.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reverseSorted); //descending order

        //Strings
        List<String> names = Arrays.asList("John", "Mary", "Kim", "David", "Smith");
        List<String> sortedNames = names.stream()
                .sorted()
                .toList();
        System.out.println(sortedNames);

        List<String> reversedSortedNames = names.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(reversedSortedNames);
    }

}
