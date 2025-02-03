import java.util.Arrays;
import java.util.List;

public class FilterDemo1 {
    public static void main(String[] args) {

        /*List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);*/

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        List<Integer> evenNumbers;

        evenNumbers = numbers.stream()
                .filter(number -> number%2==0)
                .toList();

        evenNumbers.forEach(System.out::println);
    }
}

/*
* Even numbers = impar
* Odd numbers = par
* */