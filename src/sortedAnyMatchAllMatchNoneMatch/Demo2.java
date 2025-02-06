package sortedAnyMatchAllMatchNoneMatch;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("One apple");
        fruits.add("One mango");
        fruits.add("Two apples");
        fruits.add("More grapes");
        fruits.add("Two guavas");

        //AnyMatch
        boolean result = fruits.stream().anyMatch(s -> s.startsWith("One"));
        System.out.println(result); //True

        //AllMatch
        result = fruits.stream().allMatch(s -> s.startsWith("One"));
        System.out.println(result); //False

        //noneMatch
        result = fruits.stream().noneMatch(s -> s.startsWith("Three"));
        System.out.println(result); //true, none element starts with "Three"
    }
}
