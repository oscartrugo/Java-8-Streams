import java.util.Arrays;
import java.util.List;

public class FilterDemo2 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Melisandre", "Sansa", "Jon", "Daenerys", "Joffery");

        List<String> filteredNames = names.stream()
                .filter(name -> name.length() > 6 && name.length() < 8)
                .toList();

        filteredNames.forEach(System.out::println);

    }
}


/*
* Length of name > 6 and <8
* */
