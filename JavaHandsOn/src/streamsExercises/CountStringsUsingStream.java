package streamsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountStringsUsingStream {
    public static void main(String[] args) {


        String[] arr = {"apple", "banana", "orange", "apple", "banana"};

        // Convert array to List
        List<String> list = Arrays.asList(arr);

        // Use Java 8 Streams to count occurrences
        Map<String, Long> fruitCount = list.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        // Print the result
        fruitCount.forEach((fruit, count) -> System.out.println(fruit + ": " + count));




    }

}

