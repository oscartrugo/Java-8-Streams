package mapdemos;

import java.util.Arrays;
import java.util.List;

public class Mapdemo3 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);

        List<Integer> numbersMultiplied = numbers.stream()
                .map(n -> n*3)
                .toList();
        numbersMultiplied.forEach(System.out::println);
    }
}
