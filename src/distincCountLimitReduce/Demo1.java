package distincCountLimitReduce;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "bus", "car", "car", "bike");

        //Distinct
        List<String> distinctVehicles = vehicles.stream()
                .distinct()
                .toList();
        distinctVehicles.forEach(System.out::println);

        //Count
        long countVehicles = distinctVehicles.stream().count();
        System.out.println(countVehicles);

        //Limit
        List<String> limitedVehicles = distinctVehicles.stream().limit(3).toList();
        System.out.println(limitedVehicles);
    }

}

//1. Find unique objects in the collection