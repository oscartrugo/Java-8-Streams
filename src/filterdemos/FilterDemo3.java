package filterdemos;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FilterDemo3 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("cup", null, "forest", "sky", "book", null, "theatre");

        List<String> wordsFiltered = words.stream()
                //.filter(word -> word != null)
                //.filter(word -> Objects.nonNull(word))
                .filter(Objects::nonNull)
                .toList();

        wordsFiltered.forEach(System.out::println);

    }
}


/*
* Filter null from the collection
* */