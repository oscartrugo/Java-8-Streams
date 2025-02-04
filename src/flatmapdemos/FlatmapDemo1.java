package flatmapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatmapDemo1 {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Map
//        list1.stream()
//                .map(n -> n + 10)
//                .toList()
//                .forEach(System.out::println);

        //Flatmap
        List<Integer> lst1 = Arrays.asList(1, 2);
        List<Integer> lst2 = Arrays.asList(3, 4);
        List<Integer> lst3 = Arrays.asList(5, 6);

        List<List<Integer>> finalList = Arrays.asList(lst1, lst2, lst3);

        /*
        * finalList contains 3 collections
        * flatmap adds each collecion and adds it to the stream
        * */
        List<Integer> finalResults = finalList.stream()
                .flatMap(list -> list.stream().map(n -> n + 10))
                .toList();
        System.out.println("finalResults = " + finalResults);
    }

}
