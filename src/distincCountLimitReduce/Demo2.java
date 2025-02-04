package distincCountLimitReduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //count()
        long countEvenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .count();
        System.out.println(countEvenNumbers);

        //min()
        Optional<Integer> min = numbers.stream()
                .min((a, b) -> {
                    return a.compareTo(b);
                });
                //.min(Integer::compareTo);
        System.out.println(min.get());

        //max()
        Optional<Integer> max = numbers.stream()
                .max((a, b) -> {
                    return a.compareTo(b);
                });
        //.max(Integer::compareTo);
        System.out.println(max.get());
    }
}
