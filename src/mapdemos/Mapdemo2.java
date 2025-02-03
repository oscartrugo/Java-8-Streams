package mapdemos;

import java.util.Arrays;
import java.util.List;

public class Mapdemo2 {
    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");

        List<Integer> lenghts = vehicles.stream()
                .map(String::length)
                .toList();
        lenghts.forEach(System.out::println);
    }
}
