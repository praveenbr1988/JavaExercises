package collectionsExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex_05_SetExamples {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("X");
        linkedHashSet.add("Y");
        linkedHashSet.add("Z");


        //Using Iterator
        Iterator<String> hashSetIterator = hashSet.iterator();
        while (hashSetIterator.hasNext()) {
            System.out.println(hashSetIterator.next());
        }

        // Iterating Java 8 Lambda
        hashSet.forEach(element -> {
            System.out.println(element);
            System.out.println(element);
        });

        // Using Java 8 Streams
        linkedHashSet.stream().forEach(System.out::println);

        //General ForEach loop
        for (String element : linkedHashSet) {
            System.out.println(element);
        }

    }
}
