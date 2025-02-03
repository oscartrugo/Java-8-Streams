package mapdemos;

import java.util.Arrays;
import java.util.List;

public class Mapdemo1 {
    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");

        List<String> vehiclesMapped = vehicles.stream()
                .map(String::toUpperCase)
                .toList();
        vehiclesMapped.forEach(System.out::println);
    }
}
