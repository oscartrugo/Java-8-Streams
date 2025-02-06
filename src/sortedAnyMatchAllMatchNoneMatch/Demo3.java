package sortedAnyMatchAllMatchNoneMatch;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
    public static void main(String[] args) {

        //findAny
//        List<String> stringList = Arrays.asList("one", "two", "three", "one");
//        List<String> stringList = Arrays.asList();
//        Optional<String> element = stringList.stream().findAny();
//        System.out.println(element.get());//NoSuchElementException

        //findFirst
        List<String> stringList = Arrays.asList("one", "two", "three", "one");
        Optional<String> element = stringList.stream().findFirst();
        System.out.println(element.get());
    }
}
