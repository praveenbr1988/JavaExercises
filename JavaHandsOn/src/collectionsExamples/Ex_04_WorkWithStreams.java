package collectionsExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_04_WorkWithStreams {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        // Iterate and print elements
        arrayList.stream().forEach(System.out::println);

        // Filter elements
        List<String> filteredList = arrayList.stream()
                .filter(element -> element.equals("B") || element.equals("D"))
                .collect(Collectors.toList());
        System.out.println(filteredList); // Output: [B, D]

        // Map elements
        List<String> mappedList = arrayList.stream()
                .map(element -> element.toLowerCase())
                .collect(Collectors.toList());
        System.out.println(mappedList); // Output: [a, b, c, d]

        // Reduce elements
        String concatenatedString = arrayList.stream()
                .reduce("", (result, element) -> result + element);
        System.out.println(concatenatedString); // Output: ABCD
    }
}

